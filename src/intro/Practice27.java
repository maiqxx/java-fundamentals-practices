package intro;
/**Description:
Write a program that prompts the user to input a number. The program should then output the
 number and a message saying whether the number is positive, negative or zero.
 */

import java.util.Scanner;
public class Practice27 {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);

        //takes input
        System.out.print("Input a number: ");
        int n = input.nextInt();

        //if number is greater than 0, then it's a positive number
        if(n > 0){
            System.out.println( n + " is a positive number");
        }
        //if number is less than 0, then it's a negative number
        else if (n < 0){
            System.out.println( n + " is a negative number");
        }
        else{
            //this will display when you hit the 0 number
            System.out.println("Entered number is ZERO");
        }
    }
}
