/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import client.model.CreditModel;
import com.marina.entity.credit.Credit;
import java.util.ArrayList;

/**
 *
 * @author Marik
 */
public class CreditController extends AbstractController {
    CreditModel creditModel;
    
    public CreditController(){
        creditModel = new CreditModel();
    }
    
    public ArrayList<Credit> getCreditsList() {
        return creditModel.gerCredits();
    }

    public void updateStatus(Credit credit) {
        creditModel.payCredit(credit);
    }
    
}
