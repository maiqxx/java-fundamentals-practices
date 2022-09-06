
package oop.Inheritance.Customer;

/**
 *
 * Date: 10/30/2021
 */

import java.util.*;

public class TestCustomer2 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        String name;    //declaring variable for the customer's name
        int age;
        String address;
        
        Customer c = new Customer();    //Customer object
        CustomerDetails customer = new CustomerDetails();
        
        System.out.print("Enter customer name: ");
        name = keyboard.nextLine();
        c.setCustomername(name);            
        
        System.out.print("\nEnter address: ");
        address = keyboard.nextLine();
        System.out.print("\nEnter age: ");
        age = keyboard.nextInt();
        
        customer.setaddress(address);
        customer.setage(age);
        c.displaycustinfo();
        System.out.print(c.getCustomername());
        System.out.println("\nAge : "+ customer.getage());
        System.out.println("Address : " +customer.getaddress());
        
    }
}
