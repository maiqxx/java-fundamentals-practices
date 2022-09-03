package intro;

/**
 A sphere is a perfectly round geometrical object in three-dimensional space that is the surface of a
completely round ball. In three dimensions, the volume inside a sphere is derived to be
V = 4/3*π*r3 where r is the radius of the sphere
 */

import javax.swing.JOptionPane;
public class Practice23 {
    public static void main(String[] args){

        //variable declaration
        double radius, volume;
        String circle;
        String output;

        //takes input
        circle = JOptionPane.showInputDialog("Enter radius: ");
        radius = Double.parseDouble(circle);

        //calculation
        volume = (4.0 / 3.0)* Math.PI *(radius * radius *radius);

        //display output
        output = "Volume of the Sphere: " + volume;
        JOptionPane.showMessageDialog(null, output, "3D Sphere", JOptionPane.INFORMATION_MESSAGE);
    }
}
