package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {
    private int speed;

    public Opel() {
        this.speed = 0;
    }

    public void increaseSpeed() {
        speed = speed + 25;
    }

    public void decreaseSpeed() {
        speed = speed - 13;
        if (speed < 0)
            speed = 0;
    }

    public int getSpeed() {
        return this.speed;
    }
}