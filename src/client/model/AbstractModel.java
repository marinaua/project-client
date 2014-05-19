/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package client.model;

import client.service.transfer.TransferClient;
import com.marina.message.ResponseMsg;
import viewports.ErrorForm;

/**
 *
 * @author Marik
 */
public abstract class AbstractModel {
    public ResponseMsg serverRequestData(String command, Object object) {
        ResponseMsg msg = TransferClient.send(command, object);
        if(!msg.isSuccess()){
            ErrorForm errorForm = new ErrorForm(msg.getData());
            //errorForm.setException(msg.getData());
        }
        return msg;
    }
}
