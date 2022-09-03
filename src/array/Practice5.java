package array;
/**Description:
 * Find the maximum and minimum element in an array
 * Find maximum and minimum element in an array :
 * --------------------------------------------------
 * Input the number of elements to be stored in the array :3
 * Input 3 elements in the array:
 * element 1 : 45
 * element 2 : 25
 * element 3 : 21
 * Maximum element is : 45
 * Minimum element is : 21
 */

import java.util.Scanner;
public class Practice5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);


        System.out.println("Find maximum and minimum element in an array :\n" +
                "--------------------------------------------------");

        System.out.print("Input the number of elements to be stored in the array: ");
        int num = sc.nextInt();
        int min, max;

        int[] array = new int[num];

        System.out.println("Input " + num + " elements in the array:");
        for(int i=0; i<num; i++){
            System.out.print("element " + (i+1) + ": ");
            array[i] = sc.nextInt();//takes input from user
        }

        min = array[0];
        max = array[0];
        for(int i = 0; i < num; i++){
            if(min > array[i]){//find minimum elements
                min = array[i];
            }

            if(max < array[i]){
                max = array[i];  //find maximum elements
            }
        }
        //displays result
        System.out.print("\nMaximum element is: " + max);
        System.out.print("\nMinimum element is: " + min);
        System.out.println();
        System.out.println();
    }
}
