package com.kodilla.inheritance.homework;

public class mainApp {

    public static void main(String[] args) {
        OperatingSystem system = new OperatingSystem(1900);
        SonOfOperatingSystem son = new SonOfOperatingSystem(1995);
        DaughterOfOperatingSystem daughter = new DaughterOfOperatingSystem(2005);

        printClassMethod(system);
        printClassMethod(son);
        printClassMethod(daughter);
    }

    private static void printClassMethod(OperatingSystem system) {
        system.turnOn();
        system.turnOf();
        System.out.println("Year of System: " + system.getYearOfSoftware());
    }
}