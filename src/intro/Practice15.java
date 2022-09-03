package intro;
/*
Descripttion:
Write a program that mimics a calculator. The program should take as input two integers and
arithmetic operation(+, -, *, or /) to be performed. It should then output the numbers, the
operator and the result. (for division, if the denominator is zero, output an appropriate
message.) Some sample outputs follow:
3+4 = 7
13*5=65
*/

import java.util.Scanner;
public class Practice15 {
    public static void main(String args[]){
        System.out.println("------------------------------------------------------------------------");
        System.out.println("****\t A PROGRAM THAT MIMICS A CALCULATOR\t*****");
        System.out.println("------------------------------------------------------------------------");

        Scanner in = new Scanner(System.in); //an object of Scanner class

        //input variables
        int num1, num2, result = 0;
        char op;

        System.out.println("Enter the first integer: ");
        num1 = in.nextInt();
        System.out.println("Enter the an operator [+, -, *, /]: ");
        op = in.next().charAt(0);
        System.out.println("Enter the second integer: ");
        num2 = in.nextInt();

        //calculation
        switch(op){
            //performs addition
            case '+':
                result = num1 + num2;
                break;

            //performs subtraction
            case '-':
                result = num1 - num2;
                break;

            //performs multiplication
            case '*':
                result = num1 * num2;
                break;

            //performs division
            case '/':
                //if you input 0 as denominator
                if (num2 == 0){
                    System.out.println("Error: Cannot divide by 0. Please retry.");
                    break;
                }else {
                    result = num1 / num2;
                    break;
                }
            default:
                System.out.println("Error: Unknown operator... Please retry.");
                break;
        }
        //displays results
        System.out.println();
        System.out.println(num1 + " "+ op + " " + num2 + " " + "=" + " " + result);

    }
}
