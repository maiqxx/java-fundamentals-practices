package oop.Encapsulation.Rectangle;

import java.util.Scanner;

public class RectangleMain {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Coordinates coor = new Coordinates();
        Rectangle rectangle = new Rectangle();

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        coor.setX(x);
        coor.setY(y);
        rectangle.display(x, y);
        rectangle.isSquare(x, y);
        rectangle.area(x, y);
        rectangle.perimeter(x, y);
        rectangle.centerPoint(x, y);
    }
}
