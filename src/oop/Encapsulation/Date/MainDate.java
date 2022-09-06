package oop.Encapsulation.Date;
import java.util.Scanner;

public class MainDate {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int mode = sc.nextInt();

        Date date = null;
        if (mode == 1) {
            date = new Date();
        } else if (mode == 2) {
            int day = sc.nextInt();
            int month = sc.nextInt();
            int year = sc.nextInt();
            date = new Date(day, month, year);
        }

        int m = sc.nextInt();

        for (int ctr = 0; ctr < m; ctr++) {
            int operation = sc.nextInt();

            if (operation == 1) {
                int day = sc.nextInt();
                date.setDay(day);
            } else if (operation == 2) {
                int month = sc.nextInt();
                date.setMonth(month);
            } else if (operation == 3) {
                int year = sc.nextInt();
                date.setYear(year);
            } else if (operation == 4) {
                int day = sc.nextInt();
                int month = sc.nextInt();
                int year = sc.nextInt();

                date.setDate(day, month, year);
            } else if (operation == 5) {
                System.out.println(date.getDay());
            } else if (operation == 6) {
                System.out.println(date.getMonth());
            } else if (operation == 7) {
                System.out.println(date.getYear());
            } else if (operation == 8) {
                System.out.println(date.toString());
            } else if (operation == 9) {
                System.out.println(date.dayOfTheWeek());
            }
        }
    }
}
