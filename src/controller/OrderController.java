/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import client.model.OrderModel;
import com.marina.entity.creditprogram.CreditProgram;
import com.marina.entity.order.Order;
import java.util.ArrayList;

/**
 *
 * @author Marik
 */
public class OrderController extends AbstractController {
    
    protected OrderModel orderModel;

    public OrderController() {
        orderModel = new OrderModel();
    }
    
    public ArrayList<Order> getOrdersList(){ 
        return orderModel.gerOrders();
    }

    public void makeOrder(CreditProgram order) {
        orderModel.makeOrder(order);
    }

    public ArrayList<Order> getManagersOrdersList() {
        return orderModel.getManagersOrdersList();
    }

    public void updateStatusAccepted(Order order) {
        orderModel.updateStatusAccepted(order);
    }

    public void updateStatusDeclined(Order order) {
        orderModel.updateStatusDeclined(order);
    }
}
