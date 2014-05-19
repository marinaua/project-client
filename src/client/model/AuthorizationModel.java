/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.model;

import client.Main;
import com.marina.entity.user.User;
import com.marina.message.ResponseMsg;

/**
 *
 * @author Marik
 */
public class AuthorizationModel extends AbstractModel {

    public AuthorizationModel() {
      
    }
    
    public ResponseMsg authorization(String login, String password) {
        Main.currentUser.setLogin(login);
        Main.currentUser.setPassword(password);
        ResponseMsg response = serverRequestData("Authorization.login", Main.currentUser);
        Main.currentUser = (User)response.getData();
        Main.viewportModel.render(Main.currentUser);
        
        return response;
    }
    
    public ResponseMsg logout(){
        return null;
    }
}
