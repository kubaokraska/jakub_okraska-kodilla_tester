package com.kodilla.abstracts;

public class JobApp {

    public static void main(String[] args) {

        Person kasia = new Person("Katarzyna",27,new Doctor(5000,"Sprawianie ludziom bol"));
        kasia.PrintResponsibilities();
        kasia.PrintSalary();
    }
}