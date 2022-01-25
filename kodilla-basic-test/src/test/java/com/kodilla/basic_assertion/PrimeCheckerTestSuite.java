package com.kodilla.basic_assertion;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeCheckerTestSuite {

    @Test
    public void shouldReturnFalseWhenPassingNotPrimeNumber() {
        PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(14);
        System.out.println("Liczba dzielnikow: " + checker.getCount());
        assertFalse(result);
    }

    @Test
    public void shouldReturnTrueWhenPassingPrimeNumber() {
        PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(461);
        System.out.println("Liczba dzielnikow: " + checker.getCount());
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueWhenPassingTwo() {
        PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(2);
        System.out.println("Liczba dzielnikow: " + checker.getCount());
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingOne() {
        PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(1);
        System.out.println("Liczba dzielnikow: " + checker.getCount());
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingZero() {
        PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(0);
        System.out.println("Liczba dzielnikow: " + checker.getCount());
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingNegativeNumber() {
        PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(-6);
        System.out.println("Liczba dzielnikow: " + checker.getCount());
        assertFalse(result);
    }
}
