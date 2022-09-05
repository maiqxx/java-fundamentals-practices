package array;

/**Description:
 * 1. Menu Driven
 * 2. Enter no. of rows and columns(decision)
 * 3. Enter elements
 * 4. Output
 *      Display Original
 *      Converted Matrix Name
 */

import java.util.Scanner;
public class Practice17_MenuDriven {
    public static void lower(int matrix[][],
                             int row, int col)
    {
        int i, j;
        for (i = 0; i < row; i++)
        {
            for (j = 0; j < col; j++)
            {
                //decision
                if (i < j)
                {
                    System.out.print("0" + " ");
                }
                else
                    System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to form upper
    // triangular matrix
    public static void upper(int matrix[][],
                             int row, int col)
    {
        int i, j;
        for (i = 0; i < row; i++)
        {
            for (j = 0; j < col; j++)
            {
                //decision
                if (i > j)
                {
                    System.out.print("0" + " ");
                }
                else
                    System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Driver Code
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter no. of columns: ");
        int col = sc.nextInt();


        int matrix[][] = new int[row][col];

                          /*{{1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}};*/
        //int row = 3, col = 3;

        System.out.println("Enter elements: ");
        for(int i = 0;i < row; i++){
            for(int j = 0; j < col; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("Original: ");
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                System.out.print(matrix[i][j] + " ");

            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Lower triangular matrix: ");
        lower(matrix, row, col);

        System.out.println("Upper triangular matrix: ");
        upper(matrix, row, col);

    }
}
