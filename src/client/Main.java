/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import client.service.transfer.TransferClient;
import com.marina.entity.user.User;
import com.marina.message.ResponseMsg;
import frame.ClientForm;
import frame.ErrorForm;
import frame.LogForm;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marik
 */
public class Main {
    public static User currentUser;
    public static void main(String[] args) throws Exception {
//        User user = new User();
//        user.setLogin("vawnjamail.ru");
//        user.setPassword("5678");
//        
//        ResponseMsg msg = TransferClient.send("Authorization.login", user);
//        new ErrorForm(msg.getData());
//        User responseUser = (User)msg.getData();
//        String role = responseUser.getRole();
//        userShower.showForm(role);
//        if(role.equals("client")){
//            ClientForm cf = new ClientForm();
//        }
        
        currentUser = new User();
        new Bootstrap();
        
//        Thread t = new Thread(new Runnable() {
//
//            @Override
//            public void run() {
//                LogForm lf = new LogForm();
//                lf.setVisible(true);
//                try {
//                    Thread.sleep(3000);
//                } catch (InterruptedException ex) {
//                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//                }
//                lf.setVisible(false);
//                ClientForm cf = new ClientForm();
//                cf.setVisible(true);
//            }
//        });
//        t.start();

        
    }
}
