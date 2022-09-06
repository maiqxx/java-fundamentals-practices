package oop.Encapsulation.Account;

import java.text.DecimalFormat;

public class Account {
    private int accountNumber;
    private double balance;
    private double amount;

    Account(int accountNum){
        DecimalFormat df = new DecimalFormat("#.00");

        accountNumber = accountNum;
        df.format(balance);
        balance = 3000.00;

        System.out.println("First Overloaded Constructor");
    }

    Account(int accountNum, double bal){

        accountNumber = accountNum;
        balance = bal;

        System.out.println("Second Overloaded Constructor");
    }


    double getBalance(){
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountNumber(int accountNum) {
        this.accountNumber = accountNumber;
    }

    public void credit(double amount){
        //public void credit(double) - adds the given amount to the balance
        balance = balance + amount;

    }

    public void debit(double amount){
        //public void debit(double) - subtracts the given amount from the balance (obviously, one cannot subtract
        // more from what is available - prints "Insufficient Funds" if this is the case)


        if(balance <= amount){
            //getBalance();
            System.out.println("Insufficient Funds");
        } else{
            balance = balance - amount;
        }



    }


    public String toString(){

        //balance = Math.round(balance);
        DecimalFormat df = new DecimalFormat("#.00");
        return "Account Number: " + accountNumber + ", " + "Balance: Php " + df.format(balance);

    }


}
