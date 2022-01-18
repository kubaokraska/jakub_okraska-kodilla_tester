package com.kodilla.abstracts;

public class JobApp {

    public static void main(String[] args) {
        Job orthodontist = new Doctor(5000,"Sprawianie ludziom bol");
        Person kasia = new Person("Katarzyna",27,orthodontist);
        kasia.PrintResponsibilities();
        kasia.PrintSalary();
    }
}