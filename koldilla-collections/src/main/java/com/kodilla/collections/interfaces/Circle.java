package com.kodilla.collections.interfaces;

public class Circle implements Shape {
    private double radius;
    private double square;
    private double circuit;

    public Circle(double radius) {
        this.radius = radius;
        this.circuit = 2 * Math.PI * radius;
        this.square = Math.PI * radius * radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return this.square;
    }

    public double getPerimeter() {
        return this.circuit;
    }
}



