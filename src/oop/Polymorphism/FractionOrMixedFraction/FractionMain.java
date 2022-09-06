package oop.Polymorphism.FractionOrMixedFraction;

public class FractionMain {
    public static void main(String args[]) {

        Fraction f1 = new Fraction();   // local fraction objects
        Fraction f2 = new Fraction();   // used to test methods

        // one way to set up fractions is simply to hard-code some values
        f1.setNumerator(1);
        f1.setDenominator(3);
        f2.setNumerator(1);
        f2.setDenominator(6);

        // try some arithmetic on these fractions
        Fraction result = new Fraction();
        // test addition
        result = f1.plus(f2);
        // one way to output results, using toString method directly
        System.out.println(f1 + " + " + f2 + " = " + result);
        // test addition going the other way - should be same result
        result = f2.plus(f1);
        // output results
        System.out.println(f2 + " + " + f1 + " = " + result);
        System.out.println();

        // test subtraction
        result = f1.minus(f2);
        // output results
        System.out.println(f1 + " - " + f2 + " = " + result);
        // test subtraction going the other way - should be different result
        result = f2.minus(f1);
        // output results
        System.out.println(f2 + " - " + f1 + " = " + result);

        // another way to set up fractions is to get user input
        System.out.println();
        System.out.println("Fraction 1:");
        f1.input();
        System.out.println();
        System.out.println("Fraction 2:");
        f2.input();
        System.out.println();

        // test multiplication
        result = f1.times(f2);

        // another way to output results is to use the output method
        // this uses the toString method indirectly
        f1.output();
        System.out.print(" * ");
        f2.output();
        System.out.print(" = ");
        result.output();
        System.out.println();

        // test division
        result = f1.divide(f2);

        // output results
        f1.output();
        System.out.print(" / ");
        f2.output();
        System.out.print(" = ");
        result.output();
        System.out.println();
    }
}
