/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import client.service.transfer.TransferClient;
import com.marina.entity.user.AbstractUser;
import com.marina.entity.user.Client;
import com.marina.entity.user.Guest;
import com.marina.message.ResponseMsg;

/**
 *
 * @author Marik
 */
public class Main {

    public static void main(String[] args) throws Exception {
        AbstractUser guest = new Guest();
        guest.setName("Ivan");
        guest.setSurname("Ivanov");
        ResponseMsg msg = TransferClient.send("login", guest);
        System.out.println(msg);
        
    }
}
