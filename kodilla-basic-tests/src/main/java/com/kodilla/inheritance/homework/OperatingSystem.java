package com.kodilla.inheritance.homework;

public class OperatingSystem {

    private int publicationDate;
    private int year;

    public OperatingSystem(int publicationDate) {
        this.publicationDate=publicationDate;
    }

    public static int setPresentYear(int year) {
        return year;
    }

    public void turnOn() {
        System.out.println("System is turned on");
    }

    public void turnOff() {
        System.out.println("System will turned off");
    }

    public int getPublicationDate() {
        return publicationDate;
    }
    public int getPresentYear() {
        return year;
    }

}
