package intro;
/**Description:
 Write a program that prompts the user to input an integer and then outputs both the individual digits of the
 number and the sum of the digits. For example, the program should: output the individual digits of 3456 as
 3 4 5 6 and the sum as 18, output the individual digits 8030 as 8 0 3 0 and the sum as 11, output the
 individual digits of 2345526 as 2 3 4 5 5 2 6 and the sum as 27, output the individual digits of 4000 as 4 0 0
 0 and the sum as 4, and the output digits of -2345 as 2 3 4 5 and the sum is 14.
 */

import java.util.Scanner;
public class Practice17 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);  //Scanner class to get user's input

        //varisbles
        int num;
        int sum = 0;
        int temp;

        //prompts the user to input numbers
        System.out.print("Enter an integer, positive or negative: ");
        num = sc.nextInt();
        System.out.println();  //new line

        //calculates
        if (num < 0){
            num = num++;
            sum = 0;
        }
        while (num > 0) {
            temp = num;
            sum = sum + num % 10;           //Extracts the last digit and adds it to the sum
            num = num / 10;                 //removes the last digit
            System.out.print(" " + temp % 10 );
        }

        System.out.println(" and the sum is " + sum);  //prints the sum of the numbers
    }
}
