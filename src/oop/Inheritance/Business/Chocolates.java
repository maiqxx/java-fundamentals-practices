package oop.Inheritance.Business;

public class Chocolates {

    //declaring instance variables
    private int weight;
    private String color;
    protected double price; //gives read/write access to subclass

    //getter method for weight
    public int getWeight() {
        return weight;
    }

    //getter method for color
    public String getColor() {
        return color;
    }

    //getter method for price
    public double getPrice(){
        return price;
    }

    //setter method for color
    public void setColor(String color){
        this.color = color;
    }

    //setter method for weight
    public void setWeight(int w){

        //putting a final keyword so that the value of the variable cannot be inherited
        final double perGram = 15;

        weight = w;
        price = weight * perGram;
    }
}
