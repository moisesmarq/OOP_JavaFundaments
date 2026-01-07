package main.java.utils;

public class CurrencyConverter {
    
    private static final double IOF = 0.06;

    private static double amountDollar;
    private static double priceDollar;
    
    public static void setAmountDollar(double amountDollar) {
        CurrencyConverter.amountDollar = amountDollar;
    }

    public static void setPriceDollar(double priceDollar) {
        CurrencyConverter.priceDollar = priceDollar;
    }

    public static double converterValueToReais(){
        double amountReais = amountDollar * priceDollar;
        amountReais = amountReais + (amountReais * IOF);
        return amountReais;
    } 
}
