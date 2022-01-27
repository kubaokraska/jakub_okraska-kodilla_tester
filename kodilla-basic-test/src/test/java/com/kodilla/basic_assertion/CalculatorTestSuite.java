package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    private int a = 5;
    private int b = 8;
   private Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        int subtractResult = calculator.subtract(a, b);
        assertEquals(-3, subtractResult);
    }

    @Test
    public void testPower() {
        double a = -0.25;
        double delta = 0.001;
        double powerResult = calculator.power(a);
        assertEquals(0.0625, powerResult, delta);
    }
}