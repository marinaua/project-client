/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package frame;

import client.service.transfer.TransferClient;
import com.marina.entity.creditprogram.CreditProgram;
import com.marina.message.ResponseMsg;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marik
 */
public class MyTableModel extends DefaultTableModel{
    
    private static final long serialVersionUID = 1L;
    ResponseMsg msg;
    ArrayList<CreditProgram> creditProgramList;

    public MyTableModel() throws IOException, ClassNotFoundException {
        this.msg = TransferClient.send("CreditProgramsData.getCreditPrograms", null);
        creditProgramList = (ArrayList<CreditProgram>)msg.getData();
    }
}
