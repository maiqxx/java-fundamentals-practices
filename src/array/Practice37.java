package array;

public class Practice37 {
    public static void main(String args []){
        int integers[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        int i, j;

        for( i = 0; i < 3; i++){
            int sum = 0;
            for (j = 0; j < 4; j++){

                sum += integers[i][j];

                System.out.println("The sum of row " + (i + 1) + ": " + sum);
            }
        }

    }
}
