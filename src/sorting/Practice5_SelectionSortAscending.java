package sorting;
/**
 * Selection Sort - A program that outputs in ascending order and print the largest element
 */

import java.util.Scanner;
public class Practice5_SelectionSortAscending {
    public static void main(String args[]){
        int count, temp;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        count = in.nextInt();

        int num[] = new int[count];
        System.out.println("Enter the elements");
        for(int i = 0; i < count; i++){
            num[i] = in.nextInt();
        }
        in.close();
        for(int i = 0; i < count; i++){
            for(int j = i + 1; j < count; j++){
                if (num[i] > num[j]){
                    //varables for swapping
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }

        System.out.println("The sorted numbers are: ");
        for(int i = 0; i < count - 1; i++){
            System.out.print(num[i] + " ");  //prints  ascebnding sorted array
        }
        System.out.print(num[count - 1] + " ");

        System.out.println();
        int max = num[0];
        for(int i = 0; i < count; i++)
        {
            if(max < num[i])
            {
                max = num[i];
            }
        }
        System.out.println("Maximum value:" + max); //displays maximum number
    }
}
