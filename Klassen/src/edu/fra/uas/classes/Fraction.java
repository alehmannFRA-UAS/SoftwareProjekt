package edu.fra.uas.classes;

public class Fraction {

    //###   attributes   ###
    private int numerator;
    private int denominator;
    //######################

    //###  constructors  ###
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }
    //######################

    //###    methods     ###
    public void multiply(Fraction f)
    {
        numerator = numerator * f.numerator;
        denominator = denominator * f.denominator;
    }

    public void multiply(Fraction f1, Fraction f2) {
        this.numerator = f1.numerator * f2.numerator;
        this.denominator = f1.denominator * f2.denominator;
    }

    public void add(Fraction f)
    {
        numerator = numerator * f.denominator + f.numerator * denominator;
        denominator = denominator * f.denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public boolean equals(Fraction f) {
        return (numerator == f.numerator) && (denominator == f.denominator);
    }
    //######################

}
