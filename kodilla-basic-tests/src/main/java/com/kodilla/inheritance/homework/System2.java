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
            System.out.println("System install an upgrade and will restart");
        } else {
            System.out.println("System is turned on");
        }
    }

    @Override
    public void turnOff() {
        if (year - getPublicationDate() > 3) {
            System.out.println("System should be updated before will turned off");
        } else {
            System.out.println("System is turned off");
        }
    }
}
