package com.kodilla.abstracts;

public class Triangle extends Shape {
    private int base ;
    private int b;
    private int c;
    private int h;

    public Triangle(int base, int b, int c, int h){
        this.base=base;
        this.b=b;
        this.c=c;
        this.h=h;
    }

    @Override
    public int area() {
        return ((this.base * this.h)/2);
    }

    @Override
    public int circuit() {
        return this.base+ this.b + this.c;
    }
}
