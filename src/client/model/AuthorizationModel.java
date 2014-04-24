/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.model;

import client.Main;
import com.marina.message.ResponseMsg;
import java.io.IOException;

/**
 *
 * @author Marik
 */
public class AuthorizationModel extends AbstractModel {

    public AuthorizationModel(String login, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ResponseMsg authorization(String login, String password) throws IOException, ClassNotFoundException {
        Main.currentUser.setLogin(login);
        Main.currentUser.setLogin(password);
        
        return serverRequestData("Authorization.login", Main.currentUser);
    }
}
