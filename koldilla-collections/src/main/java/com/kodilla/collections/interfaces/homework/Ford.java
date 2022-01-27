package com.kodilla.collections.interfaces.homework;

public class Ford implements Car{
    private int speed;

    public Ford() {
        this.speed = 0;
    }

    public void increaseSpeed() {
        speed = speed + 30;
    }

    public void decreaseSpeed() {
        speed = speed - 15;
        if (speed < 0)
            speed = 0;
    }

    public int getSpeed() {
        return speed;
    }
}
