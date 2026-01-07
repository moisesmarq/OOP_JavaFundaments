package IntroductionPOO.M1_Objects_Concepts.ExercicioExemploPOO.Exemplos.Exemplo1.src.main.java;

import java.util.Locale;
import java.util.Scanner;

import IntroductionPOO.M1_Objects_Concepts.ExercicioExemploPOO.Exemplos.Exemplo1.src.main.java.entities.Triangle;

public class Start {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Triangle x = new Triangle();
        Triangle y = new Triangle();

        System.out.println("Enter the mesasures of triangle X: ");
        
        //x = Stack Memory Area
        //a,b,c = Heap Memory Area

        x.a = scan.nextDouble();
        x.b = scan.nextDouble();
        x.c = scan.nextDouble();

        System.out.println("Enter the mesuares of triangle Y: ");
        y.a = scan.nextDouble();
        y.b = scan.nextDouble();
        y.c = scan.nextDouble();

        double areaX = x.calculateArea();
        double areaY = y.calculateArea();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }
    }
}
