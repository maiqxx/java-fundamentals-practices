package oop.Polymorphism.ChocolateBusiness;

/**
 * Date: 11/13/2021
 * */

/**
 * 1. Martin makes delicious chocolates in various sizes.
 * Create a class for the business named Chocolates that contains
 * data field for weight, color and price. Create get methods for all
 * three fields. Create a set methods for color and weight, but not for the price.
 * Instead, when the weight is set, determine the price as P15 per gram.
 * Create a child class named DarkChocolate that contains an additional data field named
 * dark and methods to get and set in. in the child class, override the parent’s
 * setWeight( ) method to set the price of a DarkChocolate object to P20 per gram.
 * Write an application that instantiates an object of each type and displays the details.
 * Save the files as Chocolates.java, DarkChocolate.java and DemoChocolates.java.
 *
 * */


import java.text.DecimalFormat;
import java.util.Scanner;

public class DemoChocolates {
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("#.00");

        //Chocolate superclass & object
        Chocolates c = new Chocolates();

        //asks user input for the chocolate's color
        System.out.print("Enter the color of the desired chocolate : ");
        String color = console.nextLine();
        c.setColor(color);  //sets colors

        //asks user input for the chocolate's weight
        System.out.print("Enter the weight (in grams) of chocolate : ");
        int weight = console.nextInt();
        c.setWeight(weight);    //sets weight


        //Chocolate super class referring the DarkChocolate subclass
        Chocolates dark = new DarkChocolate();

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
        System.out.println("Color of Chocolate : " + c.getColor() + "\n" +
                "Weight of Chocolate : " + c.getWeight() + " grams" + "\n" +
                "Price of the Chocolate : Php " + df.format(c.getPrice()));

        System.out.println();
        System.out.println("Color of Chocolate : " + dark.getColor() + "\n" +
                "Weight of Chocolate : " + dark.getWeight() + " grams" + "\n" +
                "Price of the Chocolate : Php " + df.format(dark.getPrice()));

    }
}