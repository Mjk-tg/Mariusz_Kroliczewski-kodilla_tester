package com.kodilla.spring.basic.spring_configuration.homework;

public class Cabrio implements Car {

    String headlights;

    public Cabrio(String headlights) {
        this.headlights = headlights;
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return headlights.equals("headlightsTurnedOn");
    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }

}
