package array;

import java.util.Scanner;
public class Practice45 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int row, col;
        System.out.print("Enter the no. of the rows in the array: ");
        row = in.nextInt();

        System.out.print("Enter the no. of the columns in the array: ");
        col = in.nextInt();

        int arr1[][] = new int[100][100];
        int arr2[][] = new int[100][100];

        int sumArr[][] = new int[100][100];

        //FIRST MATRIX
        System.out.print("\nEnter the " + (row * col) + " elements of the first matrix: \n");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr1[i][j] = in.nextInt();
            }
        }

        //SECOND MATRIX
        System.out.print("\nEnter the " + (row * col) + " elements of the second matrix: \n");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr2[i][j] = in.nextInt();
            }
        }

        //SUM OF THE TWO MATRICES
        System.out.println("Sum Of Matrix: ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                sumArr[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(sumArr[i][j] + " ");
            }
        }

    }
}
