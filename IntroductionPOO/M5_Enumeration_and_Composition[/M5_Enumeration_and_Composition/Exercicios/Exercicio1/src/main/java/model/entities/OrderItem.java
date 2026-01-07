package main.java.model.entities;

public class OrderItem {
    private int quantity;
    private double price;

    private Product product;    

    public OrderItem(){

    }

    public OrderItem(Product product, int quantity, double price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public double subTotal(){
        return price * quantity;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(product.getName()).append(", ");
        sb.append("Quantity: ").append(quantity).append(", ");
        sb.append("Subtotal: $").append(String.format("%.2f", price));
    
        return sb.toString();
    }
}
