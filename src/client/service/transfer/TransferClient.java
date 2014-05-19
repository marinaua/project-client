/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.service.transfer;

import client.Main;
import com.marina.exception.NetworkException;
import com.marina.message.RequestMsg;
import com.marina.message.ResponseMsg;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marik
 */
public class TransferClient {

    private static final String hostname = "localhost";
    private static final int port = 12111;
    private static Socket clientSocket;
    private static ObjectInputStream networkIn;
    private static ObjectOutputStream networkOut;
    private static Logger transferClientLogger = Logger.getLogger(TransferClient.class.getName());
   
    
    private static void createConnection() {
        try {
            clientSocket = new Socket(hostname, port);
            //Get object from server
            networkOut = new ObjectOutputStream(clientSocket.getOutputStream());
            //Send object to server
            networkIn = new ObjectInputStream(clientSocket.getInputStream());
           
        } catch (IOException ex) {
            transferClientLogger.log(Level.SEVERE, "Exception in creating connection: ", ex);
        }
    }

    public static ResponseMsg send(String command, Object object) {
        if (clientSocket == null) {
            createConnection();
        }
        try {
            networkOut.writeObject(new RequestMsg(Main.currentUser, command, object));
            networkOut.flush();
        } catch (IOException ex) {
            transferClientLogger.log(Level.SEVERE, "Exception in sending message: ", ex);
        }
        
        
        ResponseMsg response = new ResponseMsg(false, "", new NetworkException());
        
        try {
            response = (ResponseMsg) networkIn.readObject();
//            System.out.println("response: " + response);
        } catch (IOException | ClassNotFoundException ex) {
            transferClientLogger.log(Level.SEVERE, "Exception in receiving message: ", ex);
        }
        
        closeConnection();
        
        return response;
    }

    private static void closeConnection() {
        if (clientSocket != null) {
            try {
                networkIn.close();
                networkOut.close();
                clientSocket.close();
                
                clientSocket = null;
                networkOut= null;
                networkIn = null;
//                System.out.println("Connection closed");
            } catch (IOException ex) {
                transferClientLogger.log(Level.SEVERE, "Exception in closing connection: ", ex);
            }

        }
    }

}
