package intro;
/**Description:
Write a program that reads a set of integers, and then finds and prints the sum of the even and odd
 integers.
 */

import java.util.Scanner;  //Scanner class to get user's input
public class Practice16 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);   //an object of Scanner class

        //declaring variables
        int i, num, sumEven = 0, sumOdd = 0;

        System.out.println("Enter number: "); //takes input
        num = in.nextInt(); //reads the inputted number

        //calculation/process
        for(i = 1; i <= num; i++){
            if(i % 2 == 0){
                sumEven = sumEven + i; //sum up even nos.
            } else {
                sumOdd = sumOdd + i; //sum up odd nos.
            }
        }
        //prints results
        System.out.println("The sum of even numbers of " + num + " is " + sumEven);
        System.out.println("The sum of odd numbers of " + num + " is " + sumOdd);
    }
}
