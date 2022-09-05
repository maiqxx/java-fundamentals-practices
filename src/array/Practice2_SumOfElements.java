package array;
/**Description:
    Java program that will print the sum of the numbers that has been input by user
 */

import java.util.Scanner;
public class Practice2_SumOfElements {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        //takes input of how many elements you want to sum
        System.out.println("Enter the size of the array: ");
        int num = input.nextInt();

        //1D array
        int array[] = new int[num];
        int sum = 0;

        System.out.println("Enter elements: ");
        for(int i = 0; i < num; i++){
            //reads the entered elements
            System.out.printf("Enter num[%d]: ", i+1);
            array[i] = input.nextInt();
            sum = sum + array[i];  //sum up the values
        }
        //prints the sum of the array
        System.out.println("Sum = " + sum);
    }
}
