package intro;
/**Description:
 Write a program that reads a set of integers, and then finds and prints the sum fo the even and odd
 integers.
 */

import java.util.Scanner;
public class Practice31 {
    public static void main (String args []){

        //Scanner to get input from user
        Scanner reader = new Scanner(System.in);

        //declaring variables
        int num, n, i;
        int odd = 0;
        int even = 0;

        //getting input
        System.out.println("Enter the number of values: ");
        n = reader.nextInt(); //reads the user's input as an integer


        for(i = 1; i <= n; i++){

            //getting input for the values
            System.out.println("Enter any number: ");
            num = reader.nextInt(); ////reads the user's input as an integer

            if(num % 2 == 0){
                //number is even
                even += num;
            } else{
                //number is odd
                odd += num;
            }

        }
        //Prints the sum of even & odd  numbers
        System.out.println("Sum of EVEN numbers: " + even);
        System.out.println("Sum of ODD numbers: " + odd);

    }
}
