package com.kodilla.collections.adv.maps.homework;


import java.util.ArrayList;
import java.util.List;

public class School {
    private String schoolName;
    private List <SchoolClass> schoolClasses = new ArrayList<>();

    public School(String schoolName, List<SchoolClass> schoolClasses) {
        this.schoolName = schoolName;
        this.schoolClasses = schoolClasses;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public int getAllStudents() {
        int sum = 0;
        for (SchoolClass number : this.schoolClasses) {
            sum = sum + number.getNumberOfStudents();
        }
        return sum;
    }
}