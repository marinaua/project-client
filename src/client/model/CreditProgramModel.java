/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package client.model;

import client.service.transfer.TransferClient;
import com.marina.entity.creditprogram.CreditProgram;
import com.marina.message.ResponseMsg;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Marik
 */
public class CreditProgramModel extends AbstractModel {

    public ArrayList<CreditProgram> gerCreditPrograms() {
        ResponseMsg msg = serverRequestData("CreditProgram.getCreditPrograms", null);
        return (ArrayList<CreditProgram>)msg.getData();
    }

    public void updateCreditProgram(CreditProgram creditProgram) {
        ResponseMsg msg = serverRequestData("CreditProgram.updateCreditProgram", creditProgram);
    }
}
