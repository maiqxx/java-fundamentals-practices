package oop.Inheritance.Jockey;
/**
 * Date: 10/23/2021
 * */

/**
 * 1. Create a class named Jockey that contains the data fields for the name, color and birth year.
 * Include the get and set methods for these fields. Next, create a subclass name RaceJockey,
 * which contains an additional field that holds the number of races in which the jockey has competed
 * and additional methods to get and set the new fields. Write an application that demonstrates using
 * objects of each class. Save the files as Jockey.java, RaceJockey.java and DemoJockey.java.
 * */

import java.util.*;
public class DemoJockey {
    static  Scanner console = new Scanner(System.in);
    public static void main(String[] args){

        //instantiating objects
        Jockey jockey = new Jockey();
        RaceJockey race = new RaceJockey();

        //asks user input
        System.out.print("Enter the name of the jockey : " );
        String name = console.nextLine();

        System.out.print("Enter the color of the jockey's horse : ");
        String color = console.nextLine();

        System.out.print("Enter the birth year of the jockey's horse : ");
        String birthYear = console.nextLine();

        System.out.print("Enter the number of races : ");
        int numOfRaces = console.nextInt();

        //setting the attributes & calls the methods from Jockey class
        jockey.setName(name);
        jockey.setColor(color);
        jockey.setBirthYear(birthYear);

        //setting the number of races & calls the method from RaceJockey subclass
        race.setNumberOfRaces(numOfRaces);

        //prints the inputs & calls the getter methods
        System.out.println();
        System.out.println("Name of the Jockey: " + jockey.getName() + "\n" +
                            "Color of the Jockey's Horse: " + jockey.getColor() + "\n" +
                            "Birth year of the Jockey's Horse: " + jockey.getBirthYear() + "\n" +
                            "Number of Races: " + race.getNumberOfRaces());
    }
}
