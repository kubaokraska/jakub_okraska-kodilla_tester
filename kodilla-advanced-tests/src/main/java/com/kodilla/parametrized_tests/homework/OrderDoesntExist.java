package com.kodilla.parametrized_tests.homework;

public class OrderDoesntExist extends Exception {
    public OrderDoesntExist() {
        super("Invalid input. The search result is empty. Try another one");
    }
}
