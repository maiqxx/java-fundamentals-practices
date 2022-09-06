package oop.Inheritance.Jockey;

public class Jockey {

    //declaring attributes
    private String name;
    private String color;
    private String birthYear;

    //method for getting the name
    public String getName(){
        return name;
    }

    //method for setting the name
    public void setName(String name){
        this.name = name;
    }

    //method for getting the color
    public String getColor(){
        return color;
    }

    //method for setting the color
    public void setColor(String color) {
        this.color = color;
    }

    //method for getting the birth year
    public String getBirthYear(){
        return birthYear;
    }

    //method for setting the birth year
    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }
}
