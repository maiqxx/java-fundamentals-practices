package intro;
/**Description
Write a program that uses while loops to perform the following steps:
 a. Prompt the user to input two integers: firstNum and secondNum. (firstNum must be less secondNum.)
 b. Output all the odd numbers between firstNum and secondNum inclusive.
 c. Output the sum of all even numbers between firstNum and secondNum inclusive.
 d. Output all the numbers and their squares between 1 and 10.
 e. Output the sum of the squares of all the odd numbers between firstNum and secondNum inclusive.
 f. Output all the uppercase letters.
 */

import java.util.Scanner;
public class Practice19 {
    public static void main(String args []){
        Scanner in = new Scanner(System.in);  //Scanner class to get user's input

        //variables
        int firstNum, secondNum;
        int sumEven = 0;
        int sumSquareOdd = 0;

        // Initialize counter
        int counter;

        //Prompt the user to input two integers: firstNum and secondNum. (firstNum must be less secondNum.)
        System.out.println("Enter the first number: ");
        firstNum = in.nextInt();
        System.out.println("First number must be less than the second number you entered...");
        System.out.println("Enter the second number: ");
        secondNum = in.nextInt();


        //b. Output all the odd numbers between firtNum and secondNum inclusive.
        //c. Output the sum of all even numbers between firstNum and secondNum inclusive.
        //calculations
        if (firstNum % 2 == 0){
            counter = firstNum + 1;
        }
        else{
            counter = firstNum;
        }

        System.out.println("Odd integers between " + firstNum + " and "
                + secondNum + " are: ");

        do
        {
            System.out.println(counter + " \n");
            counter += 2;
        }
        while (counter <=secondNum);
        //Calculations
        if (firstNum % 2 == 0){
            counter = firstNum;
        }
        else{
            counter = firstNum + 1;
        }

        do
        {
            sumEven += counter;
            counter += 2;
        }
        while (counter <=secondNum);

        System.out.println("Sum of even integers between " + firstNum + " and "
                + secondNum + " = " + sumEven);

        //d. Output all the numbers and their squares between 1 and 10.
        System.out.println("Number\t Square of Number");


        counter = 1;
        //int counter = 0;
        do
        {
            //d. Output all the numbers and their squares between 1 and 10.
            System.out.println(counter  +  "\t " +counter * counter);
            counter++;
        }
        while (counter <= secondNum);

        //e. Output the sum of the squares of all the odd numbers between firstNum and secondNum inclusive.
        if (firstNum % 2 == 0){

            counter = firstNum + 1;
        }
        else{
            counter = firstNum;
        }

        do
        {
            sumSquareOdd += counter * counter;
        }
        while (counter <= secondNum);

        System.out.println("Sum of the squares of odd integers between " + "\n" +
                firstNum + " and " + secondNum + " = " + sumSquareOdd);


        System.out.println("Upper case letters are: ");

        //f. Output all the uppercase letters.
        System.out.print("Please input a random line that contain uppercase letters in any positions: ");
        String str = in.next();

        System.out.print("Please input a random line that contain uppercase letters in any positions: ");
        str = in.next();

        int i = 0;
        String result = "";
        while (i < str.length() - 1) {

            char aChar = str.charAt(i);

            if (Character.isUpperCase(aChar)) {
                result += aChar;
            }
            i++;
        }
        System.out.println("The uppercase letters are: " + result);
    }
}
