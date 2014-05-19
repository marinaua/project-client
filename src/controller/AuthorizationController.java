/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import client.model.AuthorizationModel;
import com.marina.message.ResponseMsg;
import java.io.IOException;

/**
 *
 * @author Marik
 */
public class AuthorizationController extends AbstractController {
    public void authorize(String login, String password) {
        AuthorizationModel authorizationModel = new AuthorizationModel();
        authorizationModel.authorization(login, password);
    }
}
