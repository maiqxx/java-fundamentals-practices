package intro;
/**Description:
Java program to read age of 15 person and count total Baby age, School age and Adult age &amp; find out
 how many of them fall under:
 a. Still a baby = age 0 to 5
 b. Attending school = age 6 to 17
 c. Adult life = age 18 &amp; over
 *
 */

import java.util.Scanner;
public class Practice32 {
    public static void main(String args[]){

        //Scanner to get input from user
        Scanner in = new Scanner(System.in);

        //declaring variables
        int age;
        int baby = 0, student = 0, adult = 0;
        int count = 0;

        while(count < 15 ){
            //getting age input for 15 persons
            System.out.printf("Enter age of person [%d]: ", count++);
            age = in.nextInt(); //reads age input

            if (age >= 0 && age <= 5){
                baby++;
            } else if (age >= 6 && age <= 17){
                student++;
            } else{
                adult++;
            }

        }
        //Prints the total  umber of babies, students, and adults
        System.out.println();
        System.out.println("Still a baby: " + baby);
        System.out.println("Attending school: " + student);
        System.out.println("Adult life: " + adult);
    }
}
