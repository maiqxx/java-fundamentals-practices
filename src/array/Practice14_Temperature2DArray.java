package array;
/**Description:
    Two Dimensional Array to store and print values.
     Java program to store temperature of two cities for a week and display it.
 */

import java.util.Scanner;
public class Practice14_Temperature2DArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //declaring variables
        int city = 2;
        int week = 7;
        int temperature[][] = new int[city][week];

        //takes temperature input from user
        for(int i = 0; i < city; i++){
            for(int j = 0; j < week; j++){
                System.out.print("City " + (i+1) + ", Day " + (j+1) + " : ");
                temperature[i][j] = sc.nextInt();
            }
        }
        //displays results
        System.out.println();
        System.out.println("Displaying Values:");
        System.out.println();
        for(int i = 0; i < city; i++){
            for(int j = 0; j < week; j++){
                System.out.print("City " + (i+1) + ", Day " + (j+1) + " = " + temperature[i][j] + "\n");

            }
        }
    }
}
