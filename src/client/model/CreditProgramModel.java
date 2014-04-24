/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package client.model;

import client.service.transfer.TransferClient;
import com.marina.message.RequestMsg;
import com.marina.message.ResponseMsg;
import java.io.IOException;

/**
 *
 * @author Marik
 */
public class CreditProgramModel {
    public String[][] getCreditPrograms() throws IOException, ClassNotFoundException{
        ResponseMsg msg = TransferClient.send("CreditProgram.getCreditPrograms", null);
    }
}
