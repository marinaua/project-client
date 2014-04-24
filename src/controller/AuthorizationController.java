/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import client.model.AuthorizationModel;
import java.io.IOException;

/**
 *
 * @author Marik
 */
public class AuthorizationController {
    public void authorize(String login, String password) throws IOException, ClassNotFoundException{
        AuthorizationModel authorizationModel = new AuthorizationModel(login, password);
        authorizationModel.authorization(login, password);
    }
}
