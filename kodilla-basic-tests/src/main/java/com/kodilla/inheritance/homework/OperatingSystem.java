package com.kodilla.inheritance.homework;

public class OperatingSystem {

    private int publicationDate;

    public OperatingSystem(int publicationDate) {
        this.publicationDate=publicationDate;
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


}
