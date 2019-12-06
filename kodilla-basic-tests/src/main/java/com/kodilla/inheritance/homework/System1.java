package com.kodilla.inheritance.homework;

public class System1 extends OperatingSystem{

    public System1(int publicationDate) {
        super(publicationDate);
    }


    @Override
    public void turnOn() {
        if (getPublicationDate() - getPresentYear() > 7) {
            System.out.println("System is not supported and will turned off");
        } else {
            System.out.println("System is turned on");
        }
    }

    @Override
    public void turnOff() {
        if (getPublicationDate() - getPresentYear() > 1) {
            System.out.println("System should be updated before will turned off");
        } else {
            System.out.println("System is turned off");
        }
    }



}
