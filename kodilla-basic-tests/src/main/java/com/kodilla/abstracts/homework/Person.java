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

        Person jan = new Person("Jan", 32, new Welder(8000,"Welding austenitic and ferromagnetic steel pipes") );
        Person anna = new Person("Anna", 29, new OfficeAssistant(4000,"Keeps records, serves the office"));
        Person rudolf = new Person("Rudolf", 58, new WeldsSupervisor(11000,"Supervise Welders"));

        Person[] person = {jan, anna, rudolf};

        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].getPersonName() + "  " + getPersonResponsibilities(person[i].getJob()));
        }
    }

    private static String getPersonResponsibilities(Job job) {
        String responsibilities = job.getResponsibilities();
        return responsibilities;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public Job getJob() {
        return job;
    }
}