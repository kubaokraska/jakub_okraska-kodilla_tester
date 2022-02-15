package com.kodilla.optional.homewrok;

import java.util.Optional;

public class Student {
   private String name;
   private Teacher teacher;

    public Student(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }
    public Optional <Teacher> getTeacher() {
        return Optional.ofNullable(teacher);
    }
}