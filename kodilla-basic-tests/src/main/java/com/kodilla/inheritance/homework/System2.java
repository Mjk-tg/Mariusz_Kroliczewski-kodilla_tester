package com.kodilla.inheritance.homework;

public class System2 extends OperatingSystem {

    int year;

    public System2(int publicationDate, int year) {
        super(publicationDate);
        this.year=year;

    }

    @Override
    public void turnOn() {
        if (year - getPublicationDate() > 3) {
            System.out.println("System 2 install an upgrade and will restart");
        } else {
            System.out.println("System 2 is turned on");
        }
    }

    @Override
    public void turnOff() {
        if (year - getPublicationDate() > 3) {
            System.out.println("System 2 should be updated before will turned off");
        } else {
            System.out.println("System 2 is turned off");
        }
    }
}
