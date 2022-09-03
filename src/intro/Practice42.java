package intro;
/*
 * A person invests $ 1000.00 in a savings account
yielding 5 % interest. Assuming that all interests is left
on deposit in the account, calculate and print the amount
of money in the account at the end of each year for ten
years. Use the following formula for determining these
amounts:

                    n
	a = p(1 + r)

where
	p = original amount invested (Principal),
	r = annual interest rate,
	n = number of years, and
	a = amount on deposit at the end of the nth year.
 *
 */

//Calculation of Compound Interest

public class Practice42 {
    public static void main (String args[]){
        double amount;             //amount on deposit
        double principal =  1000.0;//starting principal
        double rate = 0.05;        //interest rate

        System.out.println("Amount on Deposit:");

        for(int year = 1; year <= 10; year++){
            amount = principal * Math.pow (1.0 + rate, year);

            System.out.println("Year[" + year + "]: " + amount);
        }
    }
}
