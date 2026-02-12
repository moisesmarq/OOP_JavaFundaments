package M6_Inheritance_and_Polymorphism.Exercises.Exercise2.src.java;

import M6_Inheritance_and_Polymorphism.Exercises.Exercise2.src.java.model.entities.Company;
import M6_Inheritance_and_Polymorphism.Exercises.Exercise2.src.java.model.entities.Individual;
import M6_Inheritance_and_Polymorphism.Exercises.Exercise2.src.java.model.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int N = scan.nextInt();

        List<TaxPayer> list = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = scan.next().charAt(0);
            System.out.print("Name: ");
            scan.nextLine();
            String name = scan.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = scan.nextDouble();

            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = scan.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpenditures));
            } else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = scan.nextInt();
                list.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }
    }
}
