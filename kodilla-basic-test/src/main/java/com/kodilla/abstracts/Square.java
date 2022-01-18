package com.kodilla.abstracts;

public class Square extends Shape {
    private int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public int area() {
        return this.a * this.a;
    }

    @Override
    public int circuit() {
        return 4 * this.a;
    }
}