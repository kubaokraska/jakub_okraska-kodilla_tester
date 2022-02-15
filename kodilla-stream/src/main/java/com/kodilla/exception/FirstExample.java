package com.kodilla.exception;

public class FirstExample {
    public static void main(String[] args) {
        String username=null;
        String[] nameParts = username.split(" ");
        System.out.println("FirstName: " + nameParts[0]);
        System.out.println("LastName: "+nameParts[1]);
    }
}
