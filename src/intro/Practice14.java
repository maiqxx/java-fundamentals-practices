package intro;
/*
Descripttion:
2.) A box of cookies can hold 24 cookies and a container can hold 75 boxes of cookies. Write a
program that prompts the user to enter the total number of cookies. The program then outputs
the number of boxes and the number of containers to ship the cookies. Note that each box must
contain the specified number of cookies and each container must contain the specified number
of boxes. If the last box of cookies contains less than the number of specified cookies, you can
discard it, and output the number of leftover cookies. Similarly, if the last container contains less
than the number of specified boxes, you can discard it, and output the number of leftover
boxes.
*/

import java.util.Scanner;
public class Practice14 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        //declaring variables
        int maximumBoxes = 24;
        int containers = 75;
        int numCookies = 0, numBoxes, numContainers = 0, leftOverCookies = 0, leftOverBoxes = 0;

        /*numBoxes = numCookies / maximumBoxes;
        leftOverCookies = numCookies % maximumBoxes;
        numContainers = numBoxes / containers;
        leftOverBoxes = numBoxes % containers;*/

        //prompts the user to enter the total number of cookies
        System.out.println("Hello! Please enter number of cookies you have: ");
        numCookies = input.nextInt();

        //calculation
        if(numCookies < maximumBoxes){
            numBoxes = numCookies / maximumBoxes;
        } else {
            numBoxes = numCookies / maximumBoxes;
            if(numCookies > maximumBoxes){
                leftOverCookies = numCookies % maximumBoxes;
            }
        }
        if(numBoxes < containers){
            leftOverBoxes = numBoxes % containers;
        } else {
            numContainers = containers / numBoxes;
            if(containers < numBoxes){
                leftOverBoxes = numBoxes % containers;
            }
        }
        //display outputs
        System.out.println("Number of Boxes: " + numBoxes);
        System.out.println("Left-Over Cookies: " + leftOverCookies);
        System.out.println("Number of Containers: " + numContainers);
        System.out.println("Left-Over Boxes: " + leftOverBoxes);

    }
}
