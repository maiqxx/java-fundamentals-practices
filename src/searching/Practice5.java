package searching;
/**Description:
 * A java program that implements two search algorithm the binary
 * and linear search.
 */

import java.util.Scanner;
public class Practice5 {
    public static void main(String args[]){
        int i, num, key, first, last, mid;  //declaring variables

        //getting inputs
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        num = input.nextInt();

        //initializing array
        int array[] = new int[num];

        //getting input for the array's elements
        System.out.println("Enter " + num + " elements: ");

        for(i = 0; i < num; i++){
            array[i] = input.nextInt();  //reads inputs
        }

        //asks user to enter a value to search
        System.out.println("Enter the value to search: ");
        key = input.nextInt();
        first = 0;
        last = num - 1;
        mid = (first + last)/2;

        while (first <= last){

            //In linear & binary search which retrieves the location of the value being searched

            //comparing values
            if (array[mid] < key){
                first = mid + 1;
            } else if (array[mid] == key){
                //found
                System.out.println(key + " found at location " + (mid + 1) + ".");
                break;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if (first > last){
            //not found
            System.out.println(key + " is not found. \n");
        }
    }
}
