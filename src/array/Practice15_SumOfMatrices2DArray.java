package array;
/**Description:
    Sum of two matrices using Two dimensional arrays
 */

import java.util.Scanner;
public class Practice15_SumOfMatrices2DArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //loop variables
        int row = 0, col = 0, i, j;

        //declaring the 3 matrices (2D arrays):
        int m1[][] = new int[100][100];  //m1-first matrix
        int m2[][] = new int[100][100];  //m2- second matrix
        int sum[][] = new int[100][100];  //sum- stores the addition of the two matrices

        //getting inputs
        System.out.print("Enter the no. of the rows in the array: ");
        row = sc.nextInt();

        System.out.print("Enter the no. of the rows in the array: ");
        col = sc.nextInt();
        System.out.println();

        //First Matrix inputs
        System.out.print("Enter the " + (row * col) + " elements of first matrix : \n");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                m1[i][j] = sc.nextInt();
            }
        }

        //Second Matrix inputs
        System.out.print("\nEnter the " + (row * col) + " elements of second matrix : \n");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                m2[i][j] = sc.nextInt();
            }
        }

        //calculating the sum matrix
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                sum[i][j] = m1[i][j] + m2[i][j];
            }
        }

        //displays the sum of the matrix
        System.out.println();
        System.out.print("Sum Of Matrix : \n");

        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(sum[i][j] + "  ");
            }

            System.out.println();
        }

        System.out.print("\n\n");

    }
}
