/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package client.model;

import com.marina.entity.credit.Credit;
import com.marina.message.ResponseMsg;
import java.util.ArrayList;

/**
 *
 * @author Marik
 */
public class CreditModel extends AbstractModel {

    public ArrayList<Credit> gerCredits() {
        ResponseMsg msg = serverRequestData("Credit.getCredits", null);
        return (ArrayList<Credit>)msg.getData();
    }

    public void payCredit(Credit credit) {
        ResponseMsg msg = serverRequestData("Credit.payCredit", credit);
    }
    
}
