package sorting;
/**
    Bubble Sort - Sorting Names in Order
 */

import java.util.Scanner;
public class Practice3_BubbleSortNames {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of names: ");
        int n = in.nextInt();

        String names[] = new String[n];
        Scanner in2 = new Scanner(System.in);
        System.out.println("Enter the names: ");

        for(int i = 0; i < n;i++){
            names[i] = in2.nextLine();
        }

        //temporary storage
        String temp;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                //comparing the strings
                if(names[i].compareTo(names[j]) > 0){
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        //prints result
        System.out.println();
        System.out.println("String in sorted order are: ");
        for(int i = 0; i < n; i++){
            System.out.print("String " + (i + 1) + " is " + names[i] + "\n");
        }
    }
}
