package com.kodilla.optional.homewrok;

public class Student {
   private String name;
   private Teacher teacher;

    public Student(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public String getName() {
        return name;
    }
}