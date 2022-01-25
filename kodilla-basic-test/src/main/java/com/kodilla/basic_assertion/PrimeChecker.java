package com.kodilla.basic_assertion;

public class PrimeChecker {
    private int count = 0;

    public boolean isPrime(int number) {

        if (number < 2)
            return false;
        else {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }
            if (count > 2)
                return false;
            else
                return true;
        }
    }
    public int getCount(){
        return count;
    }
}

