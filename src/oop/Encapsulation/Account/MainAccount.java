package oop.Encapsulation.Account;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MainAccount {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();

        Account account = null;
        if (n == 1) {
            DecimalFormat df = new DecimalFormat("#.00");
            int accountNumber = console.nextInt();

            //account.setAccountNumber(accountNumber);
            account = new Account(accountNumber);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + df.format(account.getBalance()));
        } else if (n == 2) {
            int accountNumber = console.nextInt();
            //console.nextLine();
            double amount = console.nextDouble();
            account = new Account(accountNumber, amount);
        }

        int m = console.nextInt();
        for (int ctr = 0; ctr < m; ctr++) {
            int operation = console.nextInt();

            if (operation == 1) {
                double amount = console.nextDouble();
                account.credit(amount);
            } else if (operation == 2) {
                double amount = console.nextDouble();
                //double balance = console.nextDouble();
                account.debit(amount);
            } else if (operation == 3) {
                account.getAccountNumber();
            } else if (operation == 4) {
                account.getBalance();
            } else if (operation == 5) {
                System.out.println(account.toString());
            } else {
                continue;
            }


        }

    }
    }


