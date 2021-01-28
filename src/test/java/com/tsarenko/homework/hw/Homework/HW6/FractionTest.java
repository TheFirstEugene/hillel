package com.tsarenko.homework.hw.Homework.HW6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionTest {
    public static Fraction fraction_1;
    public static Fraction fraction_2;
    public static Fraction fraction_3;
    public static Fraction fraction_4;

    @BeforeEach
    void setUp() {
        fraction_1 = new FractionNumber(1, 3);
        fraction_2 = new FractionNumber(2, 3);
        fraction_3 = new FractionNumber(3, 4);
        fraction_4 = new FractionNumber(2, 4);
    }

    @Test
    void badFractionCreation() {
        assertThrows(IllegalArgumentException.class, () -> new FractionNumber(1, 0));
    }

    @Test
    void testEquals() {
        assertEquals(new FractionNumber(1, 3), fraction_1);
        assertNotEquals(fraction_2, fraction_1);
        assertEquals(new FractionNumber(3, 9), fraction_1);
        assertEquals(new FractionNumber(3, 1), new FractionNumber(9, 3));
    }

    //плюс с одинаковым знаменателем
    @Test
    void testPlusWithTheSameDenominator() {
        Fraction result = fraction_1.plus(fraction_2);
        assertEquals(new FractionNumber(1, 1), result);
    }

    //плюс с разными знаменателями
    @Test
    void testPlusWithNotTheSameDenominator() {
        Fraction result = fraction_1.plus(fraction_3);
        assertEquals(new FractionNumber(13, 12), result);
    }

    //минус c одинаковыми знаменателями
    @Test
    void testMinusWithTheSameDenominator() {
        Fraction result = fraction_1.minus(fraction_2);
        Fraction result2 = fraction_3.minus(fraction_4);
        assertEquals(new FractionNumber(1, -3), result);
        assertEquals(new FractionNumber(1, 4), result2);
    }

    // минус с разными знаменателями
    @Test
    void testMinusWithNotTheSameDenominator() {
        Fraction result = fraction_1.minus(fraction_3);
        Fraction result2 = fraction_2.minus(fraction_4);
        assertEquals(new FractionNumber(-5, 12), result);
        assertEquals(new FractionNumber(1, 6), result2);
    }

    //умножение с одинаковыми знаменателями
    @Test
    void testMultiplyWithTheSameDenominator() {
        Fraction result = fraction_1.multiply(fraction_2);
        Fraction result2 = fraction_3.multiply(fraction_4);
        assertEquals(new FractionNumber(2, 9), result);
        assertEquals(new FractionNumber(3, 8), result2);
    }

    //умножение с разными знаменателями
    @Test
    void testMultiplyWithNotTheSameDenominator() {
        Fraction result = fraction_1.multiply(fraction_3);
        Fraction result2 = fraction_2.multiply(fraction_4);
        assertEquals(new FractionNumber(1, 4), result);
        assertEquals(new FractionNumber(1, 3), result2);
    }

    //деление с одинаковыми знаменателями
    @Test
    void testDivideWithTheSameDenominator() {
        Fraction result = fraction_1.divide(fraction_2);
        Fraction result2 = fraction_3.divide(fraction_4);
        assertEquals(new FractionNumber(1, 2), result);
        assertEquals(new FractionNumber(3, 2), result2); // тут выходит 1 целая 1/2 == 3/2
    }

    //деление с разными знаменателями
    @Test
    void testDevideWithNotTheSameDenominator() {
        Fraction result = fraction_1.divide(fraction_3);
        Fraction result2 = fraction_2.divide(fraction_4);
        assertEquals(new FractionNumber(4, 9), result);
        assertEquals(new FractionNumber(4, 3), result2);
    }

}
