package com.kodilla.mockito.notification;

public class ClientExistException extends Exception {
    public ClientExistException() {
        super("Client already exist");
    }
}