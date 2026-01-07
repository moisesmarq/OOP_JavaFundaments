package IntroductionPOO.M1_Objects_Concepts.ExercicioExemploPOO.Exemplos.Exemplo2.src.main.java;

import java.util.Locale;
import java.util.Scanner;

import IntroductionPOO.M1_Objects_Concepts.ExercicioExemploPOO.Exemplos.Exemplo2.src.main.java.entities.Product;

public class Start {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.setName(scan.nextLine());
        System.out.print("Price: ");
        product.setPrice(scan.nextDouble());
        System.out.print("Quantity in stock: ");
        product.setQuantityInStock(scan.nextInt());
        System.out.println("");
        
        System.out.println("Product data: " + product);
        
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = scan.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.print("Enter the number of products to be added in stock: ");
        quantity = scan.nextInt();
        product.removeProduct(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

    }
}
