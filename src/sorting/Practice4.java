package sorting;
/**Description
    Selection Sort - Sorting String names
 */

import java.util.Scanner;
public class Practice4 {
    public static void main(String args[]){
        int count;
        String temp;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        count = sc.nextInt();  //getting input

        String str[] = new String[count];  //string array
        Scanner sc2 = new Scanner(System.in); //new scanner for strings to be input
        System.out.println("Enter the strings: ");
        for(int i = 0; i < count; i++){
            str[i] = sc2.nextLine();
        }
        for(int i = 0; i < count; i++){
            for(int j = i + 1; j < count; j++){

                //comparing strings
                if(str[i].compareTo(str[j]) > 0){
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;

                }
            }
        }

        //displays result
        System.out.println();
        System.out.println("Sorted array is");
        for(int i = 0; i <=count -1; i++){
            System.out.print(i + ": "+ str[i] + "\n");
        }
    }
}

