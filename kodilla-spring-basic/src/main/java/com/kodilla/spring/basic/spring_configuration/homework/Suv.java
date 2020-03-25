package com.kodilla.spring.basic.spring_configuration.homework;

public class Suv implements Car {

    String headlights;

    public Suv(String headlights) {
        this.headlights = headlights;
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return headlights.equals("headlightsTurnedOn");
    }

    @Override
    public String getCarType() {
        return "Suv";
    }

}
