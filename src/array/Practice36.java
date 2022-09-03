package array;
//Program to create an array of circles

import java.util.*;
import javafx.scene.shape.Circle;
public class Practice36 {
    static Scanner console = new Scanner(System.in);
    public static void main(String args[]){
        Circle[] circles = new Circle[5];

        double radius;

        for (int i = 0; i < 5; i++)
        {
            System.out.print("Enter the radius of Circle "
                    + (i + 1) + ": ");
            radius = console.nextDouble();
            circles[i] = new Circle(radius);
            System.out.println();
        }
        for(int i = 0; i < 5; i++){
            System.out.printf("Circle " + (i + 1) + ": "
                    + circles[i]);
        }
    }//end main
}
