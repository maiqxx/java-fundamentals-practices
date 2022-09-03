package array;
/**Description:
 1. Create a program having a three by four two dimensional array.
 Multiply each element by 10 and display the result value.

 2. Read and print a rowXcolumn matrix, number of rows and number of columns will be read through the user
 */

import java.util.Scanner;
public class Practice1 {
    public static void main(String args[]){
        // declaring variable
        int row, col, i, j = 0;
        int arr[][] = new int[10][10];
        Scanner scan = new Scanner(System.in);

        // enter the number of row and column
        System.out.print("Enter row for the array (max 10) : ");
        row = scan.nextInt();
        System.out.print("Enter column for the array (max 10) : ");
        col = scan.nextInt();

        //enter elements/values of the array
        System.out.println("Enter " +(row*col)+ " Array Elements : ");
        for(i=0; i<row; i++)
        {
            for(j=0; j<col; j++)
            {
                arr[i][j] = scan.nextInt();
                arr[i][j] = arr[i][j] * 10;  //Multiply each element by 10 and display the result value.
            }
        }

        //2. Read and print a rowXcolumn matrix, number of rows and number of columns will be read through the user
        System.out.print("The Array is :\n");
        for(i=0; i<row; i++)
        {
            for(j=0; j<col; j++)
            {
                System.out.print(arr[i][j]+ "  ");
            }
            System.out.println();
        }
    }
}
