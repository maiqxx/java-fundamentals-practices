package oop.Polymorphism.Rectangle2;

public class Rectangle {
        private int length;
        private int width;

        Rectangle(int length, int width){
            this.length = length;
            this.width = width;
            System.out.println("Rectangle Constructor");
        }

        Rectangle(){

        }

        public int getLength(){
            return length;
        }

        public int getWidth(){
            return width;
        }

        public int area(){
            System.out.println("Rectangle Area");
            return length * width;
        }

        public int perimeter(){
            System.out.println("Rectangle Perimeter");
            return  (2 * (length + width));
        }

        public void display(){
            System.out.println("Area: " + area());
            System.out.println("Perimeter: " + perimeter());
        }
    }
