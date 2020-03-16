package com.kodilla.collections.adv.exercises.homework;

import java.util.Objects;

public class Flight {
    int flightNo;
    String departure;
    String arrival;

    public Flight(int flightNo, String departure, String arrival) {
        this.flightNo =flightNo;
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public int getFlightNo() {
        return flightNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return getFlightNo() == flight.getFlightNo() &&
                getDeparture().equals(flight.getDeparture()) &&
                getArrival().equals(flight.getArrival());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFlightNo(), getDeparture(), getArrival());
    }
}
