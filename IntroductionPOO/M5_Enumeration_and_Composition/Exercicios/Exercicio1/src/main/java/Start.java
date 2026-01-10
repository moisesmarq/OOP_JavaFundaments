package M5_Enumeration_and_Composition.Exercicios.Exercicio1.src.main.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import M5_Enumeration_and_Composition.Exercicios.Exercicio1.src.main.java.model.entities.*;
import M5_Enumeration_and_Composition.Exercicios.Exercicio1.src.main.java.model.enums.OrderStatus;

public class Start {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter cliente data: ");
        System.out.print("Name: ");
        String name = scan.next();
        System.out.print("Email: ");
        String email = scan.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(scan.next());

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String status = scan.next();
        System.out.print("How many times to this order? ");
        int quantityOrder = scan.nextInt();

        Order order = new Order(new Date(), OrderStatus.valueOf(status), client);
    
        for (int q = 1; q <= quantityOrder;  q++){
            System.out.println("Enter #" + q + " item data:");
            System.out.print("Product name: ");
            String productName = scan.next();
            System.out.print("Product price: ");
            double price = scan.nextDouble();
            System.out.print("Quantity: ");
            int quantityProduct = scan.nextInt();
            Product product = new Product(productName, price);

            OrderItem orderItem = new OrderItem(product, quantityProduct, product.getPrice());
            order.addItem(orderItem);
        }    

        scan.close();
        
        System.out.println("ORDER SUMMARY: ");
        System.out.print(order);
    }
}
