
/*
Exercise 3:

Compilation error

The classes Base() and Derived() should be declared static because it is a nested class and
the program doesn't require a reference to the outer class.

The output of the program after making some correction:

I am an object of the Base class
I am an object of the Derived class, I am an object of the Base class
I am an object of the Derived class, I am an object of the Base class


* */

package oop.HandlingExceptionsExercises;

public class Exercise3 {
    public static class Base {
        public Base() {
            infob = "I am an object of the Base class";
        }
        public String getInfo() {
            return infob;
        }
        private String infob;
    }
    public static class Derived extends Base {
        public Derived() {
            super();
            infod = "I am an object of the Derived class";
        }
        public String getInfo() {
            return infod + ", " + super.getInfo();
        }
        private String infod;
    }

    public static void main(String[] args) {
        Base b = new Base();
        Derived d = new Derived();
        System.out.println(b.getInfo());
        System.out.println(d.getInfo());
        b = d;
        System.out.println(b.getInfo());
    }

}


