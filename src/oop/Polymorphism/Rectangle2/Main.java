package oop.Polymorphism.Rectangle2;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        Square s = new Square(length);

        s.display();
    }
}
