package intro;
/*
Write a Java program that prompts the user to input the elapsed time for an event in
seconds. The program then outputs the elapsed time in hours, minutes and seconds(for
example, if the elapsed time is 9630 seconds, then the output is 2:40:30).
 */

import java.util.Scanner;
public class Practice8 {
    public static void main(String[] args){
        Scanner timeInput = new Scanner(System.in);
        int hour, min, sec;   //declare 3 variables for hours, minutes, & seconds

        System.out.println("Enter hours: ");
        hour = timeInput.nextInt();  //takes input of hours
        System.out.println("Enter minutes: ");
        min = timeInput.nextInt();  //takes input of minutes
        System.out.println("Enter seconds: ");
        sec = timeInput.nextInt();  //takes input of seconds

        int totalTime = (hour * 60 * 60) + sec;  //calculating time in seconds

        //prints the total time in seconds
        System.out.println("Total of elapsed time in seconds: " + totalTime + "\n" +
                hour + ":" + min + ":" + sec);
    }
}
