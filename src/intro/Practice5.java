package intro;

/*
    Write a program that does the following:
    a. Prompts the user to input five decimal numbers
    b. Prints the five decimal numbers
    c. Converts each decimal number to the nearest integer
    d. Adds the five integers
    e. Prints the sum and average of the five integers
 */
import java.util.Scanner;
public class Practice5 {
    static Scanner input = new Scanner(System.in);
    public static void main (String[] args){
        //five variables for double values
        double n1, n2, n3, n4, n5;

        System.out.print("Enter five decimal numbers: "); //input decimal numbers

        //Prints the decimal numbers
        n1 = input.nextDouble();
        n2 = input.nextDouble();
        n3 = input.nextDouble();
        n4 = input.nextDouble();
        n5 = input.nextDouble();

        //sum of decimal numbers
        System.out.println("Sum = " + (n1+n2+n3+n4+n5));

        //sum/average of the rounded double to integer values
        System.out.println("Sum in integer: " + Math.round(n1+n2+n3+n4+n5));
    }
}
