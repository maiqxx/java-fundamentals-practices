package array;

public class Practice44 {
    public static void main(String args []){
        int i, j, k;
        for(i = 1; i <= 5; i++){
            for(j = 4; j >= i; j--){
            }
            for(k = 1; k <= (2*i-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
