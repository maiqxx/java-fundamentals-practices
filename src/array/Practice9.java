package array;
/**Description:
Reversing a One-Dimensional Array: Write a Java Program that reads an integer one
 dimensional array of size N. The program then reverses the elements of the array and
 stores them in reverse order in the same array.
 For example, if the elements of the array are:
 33 20 2 88 97 5 71
 The elements of the array after reversal should be:
 71 5 97 88 2 20 33
 */

import java.util.Scanner;
public class Practice9 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        //takes input fro user
        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();

        //initializing array
        int reverseArr[] = new int[size];

        System.out.print("Enter " + size + " elements of the array: "); //takes input for elements
        for(int i = 0; i < size; i++){
            reverseArr[i] = scan.nextInt();  //scans the elements that are being entered
            System.out.print(reverseArr[i] + " ");  //prints the element with space
        }
        System.out.println(); // new line
        System.out.println();

        //displays the original array
        System.out.print("The original order of array: ");
        for(int i = 0; i < size; i++){
            System.out.print(reverseArr[i] + " ");
        }

        //displays the reversed order of array
        System.out.println();
        System.out.print("The reversed order of array: ");
        //descending for loop
        for(int i = size -1; i >= 0; i--){
            System.out.print(reverseArr[i] + " ");
        }
        System.out.println();
    }
}

