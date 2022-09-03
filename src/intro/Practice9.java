package intro;
/*
Write a program that prompts the user to enter the weight of a person in kilograms and
outputs the equivalent weight in pounds. Output both the weights rounded to two decimal
places.(Note that 1 kilogram = 2.2 pounds.)Format your output with two decimal places.
* */
import java.util.Scanner;
public class Practice9 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        //declaring variables
        double weight;
        double poundsWeight;

        System.out.println("Enter your weight in kilograms: ");
        weight = in.nextDouble(); //takes input

        poundsWeight = (weight * 2.2); //calculating kilograms to pounds

        //displays result
        System.out.printf(" Weight in kilograms is: %.2f\n", weight);
        System.out.printf(" Weight in pounds is: %.2f\n", poundsWeight);

    }
}
