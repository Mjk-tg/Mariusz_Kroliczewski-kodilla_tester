package com.kodilla.abstracts.homework;

public class Person {
    private String firstName;
    private int age;
    public Job job;

    public Person (String firstName, int age, Job job) {

        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    String getPersonName() {
        return firstName;
    }

    public static void main(String[] args) {

        Person Jan = new Person("Jan", 32, new Welder(8000,"Welding austenitic and ferromagnetic steel pipes") );
        Person Anna = new Person("Anna", 29, new OfficeAssistant(4000,"Keeps records, serves the office"));
        Person Rudolf = new Person("Rudolf", 58, new WeldsSupervisor(11000,"Supervise Welders"));

        Person[] person = {Jan, Anna, Rudolf};

        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].getPersonName() + "  " + person[i].job.getResponsibilities());
        }

    }


}
