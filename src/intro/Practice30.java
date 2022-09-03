package intro;
/**
 Pyramid Pattern
 */
public class Practice30 {
    public static void main(String[] args){

        int rows = 3, j = 0;
        //outer loop
        for (int i = 1; i <= rows; ++i, j = 0) {

            //inner loop
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            //prints the pattern
            while (j != 2 * i - 1) {
                System.out.print("* ");
                ++j;
            }

            System.out.println();
        }
    }
}
