/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package client;

import client.model.ViewportModel;
import com.marina.entity.user.User;
import java.io.IOException;
import java.util.logging.LogManager;

/**
 *
 * @author Marik
 */
public class Bootstrap {
    
    public Bootstrap() {
        try {
            LogManager.getLogManager().readConfiguration(
            Main.class.getResourceAsStream("/loggerconfig/logging.properties"));
        } catch (IOException e) {
            System.err.println("Could not setup logger configuration: " + e.toString());
        }
         Main.viewportModel = new ViewportModel();
         Main.currentUser = new User();
         Main.currentUser.setRole("guest");
    }
    
}
