package com.kodilla.spring.basic.spring_dependency_injection.homework;

public class DivideByZero extends Exception {

    public DivideByZero (){
        System.out.println("Error! Dividing by zero!");
    }
}