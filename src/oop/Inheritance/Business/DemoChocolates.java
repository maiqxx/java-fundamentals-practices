package oop.Inheritance.Business;

/**
 * Date: 10/23/2021
 * */

/**Martin makes delicious chocolates in various sizes.
 * Create a class for the business named Chocolates that contains
 * data field for weight, color and price. Create get methods for all
 * three fields. Create a set methods for color and weight, but not for the price.
 * Instead, when the weight is set, determine the price as P15 per gram.
 * Create a child class named DarkChocolate that contains an additional data field named
 * dark and methods to get and set in. in the child class, override the parent’s
 * setWeight( ) method to set the price of a DarkChocolate object to P20 per gram.
 * Write an application that instantiates an object of each type and displays the details.
 * Save the files as Chocolates.java, DarkChocolate.java and DemoChocolates.java.
 * */

import java.text.DecimalFormat;
import java.util.*;
public class DemoChocolates {
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("#.00");

        //Chocolate superclass & object
        Chocolates choco = new Chocolates();

        //asks user input for the chocolate's color
        System.out.print("Enter the color of the desired chocolate : ");
        String color = console.nextLine();
        choco.setColor(color);  //sets colors

        //asks user input for the chocolate's weight
        System.out.print("Enter the weight (in grams) of chocolate : ");
        int weight = console.nextInt();
        choco.setWeight(weight);    //sets weight


        //DarkChocolate subclass & object
        DarkChocolate dark = new DarkChocolate();

        System.out.println();
        System.out.println("DARK CHOCOLATE");
        dark.setColor("Dark Chocolate");    //sets the chocolate's color

        //asks user input for the dark chocolate's weight
        System.out.print("Enter the weight (in grams) of dark chocolate : ");
        int grams = console.nextInt();
        dark.setWeight(grams);      //sets weight

        //Display inputs with getter methods
        System.out.println();
        System.out.println("*************************************");
        System.out.println("Color of Chocolate : " + choco.getColor() + "\n" +
                            "Weight of Chocolate : " + choco.getWeight() + " grams" + "\n" +
                            "Price of the Chocolate : Php " + df.format(choco.getPrice()));

        System.out.println();
        System.out.println("Color of Chocolate : " + dark.getColor() + "\n" +
                            "Weight of Chocolate : " + dark.getWeight() + " grams" + "\n" +
                            "Price of the Chocolate : Php " + df.format(dark.getPrice()));

    }
}
