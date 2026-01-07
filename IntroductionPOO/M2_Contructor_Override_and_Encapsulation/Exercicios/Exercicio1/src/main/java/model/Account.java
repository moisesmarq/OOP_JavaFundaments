package main.java.model;

public class Account {
    private int accountNumber;
    private String proprietaryName;
    private double accountBalance;

    public Account(String proprietaryName, int accountNumber){
        this.proprietaryName = proprietaryName;
        this.accountNumber = accountNumber;
    }

    public Account(String proprietaryName, int accountNumber, double accountBalance){
        this.proprietaryName = proprietaryName;
        this.accountNumber = accountNumber;
        depositValue(accountBalance);
    }

    public void depositValue(double value){
        this.accountBalance += value;
    }

    public void withdrawValue(double value){
        if (this.accountBalance >= value){
            this.accountBalance -= (value + 5);
        }
        else {
            System.out.println("The amount to be withdrawn is greater than the amount available.");
            System.out.println("Available Balance: " + String.format("%.2f", this.accountBalance));
        }
    }

    @Override
    public String toString(){
        return "Account " + this.accountNumber
                + ", Holder: " + this.accountNumber
                + ", Balance: " + String.format("%.2f", this.accountBalance);
    }
}
