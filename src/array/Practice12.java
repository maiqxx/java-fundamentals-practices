package array;
/**Description:
Program to insert an element in an Array
 *
 */

import java.util.Scanner;
public class Practice12 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        int insert[] = new int[n + 1]; //initializing array from user's input

        System.out.print("Enter " + n +" elements: \n");
        for(int i = 0; i < n; i++){
            insert[i] = sc.nextInt();
        }

        System.out.print("Enter the location where you want to insert an element [index]: ");
        int loc = sc.nextInt();  //takes index/position of an element from user

        System.out.print("Enter the value to insert: ");
        int value = sc.nextInt();  //takes what value you want to insert at chosen position of an elemnt

        for(int i = n-1; i >= (loc-1); i--){
            insert[i+1] = insert[i];
        }
        //assigning the array for the value to be inserted
        insert[loc-1] = value;
        //prints the results
        System.out.println("Resultant array is: ");
        for(int i = 0; i <= n; i++){
            System.out.print(insert[i] + " ");
        }
        System.out.println();
    }
}
