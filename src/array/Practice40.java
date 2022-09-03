package array;

/**Description:
 * Suppose there are 20 students in a class. Each student obtains marks in range 0-100.
 Write a program to count number of students in following groups.
 Poor (0-25), Average (26-50), Good (51-75), Excellent (76-100).
 */

import java.util.Scanner;
public class Practice40 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int student[] = new int[20]; //declaring array with the size of 20 students

        //takes input of student's grades
        System.out.println("Enter each students' grade:");
        for(int i = 0; i < student.length; i++){
            System.out.print("Student " + (i+1) + " : ");
            student[i] = in.nextInt();
        }
        //declaring the group of students
        int poor = 0;
        int average = 0;
        int good = 0;
        int excellent = 0;

        for(int i = 0; i < student.length; i++){
            //tests the grades being entered
            if(student[i] >= 76 &&  student[i] <= 100){
                excellent++;
            } else if (student[i] >= 51 &&  student[i] <= 75){
                good++;
            } else if (student[i] >= 26 &&  student[i] <= 50){
                average++;
            } else if (student[i] >= 0 &&  student[i] <= 25){
                poor++;
            }
        }
        //displays results
        System.out.println();
        System.out.print("\nGroup \t\t Range \t Student Count\t");
        System.out.print("\nPoor: \t\t 0-25 \t\t" + poor + "\t");
        System.out.print("\nAverage: \t 26-50 \t\t" + average + "\t");
        System.out.print("\nGood: \t\t 51-75 \t\t" + good + "\t");
        System.out.print("\nExcellent: \t 76-100 \t" + excellent + "\t");

    }
}
