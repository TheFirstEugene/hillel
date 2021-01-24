package com.tsarenko.homework.hw.Homework.HW6;

import java.util.Objects;

public class FractionNumber implements Fraction {
    private  int numerator;
    private  int denominator;

    public FractionNumber(int a, int b) throws IllegalArgumentException {
        this.numerator = a;
        this.denominator = b;
    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    @Override
    public Fraction divide(Fraction a) {
        int numerator = getNumerator() * a.getDenominator();
        int denominator = getDenominator() * a.getNumerator();
        if (denominator % numerator == 0) {
            denominator = denominator / numerator;
            numerator = numerator / numerator;
        }
        return new FractionNumber(numerator, denominator);
    }

    @Override
    public Fraction multiply(Fraction a) {
        int numerator = getNumerator() * a.getNumerator();
        int denominator = getDenominator() * a.getDenominator();
        if (denominator % numerator == 0) {
            denominator = denominator / numerator;
            numerator = numerator / numerator;
        }
        return new FractionNumber(numerator, denominator);
    }

    @Override
    public Fraction plus(Fraction a) {
        int numerator = getNumerator() * a.getDenominator() + a.getNumerator() * getDenominator();
        int denominator = getDenominator() * a.getDenominator();
        if (denominator % numerator == 0) {
            denominator = denominator / numerator;
            numerator = numerator / numerator;
        }
        return new FractionNumber(numerator, denominator);
    }

    @Override
    public Fraction minus(Fraction a) {
        int numerator = getNumerator() * a.getDenominator() - a.getNumerator() * getDenominator();
        int denominator = getDenominator() * a.getDenominator();
        if (denominator % numerator == 0) {
            denominator = denominator / numerator;
            numerator = numerator / numerator;
        }
        return new FractionNumber(numerator, denominator);
    }


    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (!getClass().equals(object.getClass())) {
            return false;
        }
        final Fraction other = (Fraction) object;
        return getNumerator() / (double) getDenominator()
                == other.getNumerator() / (double) other.getDenominator();
    }

    @Override
    public int hashCode() {
        double result = (double) numerator / (double) denominator;
        return Objects.hash(result);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}




