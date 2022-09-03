package sorting;
/**
 *  Bubble Sort (Performed descending order)
 * */

import java.util.Scanner;
public class Practice2 {
    public static void main(String []args){

        int num, i, j, temp;

        Scanner input = new Scanner(System.in);
        //getting input
        System.out.println("Enter the number of elements to sort: ");
        num = input.nextInt();

        int array[] = new int [num];

        System.out.println("Enter " + num + " elements: ");

        for(i = 0; i < num; i++){
            array[i] = input.nextInt();
        }
        for(i = 0; i< (num - 1); i++){
            for(j = 0; j < num - i - 1; j++){
                if(array[j] < array[j + 1]){
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Sorted list of elements: ");
        for(i = 0; i < num; i++){

            System.out.print(array[i] + " ");
        }
    }
}
