package array;
/**Description:
    Program to print the largest and second largest element of the array.
 */

import java.util.Scanner;
public class Practice11_2LargestElements {
    public static void main (String args[]){

        int size;
        int firstNum = 0, secondNum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        size = sc.nextInt();//getting user's input yo declare the size of an array

        //initializing array
        int maxNum[] = new int[size];

        for(int i = 0; i < size; i++){
            System.out.print("Element " + (i + 1) + ": ");
            maxNum[i] = sc.nextInt(); //takes input for array elements

            if (firstNum < maxNum[i]){
                secondNum = firstNum;
                firstNum = maxNum[i];
            } else if(secondNum < maxNum[i]){
                secondNum = maxNum[i];
            }
        }
        //displays results
        System.out.println("\nThe largest number is: " + firstNum);
        System.out.println("The second largest number is: " + secondNum);
    }
}
