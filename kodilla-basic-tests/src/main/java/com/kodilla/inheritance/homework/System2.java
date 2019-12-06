package com.kodilla.inheritance.homework;

public class System2 extends OperatingSystem {
    public System2(int publicationDate) {
        super(publicationDate);

    }

    @Override
    public void turnOn() {
        if (getPublicationDate() - getPresentYear()> 3) {
            System.out.println("System install an upgrade and will restart");
        } else {
            System.out.println("System is turned on");
        }
    }

    @Override
    public void turnOff() {
        if (getPublicationDate() - getPresentYear()> 3) {
            System.out.println("System should be updated before will turned off");
        } else {
            System.out.println("System is turned off");
        }
    }
}
