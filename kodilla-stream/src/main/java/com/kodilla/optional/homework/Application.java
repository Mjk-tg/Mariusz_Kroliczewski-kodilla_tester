package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jarek Zebra", new Teacher("Ms.Wiesława Wrona")));
        students.add(new Student("Piotr Kowal",new Teacher("Mis Alicja Labia")));
        students.add(new Student("Ola Nowak",new Teacher("Ms Renata Cogiel")));
        students.add(new Student("Magda Pacek",new Teacher("Mr Jan Lenart")));
        students.add(new Student("Wacek Długi",new Teacher("Mis Alicja Labia")));
        students.add(new Student("Jan Niezbedny",null));
        students.add(new Student("Anna Macek",null));

            for (Student student: students ) {
                Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
                   Teacher teacherName = optionalTeacher.orElse(new Teacher("<unnamed>"));
                System.out.println( "Uczeń: "+student.getName() + " -> Nauczyciel: " + teacherName.getName());
            }
    }
}
