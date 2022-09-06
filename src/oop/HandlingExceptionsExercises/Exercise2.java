
/*
Exercise 2:

The program generates no errors.

The output of the program is:
101
*/

package oop.HandlingExceptionsExercises;

public class Exercise2 {
    private int x = 101;

    private void f(int x) {
        x++;
        g();
    }

    private void g() {
        System.out.println(x);
    }

    public static void main(String[] args) {
        Exercise2 e = new Exercise2();
        int x = 200;
        e.f(x);

    }
}

