package com.kodilla.inheritance.homework;


public class HomeworkOperatingTest {

    public static void main(String[] args) {

        System1 system1 = new System1(1998,2030);

        System2 system2 = new System2(2005, 2030);

        system1.turnOn();
        system2.turnOn();
        system1.turnOff();
        system2.turnOff();



    }
}
