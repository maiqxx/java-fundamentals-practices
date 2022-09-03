package sorting;
/**
 * Insertion Sort - A program that outputs in descending order and print the lowest element
 */

import java.util.Scanner;
public class Practice6 {
    public static void main(String args[]){
        int i, j = 0, count, key = 0;

        //getting inputs
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        count = in.nextInt();

        int num[] = new int[count];
        System.out.println("Enter the elements");
        for(i = 0; i < count; i++){
            num[i] = in.nextInt();
        }
        //sorting to descending order
        for(i = 1; i < count; i++){
            key = num[i];
            j = i - 1;

            while(j >= 0 && key > num[j]){
                num[j+1] = num[j];
                --j;
            }
            num[j+1] = key;
        }
        //prints out the sorted array
        System.out.println("Sorted array is ");
        for(i = 0; i < count; i++){
            System.out.print(num[i] + " ");
        }
        //calculates the minimum
        System.out.println();
        int min = num[0];
        for(i = 0; i < count; i++)
        {
            if(min > num[i])
            {
                min = num[i];
            }
        }
        System.out.println("Minimum value:" + min);  //displays the minimum number
    }
}
