package intro;

/**
 Write a java program that prompts the user to input the elapsed time for an event in hours, minutes,
and seconds. The program then outputs the elapsed time in seconds.
 */

import javax.swing.JOptionPane;
public class Practice22 {
    public static void main(String[] args){

        //declaring variables for hours, minutes, & seconds
        int hour, min, sec;
        String time;
        String timeDIsplay;

        //prompts the user to input the elapsed time for an event in hours, minutes,and seconds
        time = JOptionPane.showInputDialog("Enter hours: ");
        hour = Integer.parseInt(time);
        time = JOptionPane.showInputDialog("Enter minutes: ");
        min = Integer.parseInt(time);
        time = JOptionPane.showInputDialog("Enter seconds: ");
        sec = Integer.parseInt(time);

        //calculation
        int totalTime = (hour * 60 * 60) + sec;

        //display output and title
        timeDIsplay = "Hours:" + hour + "\n" +
                "Minutes:" + min + "\n" +
                "Seconds:" + sec;

        JOptionPane.showMessageDialog(null, timeDIsplay, "Elapsed Time", JOptionPane.INFORMATION_MESSAGE);
    }
}
