package array;
/**Description:
 * Perform a matrix, the task is to find the minimum element of each row and each column.
 */

public class Practice19 {
    public static void minInRow(int matrix[][], int n, int m) {

        //finding the minimum element of each row.
        for (int i = 0; i < n; i++) {

            // initializing the minimum element & assigned as first element
            int minm = matrix[i][0];

            for (int j = 1; j < m; j++) {

                // comparing & replacing minimum value of the row
                if (matrix[i][j] < minm) {
                    minm = matrix[i][j];
                }
            }

            // prints out the minimum element of the row
            System.out.print(minm + ", ");
        }
    }

    public static void minInCol(int matrix[][], int n, int m) {

        //finding the minimum element of each columns.
        for (int i = 0; i < m; i++) {

            // initializing the minimum element & assigned as first element
            int minm = matrix[0][i];


            for (int j = 1; j < n; j++) {

                // comparing & replacing minimum value of the columns
                if (matrix[j][i] < minm) {
                    minm = matrix[j][i];
                }
            }

            // prints out the smallest element of the columns
            System.out.print(minm + ", ");
        }

        System.out.print("");

    }
    public static void main(String args[]) {

        //declaring the numbers of rows and columns in a matrix
        int n = 3, m = 3;

        int matrix[][] = {{1, 2, 4},
                {1, 5, 11},
                {75, 30, 18}};

        System.out.print("Minimum element of each row is: ");
        minInRow(matrix, n, m);  //function call
        System.out.println();
        System.out.print("Minimum element of each column is: ");
        minInCol(matrix, n, m);  //function call
    }
}
