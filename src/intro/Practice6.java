package intro;
/*
Write a Java program that prompts the user to input the elapsed time for an event in hours,
minutes and seconds. The program then output the elapsed time in seconds.
 */

import javax.swing.JOptionPane;
public class Practice6 {
    public static void main(String[] args){

        int hour, min, sec;   //declare 3 variables for hours, minutes, & seconds
        String elapsed;
        String timeDIsplay;

        elapsed = JOptionPane.showInputDialog("Enter hours: ");
        hour = Integer.parseInt(elapsed);

        elapsed = JOptionPane.showInputDialog("Enter minutes: ");
        min = Integer.parseInt(elapsed);

        elapsed = JOptionPane.showInputDialog("Enter seconds: ");
        sec = Integer.parseInt(elapsed);

        int totalTime = (hour * 60 * 60) + sec;  //calculating time in seconds

        timeDIsplay = "Hours:" + hour + "\n" +
                "Minutes:" + min + "\n" +
                "Seconds:" + sec;

        JOptionPane.showMessageDialog(null, timeDIsplay, "Elapsed Time", JOptionPane.INFORMATION_MESSAGE);
    }

}
