
package oop.Inheritance.Customer;

//subclass or child class
public class CustomerDetails extends Customer{
    
    //declaring variables for the customer details
    private int age;
    private String address;
    
    //method to get age
    public int getage(){
        return age;
    }
    
    //method to set age
    public void setage(int age){
        this.age = age;
    }
    
    //method to get the address
    public String getaddress(){
        return address;
    }
    
    //method to set the address
    public void setaddress(String address){
        this.address = address;
    }
}
