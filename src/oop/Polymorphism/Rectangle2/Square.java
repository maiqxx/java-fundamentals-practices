package oop.Polymorphism.Rectangle2;

public class Square extends Rectangle{

    private int length;
    Square(int length){
        super();
        this.length = length;
        System.out.println("Square Constructor");
    }

    public int squareArea(){
        System.out.println("Square Area");
        return length *  length;
    }

    public int squarePerimeter(){
        System.out.println("Square Perimeter");
        return  4 * length;
    }

    public void display(){
        System.out.println("Area: " + squareArea());
        System.out.println("Perimeter: " + squarePerimeter());
    }
}