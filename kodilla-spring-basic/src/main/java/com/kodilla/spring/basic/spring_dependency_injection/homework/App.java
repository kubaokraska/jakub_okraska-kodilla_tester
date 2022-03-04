package com.kodilla.spring.basic.spring_dependency_injection.homework;

public class App {
    public static void main(String[] args) {
        Display display = new Display();
        Calculator calculator= new Calculator(display);
    }
}
