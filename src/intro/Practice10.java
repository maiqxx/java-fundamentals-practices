package intro;
/**
To make a profit, a local store marks up the prices of its items by a certain percentage.
Write a Java program that reads the original price of the item sold, the percentage of the
marked-up price and the sales tax rate. The program then outputs the original price of the
item, the marked-up percentage of the item, the stores selling price of the item, the sales
tax rate, the sales tax, and the final price of the item.( the final price of the item is the
selling price plus the sales tax.
 */

import java.util.Scanner;
public class Practice10 {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        // declaring variables
        double originalPrice, markUpPrice, salesTaxRate, salesTaxPrice, markUpPercentage, totalPrice;

        //takes input from user
        System.out.println("Enter the original price: ");
        originalPrice = userInput.nextDouble();
        System.out.println("Enter the marked up percentage: ");
        markUpPercentage = userInput.nextDouble();
        System.out.println("Enter the sales tax percentage: ");
        salesTaxRate = userInput.nextDouble();

        //calculation
        markUpPrice = originalPrice * (markUpPercentage / 100);
        salesTaxPrice = originalPrice * (salesTaxRate / 100);
        totalPrice = originalPrice + salesTaxPrice + markUpPrice;

        //displaying results
        System.out.println("Original Price: " + originalPrice);
        System.out.println("Sales Tax: " + salesTaxPrice);
        System.out.println("Total Price: " + totalPrice);

    }
}
