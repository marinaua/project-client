/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package client.model;

import client.service.transfer.TransferClient;
import com.marina.entity.creditprogram.CreditProgram;
import com.marina.entity.order.Order;
import com.marina.message.ResponseMsg;
import java.util.ArrayList;

/**
 *
 * @author Marik
 */
public class OrderModel extends AbstractModel {
    public ArrayList<Order> gerOrders() {
        ResponseMsg msg = serverRequestData("Order.getOrders", null);
        return (ArrayList<Order>)msg.getData();
    }

    public void makeOrder(CreditProgram order) {
        ResponseMsg msg = serverRequestData("Order.makeOrder", order);
    }

    public ArrayList<Order> getManagersOrdersList() {
        ResponseMsg msg = serverRequestData("Order.getManagersOrders", null);
        return (ArrayList<Order>)msg.getData();
    }

    public void updateStatusAccepted(Order order) {
        ResponseMsg msg = serverRequestData("Order.updateStatusAccepted", order);
    }

    public void updateStatusDeclined(Order order) {
        ResponseMsg msg = serverRequestData("Order.updateStatusDeclined", order);
    }
}
