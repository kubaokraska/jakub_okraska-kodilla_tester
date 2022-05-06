package com.kodilla.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import com.kodilla.hibernate.tasklist.repository.TaskListRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TaskListRepositoryTestSuite {
    @Autowired
    private TaskListRepository taskListRepository;

    private static final String NAME = "Jakub Okraska";

    @Test
    void testTaskListRepositoryFindByName() {
        //Given
        TaskList taskList = new TaskList(NAME, "Test: Find by name");
        taskListRepository.save(taskList);
        String nameList = taskList.getListName();

        //When
        List<TaskList> readNameList = taskListRepository.findByListName(NAME);

        //Then
        Assertions.assertEquals("Jakub Okraska", nameList.toString());

        //CleanUp
        int id = readNameList.get(0).getId();
        taskListRepository.deleteById(id);
    }
}
