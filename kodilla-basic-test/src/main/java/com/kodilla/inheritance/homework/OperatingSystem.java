package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int yearOfSoftware;

    public OperatingSystem(int yearOfSoftware) {
        this.yearOfSoftware = yearOfSoftware;
    }

    public void turnOn() {
        System.out.println("Turning System on");
    }

    public void turnOf() {
        System.out.println("Turning System off");
    }

    public int getYearOfSoftware() {
        return yearOfSoftware;
    }
}