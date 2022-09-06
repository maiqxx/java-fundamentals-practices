package oop.Polymorphism.ChocolateBusiness;

public class DarkChocolate extends Chocolates{
    //declaring additional variable
    private String dark;

    //getter & setter methods for color
    public String getColor(){
        return dark;
    }

    public void setColor(String dark){
        this.dark = dark;
    }

    // This method overrides setWeight() method of parent class
    @Override
    public void setWeight(int w){

        //final keyword is a non-access specifier that is used to restrict a class, variable, and method
        final double perGram = 20;
        super.setWeight(w);     //super keyword used to invoke parent class method
        price = w * perGram;
    }
}
