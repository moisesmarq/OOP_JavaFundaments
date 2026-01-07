package IntroductionPOO.M1_Objects_Concepts.ExercicioExemploPOO.Exercicios.Exercicio2.src.main.java;

import java.util.Locale;
import java.util.Scanner;

import IntroductionPOO.M1_Objects_Concepts.ExercicioExemploPOO.Exercicios.Exercicio2.src.main.java.entities.Employee;

public class Start {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: ");
        scan.nextLine();
        System.out.print("Gross salary: ");
        scan.nextDouble();
        System.out.print("Tax: ");
        scan.nextDouble();

        System.out.println("Employee: " + employee);
        System.out.println();

        System.out.print("Which percentage to increase salary? ");
        scan.nextDouble();

        System.out.println();
        System.out.println("Update data: " + employee);


        scan.close();

    }
}
