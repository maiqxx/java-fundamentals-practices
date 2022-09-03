package array;
/**Description:
Program to count even and odd elements in array
 */

import java.util.Scanner;
public class Practice7 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        //getting arrays size
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int OddEven[] = new int[size]; //declaring the size of the array from user's input

        //takes input
        System.out.print("Enter " + size + " elements in the array (hit space bar for each element): ");
        for (int i = 0; i < size; i++){
            OddEven[i] = sc.nextInt();
            System.out.print(OddEven[i] + " ");
        }
        int evenCount = 0, oddCount = 0;
        for (int i = 0; i < size; i++){

            //condition
            if (OddEven[i] % 2 == 0){
                //counts even
                evenCount++;
            }
            else{
                //counts odd
                oddCount++;
            }

        }
        //displays result
        System.out.println();
        System.out.printf("Total of even elements: %d\n", evenCount);
        System.out.printf("Total of odd elements: %d\n", oddCount);
        System.out.println();
    }
}
