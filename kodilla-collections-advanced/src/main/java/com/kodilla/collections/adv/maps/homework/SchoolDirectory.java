package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> directory = new HashMap<>();
        List<SchoolClass> schoolClassLo3 = new ArrayList<>();
        List<SchoolClass> schoolClassLo1 = new ArrayList<>();
        List<SchoolClass> schoolClassLo2 = new ArrayList<>();

        addClassToSchool(schoolClassLo3, schoolClassLo1, schoolClassLo2);

        Principal janKowalski = new Principal("Jan", "Kowalski");
        Principal kamilNowak = new Principal("Kamil", "Nowak");
        Principal szymonLewandowski = new Principal("Szymon", "Lewandowski");

        School lo3Poznan = new School("III Liceum Ogolnokszalcace w Poznaniu", schoolClassLo3);
        School lo1Poznan = new School("I Liceum Ogolnokszalcace w Poznaniu", schoolClassLo1);
        School lo2Poznan = new School("II Liceum Ogolnokszalcace w Poznaniu", schoolClassLo2);

        directory.put(janKowalski, lo3Poznan);
        directory.put(kamilNowak, lo1Poznan);
        directory.put(szymonLewandowski, lo2Poznan);

        for (Map.Entry<Principal, School> direct : directory.entrySet()) {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println(direct.getKey().getFirstName() + " " + direct.getKey().getLastName() + " director of: " + direct.getValue().getSchoolName() + " with the number of students: " + direct.getValue().getAllStudents());
        }
    }

    private static void addClassToSchool(List<SchoolClass> schoolClassLo3, List<SchoolClass> schoolClassLo1, List<SchoolClass> schoolClassLo2) {

                                                                        //////// Class of III LO
        schoolClassLo3.add(new SchoolClass("1a", 25));
        schoolClassLo3.add(new SchoolClass("1b", 21));
        schoolClassLo3.add(new SchoolClass("1c", 26));

        schoolClassLo3.add(new SchoolClass("2a", 26));
        schoolClassLo3.add(new SchoolClass("2b", 24));
        schoolClassLo3.add(new SchoolClass("2c", 27));

        schoolClassLo3.add(new SchoolClass("3a", 26));
        schoolClassLo3.add(new SchoolClass("3b", 27));
        schoolClassLo3.add(new SchoolClass("3c", 28));
                                                                          ////////// Class of ILO
        schoolClassLo1.add(new SchoolClass("1a", 23));
        schoolClassLo1.add(new SchoolClass("1b", 25));
        schoolClassLo1.add(new SchoolClass("1c", 22));

        schoolClassLo1.add(new SchoolClass("2a", 21));
        schoolClassLo1.add(new SchoolClass("2b", 22));
        schoolClassLo1.add(new SchoolClass("2c", 23));

        schoolClassLo1.add(new SchoolClass("3a", 25));
        schoolClassLo1.add(new SchoolClass("3b", 22));
        schoolClassLo1.add(new SchoolClass("3c", 24));
                                                                        //////////// Class of IILO
        schoolClassLo2.add(new SchoolClass("1a", 23));
        schoolClassLo2.add(new SchoolClass("1b", 25));
        schoolClassLo2.add(new SchoolClass("1c", 22));

        schoolClassLo2.add(new SchoolClass("2a", 27));
        schoolClassLo2.add(new SchoolClass("2b", 26));
        schoolClassLo2.add(new SchoolClass("2c", 25));

        schoolClassLo2.add(new SchoolClass("3a", 29));
        schoolClassLo2.add(new SchoolClass("3b", 28));
        schoolClassLo2.add(new SchoolClass("3c", 21));
    }
}