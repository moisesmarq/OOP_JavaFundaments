package IntroductionPOO.M1_Objects_Concepts.ExercicioExemploPOO.Exercicios.Exercicio1.src.main.java;

import java.util.Locale;
import java.util.Scanner;

import IntroductionPOO.M1_Objects_Concepts.ExercicioExemploPOO.Exercicios.Exercicio1.src.main.java.entities.Rectangle;

public class Start {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rectangle.setWidth(scan.nextDouble());
        rectangle.setHeigth(scan.nextDouble());

        System.out.print(rectangle);

        scan.close();
    }
}
