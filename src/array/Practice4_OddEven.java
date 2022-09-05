package array;
/**Description:
Java program that identifies if it is odd or even.
 */

import java.util.Scanner;
public class Practice4_OddEven {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int num = sc.nextInt();

        //initializing array
        int[] array = new int[num];
        System.out.println("Enter the elements:" );

        //initializing values entered by user

        for (int i = 0; i < num; i++){
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < num; i++){
            //identifies even number
            if(array[i] % 2 == 0)
            {

                System.out.println(array[i] + " is EVEN" );
            }

            //identifies odd number
            else{
                System.out.println(array[i] + " is ODD" );
            }
        }
    }
}
