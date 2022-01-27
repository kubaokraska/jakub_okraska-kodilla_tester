package com.kodilla.collections.interfaces.homework;

public class Volkswagen implements Car{
    private int speed;

    public Volkswagen() {
        this.speed = 0;
    }

    public void increaseSpeed() {
        speed = speed + 35;
    }

    public void decreaseSpeed() {
        speed = speed - 16;
        if (speed < 0)
            speed = 0;
    }

    public int getSpeed() {
        return this.speed;
    }
}