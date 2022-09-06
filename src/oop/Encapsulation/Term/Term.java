package oop.Encapsulation.Term;

public class Term {
    private int coefficient;
    private int exponent;

    public Term (int coE, int expo){
        this.coefficient = coE;
        this.exponent = expo;
    }

    public int getCoefficient(){
        return (coefficient);
    }

    public int getExponent(){
        return (exponent);
    }

    public Term multiply(Term t){
        int expo = exponent + t.getExponent();
        int num = (int) (coefficient * t.getCoefficient());

        return (new Term(num, expo));
    }

    public String toString(){
        String buff = "";

        if(coefficient == 0){
            buff = "0";
        } else{
            if(coefficient != 1){
                buff += coefficient;
            }

            if(exponent != 0){
                buff += "x";
                if(exponent > 1){
                    buff += ("^" + exponent);
                }
            }
        }
        return (buff);
    }

    /*
    public Term add(Term t){
        Term term = null;

        if(exponent == t.getExponent()){
            int num = (int) (coefficient + t.getCoefficient());
            term = new Term(num, exponent);
        }
        return (term);
    } */

    /*
    public Term subtract(Term t){
        Term term = null;

        if(exponent == t.getExponent()){
            double num = coefficient - t.getCoefficient();
            term = new Term(num, exponent);
        }
        return (term);
    }*/




    /*
    public Term divide(Term t){
        Term term = null;

        double coE = t.getCoefficient();
        if(coE != 0){
            int expo = exponent - t.getExponent();
            double num = coefficient / coE;
            term = new Term(num, expo);
        }
        return (term);
    }*/



}

