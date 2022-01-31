package com.kodilla.collections.interfaces;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", square=" + square +
                ", circuit=" + circuit +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0 && Double.compare(circle.square, square) == 0 && Double.compare(circle.circuit, circuit) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, square, circuit);
    }
}



