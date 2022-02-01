package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> directory = new HashMap<>();
        List<SchoolClass> schoolClass = new ArrayList<>();
        List<SchoolClass> schoolClass1 = new ArrayList<>();
        List<SchoolClass> schoolClass2 = new ArrayList<>();

        addSchool(schoolClass, schoolClass1, schoolClass2);

        Principal janKowalski = new Principal("Jan", "Kowalski");
        School iiiLo = new School("III Liceum Ogolnokszalcace w Poznaniu", schoolClass);
        directory.put(janKowalski, iiiLo);

        Principal kamilNowak = new Principal("Kamil", "Nowak");
        School iLo = new School("I Liceum Ogolnokszalcace w Poznaniu", schoolClass1);
        directory.put(kamilNowak, iLo);

        Principal szymonLewandowski = new Principal("Szymon", "Lewandowski");
        School iiLo = new School("II Liceum Ogolnokszalcace w Poznaniu", schoolClass2);
        directory.put(szymonLewandowski, iiLo);


        for (Map.Entry<Principal, School> direct : directory.entrySet())
            System.out.println(direct.getKey().getFirstName() + " " + direct.getKey().getLastName() + " director of: " + direct.getValue().getSchoolName() + " with the number of students: " + direct.getValue().getAllStudents());
    }

    private static void addSchool(List<SchoolClass> schoolClass, List<SchoolClass> schoolClass1, List<SchoolClass> schoolClass2) {
        SchoolClass school1a1 = new SchoolClass("1a", 25);
        SchoolClass school1b1 = new SchoolClass("1b", 21);
        SchoolClass school1c1 = new SchoolClass("1c", 26);

        SchoolClass school1a2 = new SchoolClass("2a", 26);
        SchoolClass school1b2 = new SchoolClass("2b", 24);
        SchoolClass school1c2 = new SchoolClass("2c", 27);

        SchoolClass school1a3 = new SchoolClass("3a", 26);
        SchoolClass school1b3 = new SchoolClass("3b", 27);
        SchoolClass school1c3 = new SchoolClass("3c", 28);

        schoolClass.add(school1a1);
        schoolClass.add(school1a2);
        schoolClass.add(school1a3);

        schoolClass.add(school1b1);
        schoolClass.add(school1b2);
        schoolClass.add(school1b3);

        schoolClass.add(school1c1);
        schoolClass.add(school1c2);
        schoolClass.add(school1c3);

        SchoolClass school2a1 = new SchoolClass("1a", 23);
        SchoolClass school2b1 = new SchoolClass("1b", 25);
        SchoolClass school2c1 = new SchoolClass("1c", 22);

        SchoolClass school2a2 = new SchoolClass("2a", 21);
        SchoolClass school2b2 = new SchoolClass("2b", 22);
        SchoolClass school2c2 = new SchoolClass("2c", 23);

        SchoolClass school2a3 = new SchoolClass("3a", 25);
        SchoolClass school2b3 = new SchoolClass("3b", 22);
        SchoolClass school2c3 = new SchoolClass("3c", 24);

        schoolClass1.add(school2a1);
        schoolClass1.add(school2a2);
        schoolClass1.add(school2a3);

        schoolClass1.add(school2b1);
        schoolClass1.add(school2b2);
        schoolClass1.add(school2b3);

        schoolClass1.add(school2c1);
        schoolClass1.add(school2c2);
        schoolClass1.add(school2c3);

        SchoolClass school3a1 = new SchoolClass("1a", 23);
        SchoolClass school3b1 = new SchoolClass("1b", 25);
        SchoolClass school3c1 = new SchoolClass("1c", 22);

        SchoolClass school3a2 = new SchoolClass("2a", 27);
        SchoolClass school3b2 = new SchoolClass("2b", 26);
        SchoolClass school3c2 = new SchoolClass("2c", 25);

        SchoolClass school3a3 = new SchoolClass("3a", 29);
        SchoolClass school3b3 = new SchoolClass("3b", 28);
        SchoolClass school3c3 = new SchoolClass("3c", 21);

        schoolClass2.add(school3a1);
        schoolClass2.add(school3a2);
        schoolClass2.add(school3a3);

        schoolClass2.add(school3b1);
        schoolClass2.add(school3b2);
        schoolClass2.add(school3b3);

        schoolClass2.add(school3c1);
        schoolClass2.add(school3c2);
        schoolClass2.add(school3c3);
    }
}
