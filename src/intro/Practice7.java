package intro;
/*
Write a Java program that computes the area and circumference of circle with GUI
implementation.
* */

import javax.swing.JOptionPane;  /*creates a dialog box that can appear on the computer’s desktop*/
public class Practice7 {
    public static void main(String[] args){
        double radius, area,circumference;  //declaring variables
        String radiusStringVar;
        String displayStr;

        radiusStringVar = JOptionPane.showInputDialog("Enter radius: ");
        radius = Double.parseDouble(radiusStringVar);// takes input

        //cslculates the circumference of the circle
        area = Math.PI * radius * radius;
        circumference = 2 * Math.PI * radius;

        //these strings will display on the dialog box
        displayStr = "Radius:" + radius + "\n" +
                "Area:" + area + " square units\n" +
                "Circumference:" + circumference + " units";

        // a method that shows the dialog box as the information message
        JOptionPane.showMessageDialog(null, displayStr, "Circumference of a Circle", JOptionPane.INFORMATION_MESSAGE);
    }
}
