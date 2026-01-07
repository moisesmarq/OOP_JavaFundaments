package main.java;

import java.util.Date;

import main.java.model.Order;
import main.java.model.enums.OrderStatus;

public class Start {
    public static void main(String[] args) {
        Order order = new Order(123, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("Delivered".toUpperCase());
        
        System.out.println(os1);
        System.out.println(os2);
    }
}
