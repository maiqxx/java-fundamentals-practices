package intro;

/**Description:
Write a program that prompts the user to input an integer between 0 and 35. If the number is
 less than or equal to 9, the program should output the number; otherwise, it should output A
 for 10, B for 11, C for 12,....., and Z for 35.
 */

import java.util.Scanner;
public class Practice28 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int num; //declare variable

        //getting input
        System.out.println("Enter a number between 0 to 35: ");
        num = in.nextInt();

        if (num <= 9){
            //prints when you enter numbers less than or equal to 9
            System.out.println("You entered " + num);
        } else{
            //prints a character when you enter numbers from 10 to 35
            System.out.println((char)((byte)'A' + (num -10)));
        }
    }
}
