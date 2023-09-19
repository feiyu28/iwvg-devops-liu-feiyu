package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FractionTest {

    private Fraction fraction;

    @BeforeEach
    void before() {
        fraction = new Fraction(1, 2);
    }

    @Test
    void testFractionNumbers() {
        assertEquals(1, fraction.getNumerator());
        assertEquals(2, fraction.getDenominator());
    }

    @Test
    void testFraction() {
        fraction = new Fraction();
        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    void testDecimal() {
        fraction.setNumerator(4);
        fraction.setDenominator(10);
        assertEquals(0.4, fraction.decimal());
    }

    @Test
    void testIsProper() {
        assertTrue(fraction.isProper());
    }

    @Test
    void testIsImproper() {
        fraction.setNumerator(5);
        fraction.setDenominator(3);
        assertTrue(fraction.isImproper());
    }

    @Test
    void testIsEquivalent() {
        assertTrue(fraction.isEquivalent(new Fraction(1, 2)));
    }

    @Test
    void testAdd() {
        fraction.add(new Fraction(1, 3));
        assertEquals(5, fraction.getNumerator());
        assertEquals(6, fraction.getDenominator());
    }

    @Test
    void testMultiply() {
        fraction.setNumerator(2);
        fraction.setDenominator(5);
        fraction.multiply(new Fraction(2, 3));
        assertEquals(4, fraction.getNumerator());
        assertEquals(15, fraction.getDenominator());
    }

    @Test
    void testDivide() {
        fraction.divide(new Fraction(1, 4));
        assertEquals(4, fraction.getNumerator());
        assertEquals(2, fraction.getDenominator());
    }
}
