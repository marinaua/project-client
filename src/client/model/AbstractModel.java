/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package client.model;

import client.service.transfer.TransferClient;
import com.marina.message.ResponseMsg;
import frame.ErrorForm;
import java.io.IOException;

/**
 *
 * @author Marik
 */
public abstract class AbstractModel {
    public ResponseMsg serverRequestData(String command, Object object) throws IOException, ClassNotFoundException{
        ResponseMsg msg = TransferClient.send(command, object);
        if(msg.isError()){
            ErrorForm errorForm = new ErrorForm(msg.getData());
            //errorForm.setException(msg.getData());
        }
        return msg;
    }
}
