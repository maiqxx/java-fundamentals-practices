package array;
/**Description:
 *
 1. Program to print all negative elements in array. Program must do the following;
 - Program must accept the size of the array coming from the user.
 - Enter number either positive or negative as to limit to the size being entered;
 and
 - Generate an output that all negative elements in array being entered will display.
 */

import java.util.Scanner;
public class Practice6 {
    public static void main(String args[]){
        Scanner userIn = new Scanner(System.in);

        //Program must accept the size of the array coming from the user.
        System.out.print("Enter the size of the array: ");
        int size = userIn.nextInt();

        int negArray[] = new int[size];

        //Enter number either positive or negative as to limit to the size being entered
        System.out.println("Enter the elements of the array: ");
        for(int n = 0; n < negArray.length; n++){
            negArray[n] = userIn.nextInt();
        }
        System.out.printf("Negative number(s) in the array: ");
        for(int n = 0; n < negArray.length; n++){
            if (negArray[n] < 0){
                //outputs all negative elements in array being entered will display
                System.out.printf("%d ", negArray[n]);
            }
        }
    }
}
