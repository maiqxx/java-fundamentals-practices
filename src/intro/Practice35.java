package intro;
/**Description:
 * Write a program that read number N and input number as to how many N being read. Classify number like
 the program counts the number of odd, even numbers and number of zeros.
 */

import java.util.Scanner;
public class Practice35 {
    public static void main (String args[]){

        //Scanner to get input from user
        Scanner sc = new Scanner(System.in);

        //declaring variables
        int num;
        int odd = 0;
        int even = 0;
        int zeros = 0;
        int count = 0;

        //getting input
        System.out.println("Enter how many numbers you want to classify: ");
        int range = sc.nextInt(); //scans input of how many values the user wants to classify

        while(count < range){
            //getting inputs from user
            System.out.printf("Enter number [%d]: ", count++);
            num = sc.nextInt(); //scans input

            if(num % 2 == 0){
                even++;
            }else if (num % 3 == 0){
                odd++;
            }else{
                zeros++;
            }

        }
        //Prints the sum of even, odd, and zero numbers that are entered
        System.out.println();
        System.out.printf("Number of even numbers entered: %d\n", even);
        System.out.printf("Number of odd numbers entered: %d\n", odd);
        System.out.printf("Number of zeros entered: %d\n", zeros);
    }
}
