package com.kodilla.stream;

public class StreamMain {
    public static void main(String[] args) {
        UsersRepository.getUsersList()
                .stream()
                .map(u -> u.getUsername())
                .forEach(un -> System.out.println(un));
    }
}
