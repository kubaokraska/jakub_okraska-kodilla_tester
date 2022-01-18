package com.kodilla.abstracts;

public class Rectangle extends Shape {
    private int a;
    private int b;

    public Rectangle (int a, int b){
        this.a=a;
        this.b=b;
    }

    @Override
    public int area(){
        return this.a*this.b;
    }

    @Override
    public int circuit(){
        return 2*this.a+2*this.b;
    }
}
