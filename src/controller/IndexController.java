/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import client.Main;
import viewports.IndexViewport;

/**
 *
 * @author Marik
 */
public class IndexController extends AbstractController {

    public void indexAction() {
        Main.viewportModel.render(Main.currentUser);
    }
    
}
