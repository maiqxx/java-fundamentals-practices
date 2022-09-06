
package oop.practices;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String args[]){
        
        Scanner console = new Scanner(System.in);

        int weight;
        int height;
        double bmi;

        weight = console.nextInt();
        height = console.nextInt();

        bmi = 703 * (weight/(height * height));

        System.out.format("%.1f%n", bmi);

    }
}
