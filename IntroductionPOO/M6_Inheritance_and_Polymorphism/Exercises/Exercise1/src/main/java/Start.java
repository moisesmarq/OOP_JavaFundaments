package M6_Inheritance_and_Polymorphism.Exercises.Exercise1.src.main.java;

import M6_Inheritance_and_Polymorphism.Exercises.Exercise1.src.main.java.model.entities.ImportedProduct;
import M6_Inheritance_and_Polymorphism.Exercises.Exercise1.src.main.java.model.entities.Product;
import M6_Inheritance_and_Polymorphism.Exercises.Exercise1.src.main.java.model.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Start {
    public static void main(String[] args) throws ParseException {
        System.out.println("Exercise 1 - Inheritance and Polymorphism");

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> list_products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char type = scan.next().charAt(0);

            if (type == 'c') {
                System.out.print("Name: ");
                String name = scan.next();
                System.out.print("Price: ");
                double price = scan.nextDouble();
                list_products.add(new Product(name, price));

            } else if (type == 'u') {
                System.out.print("Name: ");
                String name = scan.next();
                System.out.print("Price: ");
                double price = scan.nextDouble();
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date date = sdf.parse(scan.next());
                list_products.add(new UsedProduct(name, price, date));
            } else if (type == 'i') {
                System.out.print("Name: ");
                String name = scan.next();
                System.out.print("Price: ");
                double price = scan.nextDouble();
                System.out.print("Customs fee: ");
                double customsFee = scan.nextDouble();
                list_products.add(new ImportedProduct(name, price, customsFee));
            }
        }
        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product prod : list_products) {
            System.out.println(prod.getName() + " : " + prod.priceTag());
        }
    }
}
