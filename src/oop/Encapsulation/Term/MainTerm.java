package oop.Encapsulation.Term;

import java.util.Scanner;

public class MainTerm {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);


        System.out.print("Enter coef & expo for first term: ");
        int coef1 = input.nextInt();
        input.nextLine();
        int expo1 = input.nextInt();
        Term term1 = new Term(coef1, expo1);

        System.out.print("Enter coef & expo for second term: ");
        int coef2 = input.nextInt();
        input.nextLine();
        int expo2 = input.nextInt();
        Term term2 = new Term(coef2, expo2);


        Term result;

        result = term1.multiply(term2);
        System.out.println(result.toString());

        //Term term3 = new Term(4, 4);
        //Term term4 = new Term(3, 3);

        /*
        result = term1.add(term3);
        System.out.println(result.toString());

        result = term1.subtract(term3);
        System.out.println(result.toString());

        result = term3.divide(term4);
        System.out.println(result.toString()); */
    }
}
