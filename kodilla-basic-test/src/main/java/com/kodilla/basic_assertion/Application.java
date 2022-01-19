package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;

        int sumResult = calculator.sum(a, b); // TEST METODY SUM
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int subtractResult = calculator.subtract(a, b); // TEST METODY SUBTRACT
        correct = ResultChecker.assertEquals(-3, subtractResult);
        if (correct) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int powerResult = calculator.power(a); // TEST METODY POWER
        correct = ResultChecker.assertEquals(25, powerResult);
        if (correct) {
            System.out.println("Metoda power działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda power nie działa poprawnie dla liczb " + a + " i " + b);
        }
    }
}