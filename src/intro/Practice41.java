package intro;

import java.util.Scanner;
public class Practice41 {
    public static void main(String args[]){

        //Scanner to get input from user
        Scanner console = new Scanner(System.in);

        System.out.printf("Enter any number: ");

        //return the user input as an integer
        int number = console.nextInt();

        if((number % 2) == 0){
            System.out.printf("Nummber %d is even number %n", number);
            //%d- decimal, %n - new line
        } else{
            //number is odd
            System.out.printf("Nummber %d is odd number %n", number);
        }
    }
}
