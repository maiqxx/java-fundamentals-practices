package intro;
/**Description:
Create a program to input two numbers and output their sum. And ask if he/she would like to run the
 program. If the answer is Y or y, it prompts the user to enter two numbers. After adding the number and
 displaying the result, it again asks the user if he/she would like to add more numbers.
 */

import java.util.Scanner;  //Scanner class to get user's input
public class Practice18 {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

        //declaring variables
        int num1, num2, sum = 0;
        char choice = 0;

        do{
            //asks user for input
            System.out.println("Enter your first number: ");
            num1 = sc.nextInt();
            System.out.println("Enter your second number: ");
            num2 = sc.nextInt();

            sum = num1 + num2; //calculates

            //displays results and asks the user if she/he would like to run the program again
            System.out.println("The sum of the numbers you entered is: " + sum);
            System.out.println("Would you like to run the program [Y/y]? ");
            choice = sc.next().charAt(0);

        }
        while ((choice == 'y') || (choice == 'Y'));  //press y or Y if the user likes to run the program again
        //displays results
        System.out.println("The sum of the numbers you entered is: " + sum);
    }
}
