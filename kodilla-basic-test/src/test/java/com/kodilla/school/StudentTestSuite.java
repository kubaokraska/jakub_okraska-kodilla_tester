package com.kodilla.school;


import org.junit.jupiter.api.Test;

import static com.kodilla.basic_assertion.ResultChecker.assertEquals;

public class StudentTestSuite {

    @Test
    public void shouldCalculateCorrectAveragesIfValuesAreInRange() {
        Student student = new Student("Martin");
        student.addGeographyGrade(4);
        student.addGeographyGrade(4);
        student.addGeographyGrade(2);

        student.addHistoryGrade(1);
        student.addHistoryGrade(5);

        double geographyAverage = student.getGeographyAverage();
        double historyAverage = student.getHistoryAverage(); // 3 bo (5+1)/2 = 3 !!!!!!!!!!!!!!
        double mathsAverage = student.getMathsAverage();
        double physicsAverage = student.getPhysicsAverage();

        assertEquals(4.33, student.getGeographyAverage(), 0.01); //test powinien się wysypać 4.33!=3.33
        System.out.println(student.getGeographyAverage());
        assertEquals(4, historyAverage, 0.01); // test powinien sie wysypać 4!=3
        System.out.println(historyAverage);

        assertEquals(5, mathsAverage, 0.01);
        assertEquals(0, physicsAverage, 0.01);
    }
}