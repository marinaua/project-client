/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.model;

import com.marina.entity.user.User;
import frame.AdministratorViewport;
import viewports.ClientViewport;
import frame.ManagerViewport;
import javax.swing.JFrame;
import viewports.IndexViewport;

/**
 *
 * @author Marik
 */
public class ViewportModel extends AbstractModel {

    JFrame currentViewPort;

    public void render(User user) {
        String role = user.getRole();
        if (currentViewPort != null) {
            currentViewPort.setVisible(false);
        }
        switch (role) {
            case "client":
                currentViewPort = new ClientViewport();
                break;
            case "manager":
                currentViewPort = new ManagerViewport();
                break;
            case "administrator":
                currentViewPort = new AdministratorViewport();
                break;
            case "guest":
                currentViewPort = new IndexViewport();
                break;
        }
        
    }

}
