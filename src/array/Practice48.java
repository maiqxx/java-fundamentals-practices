package array;
/**Description:
 * Perform a matrix, the task is to find the minimum element of each row and each column.
 */

public class Practice48 {
    public static void minInRow(int matrix[][], int n, int m) {

        for (int i = 0; i < n; i++) {

            // initialize the minimum element
            // as first element
            int minm = matrix[i][0];

            for (int j = 1; j < m; j++) {

                // check if any element is smaller
                // than the minimum element of the row
                // and replace it
                if (matrix[i][j] < minm) {
                    minm = matrix[i][j];
                }
            }

            // print the smallest element of the row
            System.out.print(minm + ", ");
        }

    }

    // function to find the minimum
// element of each column.
    static void minInCol(int mat[][], int n, int m) {

        System.out.print(" { ");
        for (int i = 0; i < m; i++) {

            // initialize the minimum element
            // as first element
            int minm = mat[0][i];

            // Run the inner loop for columns
            for (int j = 1; j < n; j++) {

                // check if any element is smaller
                // than the minimum element of the column
                // and replace it
                if (mat[j][i] < minm) {
                    minm = mat[j][i];
                }
            }

            // print the smallest element of the row
            System.out.print(minm + ", ");
        }

        System.out.print("}");
    }

    // Driver code
    public static void main(String args[]) {
        int n = 3, m = 3;
        int matrix[][] = {{2, 1, 7},
                {3, 7, 2},
                {5, 4, 9}};

        System.out.print("Minimum element of each row is ");
        minInRow(matrix, n, m);
        System.out.println();

        System.out.print("Minimum element of each column is ");
        minInCol(matrix, n, m);
    }
}
