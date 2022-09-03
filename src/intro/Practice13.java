package intro;
/*
1.) Create a program that calculates a customer’s bill for a local cable company. There are two
types of customers: residential and business. There are two rates for calculating a cable bill: one
for residential customers and one for business customers.

The program should ask the user for an account number(an integer) and customer code.
Assume that R or r stands for a residential customer and B or b stands for business customer.

Input: Input to the program is the customer’s account number, customer code, number of
premium channel to which the customer subscribe and in the case of business customers, the
number of basic service connection.
Output: Customer’s account number and the billing amount.
*/

import java.util.Scanner;
public class Practice13 {
    public static void main(String args[]){
        Scanner user = new Scanner(System.in);

        //variables for RESIDENTIAL CUSTOMERS
        double RESProcessingFee = 4.50;
        double RESBasicServicefee = 20.50;
        double RESPremiumChannels = 7.50;

        //variables for BUSINESS CUSTOMERS
        double BUSProcessingFee = 15.00;
        double BUSBasicServicefee = 75.00;
        double BUSAdditionalConnect = 5.00;
        double BUSPremiumChannels = 50.00;

        //variables for user's input details
        int accountNum;
        char customerCode;
        int numOfPremChannels;
        int numOfBasicConn;
        double dueAmount;

        //takes input
        System.out.println("\tThis program calculates a customer’s bill for a local cable company.");
        System.out.println("***********************************************************************************");
        System.out.println("Please enter customer's details...");
        System.out.println("Enter customer's ACCOUNT NUMBER:");
        accountNum = user.nextInt();

        //input char type either r,R or b,B
        System.out.println("Enter customer's CODE:");
        System.out.println("[R or r for: RESIDENTIAL customers" + "\n" +
                "B or b for: BUSINESS customers]");
        customerCode = user.next().charAt(0);
        System.out.println();

        switch(customerCode){

            //option for residential customers
            case 'r':
            case 'R':
                System.out.println("Enter the number of PREMIUM CHANNELS: ");
                numOfPremChannels = user.nextInt();
                dueAmount = RESProcessingFee + (RESBasicServicefee * RESPremiumChannels); //calculation

                //Output: Customer’s account number and the billing amount.
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("ACCOUNT NUMBER: " + accountNum);
                System.out.println("BILLING AMOUNT: " + dueAmount);
                break;

            //option for business customers
            case 'b':
            case 'B':

                System.out.println("Enter the number of BASIC SERVICE CONNECTIONS: ");
                numOfBasicConn = user.nextInt();
                System.out.println("Enter the number of PREMIUM CHANNELS: ");
                numOfPremChannels = user.nextInt();

                //calculation
                if (numOfBasicConn <= 10){
                    dueAmount = BUSProcessingFee + BUSBasicServicefee + (numOfPremChannels * BUSPremiumChannels);

                    //Output: Customer’s account number and the billing amount.
                    System.out.println("------------------------------------------------------------------------------------");
                    System.out.println("ACCOUNT NUMBER: " + accountNum);
                    System.out.println("BILLING AMOUNT: " + dueAmount);
                    break;
                }else {
                    dueAmount = BUSProcessingFee + BUSBasicServicefee + (numOfBasicConn - 10) * BUSAdditionalConnect + numOfPremChannels * BUSPremiumChannels;

                    //Output: Customer’s account number and the billing amount.
                    System.out.println("------------------------------------------------------------------------------------");
                    System.out.println("ACCOUNT NUMBER: " + accountNum);
                    System.out.println("BILLING AMOUNT: " + dueAmount);
                    break;
                }
            default:
                //prints when entered char type in instruction is invalid
                System.out.println("INVALID CUSTOMER CODE!");

        }

    }
}
