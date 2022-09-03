package intro;

/**
 Write a program that prompts the user to enter the pay rate for an hour and
the number of hours you worked each week.
 */

import java.util.Scanner;
public class Practice21 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        //declaring vaeiables
        double earningPerHour;
        double week1, week2, week3, week4, week5;
        double income;
        double netIncome;
        double clothesMoney;
        double suppliesMoney;
        double savingBonds;
        double additionalBonds;
        double remainingMoney;

        //prompts the user to enter the pay rate for an hour and the number of hours you worked each week
        System.out.println("Enter your hourly earnings: ");
        earningPerHour = in.nextDouble();

        System.out.println("WEEK 1: ");
        week1 = in.nextDouble();
        System.out.println("WEEK 2: ");
        week2 = in.nextDouble();
        System.out.println("WEEK 3: ");
        week3 = in.nextDouble();
        System.out.println("WEEK 4: ");
        week4 = in.nextDouble();
        System.out.println("WEEK 5: ");
        week5 = in.nextDouble();

        // the calculation
        income = earningPerHour * (week1 + week2 + week3 + week4 + week5);
        netIncome = income - income * 0.14;
        clothesMoney = netIncome * 0.1;
        suppliesMoney = netIncome * 0.01;
        remainingMoney = netIncome - clothesMoney - suppliesMoney;
        savingBonds = remainingMoney * 0.25;
        additionalBonds = (savingBonds) * .50;

        //display output
        System.out.println("Income: " + income);
        System.out.println("Net Income: " + netIncome);
        System.out.println("Clothes & Accessories: " + clothesMoney);
        System.out.println("School Supplies: " + suppliesMoney);
        System.out.println("Saving Bonds: " + savingBonds);
        System.out.println("Additional Saving Bonds: " + additionalBonds);
        System.out.println();
    }
}
