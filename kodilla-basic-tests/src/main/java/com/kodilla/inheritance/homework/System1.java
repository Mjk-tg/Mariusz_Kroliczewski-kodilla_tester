package com.kodilla.inheritance.homework;

public class System1 extends OperatingSystem{

    int year;

    public System1(int publicationDate, int year) {
        super(publicationDate);
        this.year=year;
    }


    @Override
    public void turnOn() {
        if (year - getPublicationDate() > 7) {
            System.out.println("System 1 is not supported and will turned off");
        } else {
            System.out.println("System 1 is turned on");
        }
    }

    @Override
    public void turnOff() {
        if (year - getPublicationDate() > 1) {
            System.out.println("System 1 should be updated before will turned off");
        } else {
            System.out.println("System 1 is turned off");
        }
    }



}
