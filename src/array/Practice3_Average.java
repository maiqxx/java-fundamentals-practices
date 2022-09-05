package array;
/**Description:
 * Program to find the average of n (n &lt; 5) numbers using arrays.
 */

import java.util.Scanner;
public class Practice3_Average {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        //takes input of how many elements you want to sum
        System.out.println("Enter the number of elements: ");
        int num = input.nextInt();

        //1D array
        int[] array = new int[num];
        int sum = 0;
        int average = 0;

        System.out.println("Enter elements: ");
        for(int n = 0; n < num; n++){
            //reads the entered elements
            System.out.printf("Enter number[%d]: ", n+1);
            array[n] = input.nextInt();
            sum = sum + array[n];  //sum up the values
            average = sum / num;
        }
        //prints the sum of the array
        System.out.println("Average = " + average);
    }
}
