/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import client.model.CreditProgramModel;
import com.marina.entity.creditprogram.CreditProgram;
import java.util.ArrayList;

/**
 *
 * @author Marik
 */
public class CreditProgramController extends AbstractController {
    CreditProgramModel creditProgramModel;
    
    public CreditProgramController() {
        creditProgramModel = new CreditProgramModel();
    }

    public ArrayList<CreditProgram> getCreditProgramsList() {
        return creditProgramModel.gerCreditPrograms();
    }

    public void updateCreditProgram(CreditProgram creditProgram) {
        creditProgramModel.updateCreditProgram(creditProgram);
    }
}
