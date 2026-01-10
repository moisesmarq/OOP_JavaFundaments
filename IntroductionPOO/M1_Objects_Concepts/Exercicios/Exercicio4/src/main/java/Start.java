package M1_Objects_Concepts.Exercicios.Exercicio4.src.main.java;

import java.util.Locale;
import java.util.Scanner;

import main.java.utils.CurrencyConverter;

public class Start {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        CurrencyConverter.setPriceDollar(scan.nextDouble());

        System.out.print("How many dollars will be bought? ");
        CurrencyConverter.setAmountDollar(scan.nextDouble());

        scan.close();
        System.out.println("Amount to be paid in reais = "
                + String.format("%.2f",
                        CurrencyConverter.converterValueToReais()));

    }
}
