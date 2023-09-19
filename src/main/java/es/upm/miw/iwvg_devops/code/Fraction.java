package es.upm.miw.iwvg_devops.code;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
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

    public double decimal() {
        return (double) numerator / denominator;
    }

    public boolean isProper() {
        return numerator < denominator;
    }

    public boolean isImproper() {
        return numerator > denominator;
    }

    public boolean isEquivalent(Fraction fraction) {
        return (numerator * fraction.denominator) == (denominator * fraction.numerator);
    }

    public void add(Fraction fraction) {
        int commonDenominator = denominator * fraction.denominator;
        int newNumerator = numerator * fraction.denominator + denominator * fraction.numerator;
        numerator = newNumerator;
        denominator = commonDenominator;
    }

    public void multiply(Fraction fraction) {
        numerator *= fraction.numerator;
        denominator *= fraction.denominator;
    }

    public void divide(Fraction fraction) {
        numerator *= fraction.denominator;
        denominator *= fraction.numerator;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}