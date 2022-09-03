package array;
/**Description:
Read the IDs and the grades for all Programming I students. Computer and print the
 average of the students. Print the grade and IDs of all students who got a grade below
 the average.
 *
 */

import java.util.Scanner;
public class Practice10 {
    public static void main(String args[]){
        Scanner id = new Scanner(System.in);

        System.out.print("Enter the number of students in your class: ");
        int numOfStudents = id.nextInt();

        int grade[] = new int[numOfStudents];

        String name;
        int lowAve = 0;

        //takes input
        System.out.println();
        System.out.println("Enter the names of the students: ");
        for(int i = 0; i < numOfStudents; i++){

            System.out.printf("Student[%d]: ", (i+1));
            name = id.next();

            System.out.println("Grade: ");
            grade[i] = id.nextInt();


            //calculating
            if (grade[i] >= 76 && grade[i] <= 100){
                System.out.print(" - Excellent\n\n");
            } else if (grade[i] >= 51 && grade[i]  <= 75){
                System.out.print(" - Good\n\n");
            } else if(grade[i] >= 26 && grade[i] <= 50){
                System.out.print(" - Average\n\n");
            } else if(grade[i]  >= 0 && grade[i] <= 25){
                System.out.print(" - Poor\n\n");
                lowAve++;
            }
        }
        System.out.println("Low average students are: " + lowAve);
    }
}
