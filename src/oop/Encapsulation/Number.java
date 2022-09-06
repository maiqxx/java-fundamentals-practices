package oop.Encapsulation;

enum Sign {
    ZERO, POSITIVE, NEGATIVE;
}

enum Parity {
    ODD, EVEN;
}

enum Primality {
    NEITHER, PRIME, COMPOSITE;
}

// the default access modifier of this class is package
public class Number {
    // instance variables
    private int value; // represents the actual integer value
    private int sign;
    private int parity;
    private int primality;


    Number() { // default constructor
        value = 0;
        sign = 0;
        parity = 0;
        primality = 0;
    }

    Number(int n) { // overloaded constructor, n is the argument or parameter and it is int
        value = n;
        signCheck();
        parityCheck();
        primalityCheck();
    }

    // checks and assigns appropriate sign
    private void signCheck() {
        if(value < 0)
            sign = -1;
        else if(value > 0)
            sign = 1;
        else
            sign = 0;
    }

    // checks and assigns appropriate parity
    private void parityCheck() {
        if(value % 2 == 0)
            parity = 0;
        else
            parity = 1;
    }

    // checks and assigns appropriate primality
    private void primalityCheck() {
        if(value > 0) {
            boolean prime = true;
            for(int cf = 2; prime && cf * cf <= value; cf ++)
                if(value % cf == 0)
                    prime = false;
            if(prime)
                primality = 1;
            else
                primality = 2;
        } else
            primality = 0;
    }



    int getValue() {
        return value;
    }

    int getSign() {
        return sign;
    }

    int getParity() {
        return parity;
    }

    int getPrimality() {
        return primality;
    }

    void setValue(int n) {
        value = n;
        signCheck();
        parityCheck();
        primalityCheck();
    }

    void display() {
        System.out.println("value: " + value);
        System.out.println("sign: " + sign);
        System.out.println("parity: " + parity);
        System.out.println("primality: " + primality);
        System.out.println();
    }
}
