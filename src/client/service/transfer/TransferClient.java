/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.service.transfer;

import com.marina.message.RequestMsg;
import com.marina.message.ResponseMsg;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
    private static ObjectOutputStream out;
    private static BufferedReader userIn;
    
    private static void createConnection() {
        try {
            clientSocket = new Socket(hostname, port);
            //Get object from server
            out = new ObjectOutputStream(clientSocket.getOutputStream());
            //Send object to server
            networkIn = new ObjectInputStream(clientSocket.getInputStream());
            
            userIn = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Connected to echo server");
        } catch (IOException ex) {
            Logger.getLogger(TransferClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ResponseMsg send(String command, Object object) throws IOException, ClassNotFoundException {
        if (clientSocket == null) {
            createConnection();
        }
        out.writeObject(new RequestMsg(command, object));
        out.flush();
        
        ResponseMsg response = (ResponseMsg) networkIn.readObject();
        System.out.println("response: " + response);
        closeConnection();
        
        return response;
    }

    private static void closeConnection() {
        if (clientSocket != null) {
            try {
                networkIn.close();
                out.close();
                clientSocket.close();
            } catch (IOException ex) {
                Logger.getLogger(TransferClient.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

}
