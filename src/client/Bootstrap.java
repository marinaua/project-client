/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package client;

import controller.IndexController;

/**
 *
 * @author Marik
 */
public class Bootstrap {

    public Bootstrap() {
        IndexController indexController = new IndexController();
        indexController.indexAction();
    }
    
}
