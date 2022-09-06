
package oop.Inheritance.Customer;

//superclass or parent class
public class Customer {
    
    //data field
    private String customername;
    
    //method that gets the customer name
    public String getCustomername(){
        return customername;
    }
    
    //method that sets the customer name
    public void setCustomername(String name){
        customername = name;
    }
    
    //method that displays a customer information 
    public void displaycustinfo(){
        System.out.println();
        System.out.print("Customer Name: ");
    }
    
   
}
