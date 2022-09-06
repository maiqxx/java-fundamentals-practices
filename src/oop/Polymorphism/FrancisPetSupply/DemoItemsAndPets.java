package oop.Polymorphism.FrancisPetSupply;

import java.util.Scanner;

/**
 * Date: 11/13/2021
 * */

/**
* 2. Create an ItemSold class for Francis Pet Supply. Fields include an invoice number,
* description, and price. Create get and set methods for each field. Create a subclass
* named PetSold that descends from ItemSold and includes three Boolean fields that indicate
* whether the pet has been vaccinated, neutered, and housebroken, and include get and set methods
* for these fields. Write an application that creates two objects of each class, and demonstrate
* that all the methods work correctly. Save the files as ItemSold.java, PetSold.java, and DemoItemsAndPets.java.
* */

//main class
public class DemoItemsAndPets {
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {

        //asks user input for invoice number, description, and price
        System.out.print("Enter invoice number : ");
        int invoiceNum = console.nextInt();
        System.out.print("Input some description : ");
        String description = console.next();
        System.out.print("Enter the price : ");
        double price = console.nextDouble();
        ItemSold item = new ItemSold(invoiceNum, description, price);

        System.out.println();
        boolean isVaccinated = true, isNeutered = true, isHousebroken = true;
        ItemSold pet = new PetSold(invoiceNum, description, price, isVaccinated, isNeutered, isHousebroken);
        pet.display();

    }
}
