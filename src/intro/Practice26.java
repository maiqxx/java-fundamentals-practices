package intro;
/**Description:
 * 1.) A bank in your town updates its customers’ accounts at the end of each month. The bank offers
 two types of accounts: savings and checking. Every customer must maintain a minimum balance.
 If a customer balance falls below the minimum balance, there is a service charge of 10.00 for
 savings account and 25.00 for checking account. If the balance at the end of the month is at
 least the minimum balance, the account receives interest as follows:
 a. Savings accounts receive 4% interest.
 b. Checking accounts with balances of up to 5000 more than the minimum balance receive 3%
 interest; otherwise, the interest is 5%.
 */

import java.util.Scanner;
public class Practice26 {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);

        //declaring variables
        int accountNum;
        char accountType;
        float currentBalance;
        double interest = 0;
        double minimumBalance;


        //getting input
        System.out.println("Please input the customer's details");
        System.out.println();

        System.out.println("Account Number: ");
        accountNum = scan.nextInt();  //scans account number
        System.out.println("Account Type: " + "\n" +
                "C = Checking Account" + "\n" +
                "S = Savings Account" + "\n");

        System.out.println("Enter the Account Type: ");
        accountType = scan.next().charAt(0);
        System.out.println("Enter the minimum account balance: ");
        minimumBalance = scan.nextDouble();
        System.out.println("Enter the account balance: ");
        currentBalance = scan.nextFloat();


        //calculation
        if (accountType == 'S' && currentBalance < minimumBalance){
            currentBalance = (float) (currentBalance - 10.00);
        }
        if (accountType == 'C' && currentBalance < minimumBalance){
            currentBalance = (float) (currentBalance - 25.00);
        }
        if (accountType == 'S' && currentBalance > minimumBalance){
            interest = (currentBalance * 4) / 100;
        }
        if (accountType == 'C' && currentBalance <= (minimumBalance + 5000.00) && currentBalance > minimumBalance){
            interest = (currentBalance * 3) / 100;
        }
        if (accountType == 'C' && currentBalance >= minimumBalance){
            interest = (currentBalance * 5) / 100;
        }
        //displays output
        System.out.println("Account Number: " + accountNum);
        System.out.println("Account Type: " + accountType);
        System.out.printf("Account Balance: $%.2f", currentBalance);
        System.out.println();
        System.out.printf("Amount of Interest Earned: $%.2f", interest);

    }
}
