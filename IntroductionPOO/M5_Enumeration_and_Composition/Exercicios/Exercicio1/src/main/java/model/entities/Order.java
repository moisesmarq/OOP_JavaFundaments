package main.java.model.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import main.java.model.enums.OrderStatus;

public class Order {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> orderItems = new ArrayList<>();

    public Order() {
    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public void addItem(OrderItem item) {
        orderItems.add(item);
    }

    public void removeItem(OrderItem item) {
        orderItems.remove(item);
    }

    public double total() {
        double total = 0;
        for (OrderItem orderItem : orderItems) {
            total += orderItem.subTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Order moment: ").append(sdf.format(this.moment)).append("\n");
        sb.append("Order status: ").append(this.status).append("\n");
        sb.append("Client: ").append(client).append("\n");
        sb.append("Order itens: ").append("\n");
        for (OrderItem orderItem : orderItems) {
            sb.append(orderItem.toString()).append("\n");
        }
        sb.append("Total price: $").append(total());
        return sb.toString();
    }
    
    
}

