package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
       double avgNumberOfPosts = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge()>=40)
                .map(u -> u.getNumberOfPost())
                .mapToInt(n ->n)
                .average()
                .getAsDouble();
        System.out.println(avgNumberOfPosts);

        avgNumberOfPosts = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge()<40)
                .map(u -> u.getNumberOfPost())
                .mapToInt(n ->n)
                .average()
                .getAsDouble();
        System.out.println(avgNumberOfPosts);
    }
}
