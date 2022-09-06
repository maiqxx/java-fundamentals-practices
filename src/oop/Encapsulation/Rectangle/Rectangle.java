package oop.Encapsulation.Rectangle;

public class Rectangle {

        public void display(int x, int y){
            for(int j = 0; j <= x; j++){
                System.out.print("# ");
            }
            System.out.println();
            for(int i = 0; i <= y - 2; i++){
                System.out.print("# ");
                for(int j = 0; j <= x - 2; j++){
                    System.out.print(" ");
                }
                System.out.println("# ");
            }
            for(int i = 0; i <= x; i++){
                System.out.print("# ");
            }
            System.out.print("\n");
        }

        public void area(int x, int y){
            System.out.println("AREA: " + x * y);
        }

        public void perimeter(int x, int y){
            int perimeter = 2 * (y + x);
            System.out.println("PERIMETER: " + perimeter);
        }

        public void centerPoint(double x, double y){
            double xCenter = x / 2;
            double yCenter = y / 2;
            System.out.println("CENTR POINT: " + "(" + xCenter + "0," + yCenter + "0)");
        }

        public void isSquare(int x, int y) {
            if (x == y) {
                System.out.println("SQUARE");
            } else {
                System.out.println("RECTANGLE");
            }
        }
}
