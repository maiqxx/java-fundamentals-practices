package array;

/** Description:
Passing two-dimensional array to a function
 */

import java.util.Scanner;
public class Practice16 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int col = sc.nextInt();
        System.out.println();

        // defining two dimensional array
        int[][] numbers = new int[row][col];

        //function call for matrix inputs
        display(sc, numbers, row, col);

        //function call for diplaying and passing results
        display(numbers, row, col);
    }

    //method for taking inputs
    public static void display(Scanner scan, int num[][], int rows, int columns)
    {
        System.out.println("Enter the elements : ");
        for(int a = 0; a < rows; a++)
        {
            for(int b = 0; b < columns; b++)
            {
                num[a][b] = scan.nextInt();
            }
        }
    }

    //method for displaying
    public static void display(int num[][], int rows, int columns)
    {
        System.out.println();
        System.out.println("Displaying: ");
        for(int a = 0; a < rows; a++)
        {
            for(int b = 0; b < columns; b++)
            {
                System.out.print(num[a][b] + " ");
            }
            System.out.println();
        }
    }
}
