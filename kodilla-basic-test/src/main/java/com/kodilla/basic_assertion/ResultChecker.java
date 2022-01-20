package com.kodilla.basic_assertion;

import static java.lang.Math.*;

public class ResultChecker {

    public static boolean assertEquals(int expected, int actual) {
        return expected == actual;
    }

    public static boolean assertEquals(double expected, double actual, double delta) {
        if (abs(expected - actual) < delta) {
            return expected == actual;
        } else
            return expected != actual;
    }
}