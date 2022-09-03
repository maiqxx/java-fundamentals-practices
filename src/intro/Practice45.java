package intro;

import java.util.Scanner;
public class Practice45 {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);

        double wages, rate, hour;

        System.out.println("Enter the working hours: ");
        hour = input.nextDouble();

        System.out.println("Enter the pay rate: ");
        rate = input.nextDouble();

        if(hour > 40.0){
            wages = 40.0 * rate + 1.5 * rate * (hour - 40.0);
        } else {
            wages = hour * rate;
        }
        System.out.printf("The wages are %.2f\n", wages);
    }
}
