/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import client.model.ViewportModel;
import com.marina.entity.user.User;
import controller.IndexController;

/**
 *
 * @author Marik
 */
public class Main {
    public static User currentUser;
    public static ViewportModel viewportModel;
    
    public static void main(String[] args) throws Exception {
        
        new Bootstrap();
        
        IndexController indexController = new IndexController();
        indexController.indexAction();      
    }
}
