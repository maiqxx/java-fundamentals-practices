package intro;
/**
Write a Java program that takes as input the temperature in Fahrenheit and output the
equivalent temperature in Celsius. The formula to convert the temperature is: Celsius = 5/9
 * (Fahrenheit – 32).
 */

import java.util.Scanner;
public class Practice11 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        double fahr, celsius;  //declaring variables

        //takes input from user
        System.out.println("Enter temperature in Fahrenheit: ");
        fahr = scan.nextDouble();

        celsius = (5 * (fahr - 32) /9);  //calculating Fharenheit to Celsius

        System.out.println("Temperature in Celsius: " + celsius); //result
    }
}
