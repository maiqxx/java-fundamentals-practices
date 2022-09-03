package intro;
/**Description:
 *A student letter grade is calculated according to the following schedule. Write a program that
 accepts a student’s numerical grade, converts the numerical grade to an equivalent letter grade
 displays the letter grade
 */

import java.util.Scanner;
public class Practice29 {
    public static void main(String args[]){
        Scanner gr = new Scanner(System.in);

        int grade;  //this variable stores numeric grade
        char mark = 0;  //this variable stores a letter grade

        //getting input
        System.out.println("Enter your grade: ");
        grade = gr.nextInt();  //scans the grade

        //calculate grade
        if (grade > 100){
            System.out.println("Not valid mark!");
        }else if (grade >= 90){
            mark = 'A';
        } else if (grade <= 90 && grade >= 80) {
            mark = 'B';
        } else if (grade <= 80 && grade >= 70){
            mark = 'C';
        } else if (grade <= 70 && grade >= 60){
            mark = 'D';
        } else if(grade < 60){
            mark = 'F';
        } else{
            System.out.println("Invalid grade");
        }

        //displays the grade
        System.out.println("Your grade is " + mark);
    }
}
