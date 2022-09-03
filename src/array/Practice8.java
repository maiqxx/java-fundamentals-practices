package array;
/**Description:
Program to copy array elements to another array
 */

import java.util.Scanner;
public class Practice8 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        //takes input
        System.out.println("Enter the size of the array: ");
        int size = in.nextInt(); //variable 'size' for the array's elements

        //declaring the size of the arrays from user's input
        int arrayA[] = new int[size];
        int arrayB[] = new int[size];

        //takes input for elements of the array
        System.out.print("Enter " + size + " elements of source array: ");
        for(int i = 0; i < size; i++){
            arrayA[i] = in.nextInt(); //reads the element that is being input by the user
        }
        //copying arrayA to arrayB
        for(int i = 0; i < size; i++){
            arrayB[i] = arrayA[i];
        }
        System.out.println(); //next line
        System.out.println(); //next line

        //prints all the original elements
        System.out.println("Elements of source array are:");
        for(int i = 0; i < size; i++){
            System.out.print(arrayA[i] + " \t");

        }
        //more next lines
        System.out.println();
        System.out.println();

        //prints the copied elements
        System.out.println("Elements of dest array are:");
        for(int i = 0; i < size; i++){
            System.out.print(arrayB[i] + " \t");

        }
        //another next lines
        System.out.println();
        System.out.println();
    }
}
