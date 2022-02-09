package com.kodilla.optional.homewrok;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> studentAndTeacherList = new ArrayList<>();

        Student piotrNowak = new Student("Piotr Nowak", new Teacher("Agnieszka Kowalska"));
        Student andrzejSkowron = new Student("Andrzej Skowron", new Teacher("Danuta Bystrzynska"));
        Student jakubGawron = new Student("Jakub Gawron", null);

        Student dawidOsmolak = new Student("Dawid Osmolak", new Teacher("Pawel Pawelczak"));
        Student janSzymkowiak = new Student("Jan Szymkowiak", null);
        Student nataliaBalcerzak = new Student("Natalia Balcerzak", null);

        studentAndTeacherList.add(piotrNowak);
        studentAndTeacherList.add(andrzejSkowron);
        studentAndTeacherList.add(jakubGawron);

        studentAndTeacherList.add(dawidOsmolak);
        studentAndTeacherList.add(janSzymkowiak);
        studentAndTeacherList.add(nataliaBalcerzak);

        for (Student student : studentAndTeacherList) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());

            optionalTeacher.ifPresentOrElse(s ->
                            System.out.println("Uczen: " + student.getName() + ", nauczyciel: " + student.getTeacher()),
                    new Runnable() {
                        @Override
                        public void run() {
                            System.out.println("Uczen: " + student.getName() + ", nauczyciel: <undefined>");
                        }
                    });
        }
    }
}