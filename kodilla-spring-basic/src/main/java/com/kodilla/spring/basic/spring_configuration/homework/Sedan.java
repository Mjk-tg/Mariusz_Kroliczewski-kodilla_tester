package com.kodilla.spring.basic.spring_configuration.homework;

public class Sedan implements Car {

    String headlights;

    public Sedan(String headlights) {
        this.headlights = headlights;
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return headlights.equals("headlightsTurnedOn");
    }

    @Override
    public String getCarType() {
        return "Sedan";
    }

}
