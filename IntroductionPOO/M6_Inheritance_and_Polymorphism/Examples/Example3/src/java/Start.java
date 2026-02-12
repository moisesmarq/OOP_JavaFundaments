package M6_Inheritance_and_Polymorphism.Examples.Example3.src.java;

import M6_Inheritance_and_Polymorphism.Examples.Example3.src.java.model.entities.Rectangle;
import M6_Inheritance_and_Polymorphism.Examples.Example3.src.java.model.entities.Shape;
import M6_Inheritance_and_Polymorphism.Examples.Example3.src.java.model.entities.Circle;
import M6_Inheritance_and_Polymorphism.Examples.Example3.src.java.model.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int n = scan.nextInt();

        List<Shape> list = new ArrayList<>();

        for (int i=1; i<=n; i++){
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char ch = scan.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(scan.next());

             if (ch == 'r'){
                System.out.print("Width: ");
                double width = scan.nextDouble();
                System.out.print("Height: ");
                double height = scan.nextDouble();
                list.add(new Rectangle(color, width, height));             }
             else {
                System.out.print("Radius: ");
                double radius = scan.nextDouble();
                list.add(new Circle(color, radius));
             }
        }
        System.out.println();
        System.out.println("SHAPE AREAS: ");
        for (Shape shape : list) {
            System.out.printf("%.2f%n", shape.area());
        }
        scan.close();
    }
}
