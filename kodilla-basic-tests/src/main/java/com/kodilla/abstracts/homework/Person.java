package com.kodilla.abstracts.homework;

public class Person {
    private String firstName;
    private int age;
    private String job;

    public Person (String firstName, int age, String job) {

        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    String getPersonName() {
        return firstName;
    }

    public static void main(String[] args) {

        Person Jan = new Person("Jan", 32, "Welder");
        Person Anna = new Person("Anna", 29, "OfficeAssistant");
        Person Rudolf = new Person("Rudolf", 58, "Welding Supervisor");

        Person[] person = {Jan, Anna, Rudolf};

        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].getPersonName());
        }

    }


}
