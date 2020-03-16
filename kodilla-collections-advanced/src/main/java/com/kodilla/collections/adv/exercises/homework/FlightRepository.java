package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsTable() {

        List<Flight> flightsTable = new ArrayList();
        flightsTable.add(new Flight(1001,"Kraków","Katowice"));
        flightsTable.add(new Flight(1002,"Katowice","Kraków"));
        flightsTable.add(new Flight(1003,"Gdańsk","Katowice"));
        flightsTable.add(new Flight(1004,"Katowice","Gdańsk"));
        flightsTable.add(new Flight(1005,"Wrocław","Katowice"));
        flightsTable.add(new Flight(1006,"Katowice","Wrocław"));
        flightsTable.add(new Flight(1007,"Poznań","Katowice"));
        flightsTable.add(new Flight(1008,"Katowice","Poznań"));

        return flightsTable;
    }
}
