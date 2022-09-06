package oop.Polymorphism.FractionOrMixedFraction;

import java.util.Scanner;

public class Fraction {
    static Scanner scan = new Scanner(System.in);
    int nume, deno;

    Fraction() {
        System.out.println("Fraction default constructor");
        nume = 0;
        deno = 1;
    }

    Fraction(int n, int d) {
        System.out.println("Fraction overloaded constructor");
        nume = n;
        deno = d;
    }

    public int getNumerator()
    {
        return nume;
    }

    public void setNumerator(int n)
    {
        nume = n;
    }

    public int getDenominator()
    {
        return deno;
    }

    public void setDenominator(int d)
    {
        deno = d;
    }


    Fraction plus(Fraction f) {
        // replace this with the actual implementation
        System.out.println("Fraction plus");
        if((deno == 0) || f.deno == 0){
            throw new IllegalArgumentException("invalid denominator");
        }
        // find lowest common denominator
        int common = lcd(deno, f.deno);
        // convert fractions to lcd
        Fraction commonA = new Fraction();
        Fraction commonB = new Fraction();
        commonA = convert(common);
        commonB = f.convert(common);
        // create new fraction to return as sum
        Fraction sum = new Fraction();
        // calculate sum
        sum.nume = commonA.nume + commonB.nume;
        sum.deno = common;
        // reduce the resulting fraction
        sum = sum.reduce();
        return sum;


    }

    Fraction minus(Fraction f) {
        // replace this with the actual implementation
        System.out.println("Fraction minus");

        // check preconditions
        if ((deno == 0) || (f.deno == 0))
            throw new IllegalArgumentException("invalid denominator");
        // find lowest common denominator
        int common = lcd(deno, f.deno);
        // convert fractions to lcd
        Fraction commonA = new Fraction();
        Fraction commonB = new Fraction();
        commonA = convert(common);
        commonB = f.convert(common);
        // create new fraction to return as difference
        Fraction diff = new Fraction();
        // calculate difference
        diff.nume = commonA.nume - commonB.nume;
        diff.deno = common;
        // reduce the resulting fraction
        diff = diff.reduce();
        return diff;
    }

    Fraction times(Fraction f) {
        // replace this with the actual implementation
        System.out.println("Fraction times");

        // check preconditions
        if ((deno == 0) || (f.deno == 0))
            throw new IllegalArgumentException("invalid denominator");
        // create new fraction to return as product
        Fraction product = new Fraction();
        // calculate product
        product.nume = nume * f.nume;
        product.deno = deno * f.deno;
        // reduce the resulting fraction
        product = product.reduce();
        return product;
    }

    Fraction divide(Fraction f) {
        // replace this with the actual implementation
        System.out.println("Fraction divide");

        // check preconditions
        if ((deno == 0) || (f.nume == 0))
            throw new IllegalArgumentException("invalid denominator");
        // create new fraction to return as result
        Fraction result = new Fraction();
        // calculate result
        result.nume = nume * f.deno;
        result.deno = deno * f.nume;
        // reduce the resulting fraction
        result = result.reduce();
        return result;
    }

    public void input()
    {
        // prompt user to enter numerator
        System.out.print("Please enter an integer for numerator: ");
        // get user input
        nume = scan.nextInt();
        // prompt user to enter denominator in a loop to prevent
        // an invalid (zero) value for denominator
        do {
            System.out.print("Please enter a non-zero integer for denominator: ");
            deno = scan.nextInt();
            // make sure it is non-zero
            if (deno == 0)
                System.out.println("Invalid value.  Please try again.");
        } while (deno == 0);
    }

    public void output()
    {
        System.out.print(this);
    }



    public String toString() {
        System.out.println("Fraction toString");

        String buffer = nume + "/" + deno;
        return buffer;
    }

    private int lcd(int denom1, int denom2)
    {
        int factor = denom1;
        while ((denom1 % denom2) != 0)
            denom1 += factor;
        return denom1;
    }

    private int gcd(int deno1, int deno2)
    {
        int factor = deno2;
        while (deno2 != 0) {
            factor = deno2;
            deno2 = deno1 % deno2;
            deno1 = factor;
        }
        return deno1;
    }

    private Fraction convert(int common)
    {
        Fraction result = new Fraction();
        int factor = common / deno;
        result.nume = nume * factor;
        result.deno = common;
        return result;
    }

    private Fraction reduce()
    {
        Fraction result = new Fraction();
        int common = 0;
        // get absolute values for numerator and denominator
        int num = Math.abs(nume);
        int den = Math.abs(deno);
        // figure out which is less, numerator or denominator
        if (num > den)
            common = gcd(num, den);
        else if (num < den)
            common = gcd(den, num);
        else  // if both are the same, don't need to call gcd
            common = num;

        // set result based on common factor derived from gcd
        result.nume = nume / common;
        result.deno = deno / common;
        return result;
    }

}
