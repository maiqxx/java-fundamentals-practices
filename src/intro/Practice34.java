package intro;

/**Description:
 * Create a program that reads letter codes ‘A’ through ‘Z’ and prints the corresponding telephone digit.
 * The program uses a sentinel-controlled while loop. To stop the program, the user is prompted for the
 * sentinel which is ‘ # ‘. Use dialog boxes for input/output.
 */

import java.util.Scanner;
import javax.swing.JOptionPane;
public class Practice34 {
    public static void main (String args []){

        //Scanner to get input from user
        Scanner n = new Scanner(System.in);

        //displays dialog box
        JOptionPane.showMessageDialog(null, "This program reads letter codes ‘A’ through ‘Z’ and prints the corresponding telephone digit.");
        JOptionPane.showMessageDialog(null, "To stop the program, press '#' ");

        //getting input
        System.out.println("Enter a letter: ");
        char letter = n.next().charAt(0);

        while (letter != '#' && letter >= 'A' && letter <= 'z'){
            System.out.println("You entered letter: " + letter);
            System.out.println("The correspoding telephone digit is: " + letter);
        }
        if(letter > 'Z'){
            letter = (char) ((int)letter-32);  //convertlowercase to uppercase
        }

        switch (letter){
            case 'A':
            case 'B':
            case 'C':
                System.out.println("2");
                break;
            case 'D':
            case 'E':
            case 'F':
                System.out.println("3");
                break;
            case 'G':
            case 'H':
            case 'I':
                System.out.println("4");
                break;
            case 'J':
            case 'K':
            case 'L':
                System.out.println("5");
                break;
            case 'M':
            case 'N':
            case 'O':
                System.out.println("6");
                break;
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
                System.out.println("7");
                break;
            case 'T':
            case 'U':
            case 'V':
                System.out.println("8");
                break;
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                System.out.println("9");
                break;
            default:
                break;
        }
        System.out.println("Enter another letter.");
        letter = n.next().charAt(0);

    }
}
