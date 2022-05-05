package com.kodilla.jacoco;

public class Year {
    int number;

    public Year(int year) {
        this.number = year;
    }
    
    public boolean isLeap() {
        if (this.number % 4 == 0) {
            if (this.number % 100 == 0) {
                return this.number % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
