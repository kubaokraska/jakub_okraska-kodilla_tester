package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    public static List<Task> getTasks() {
        List<Task> taskList = new ArrayList<>();

        taskList.add(new Task("Finish a Kodilla module 6", LocalDate.of(2022, 2, 8), LocalDate.of(2022, 2, 14)));
        taskList.add(new Task("Make a birthday cake", LocalDate.of(2022, 2, 8), LocalDate.of(2022, 2, 9)));
        taskList.add(new Task("Tidy my room", LocalDate.of(2022, 2, 1), LocalDate.of(2022, 2, 7)));

        taskList.add(new Task("Go to gym", LocalDate.of(2022, 2, 1), LocalDate.of(2022, 2, 4)));
        taskList.add(new Task("Drink some birthday shots", LocalDate.of(2022, 2, 9), LocalDate.of(2022, 2, 13)));
        taskList.add(new Task("Survive", LocalDate.of(2022, 2, 3), LocalDate.of(2022, 2, 2)));

        return taskList;
    }
}