package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Garage {

    public Garage() {
    }

    @Bean
    public Car chooseTheCar (){

        int hour = 0;
        String season = "winter";

        Car car;
        String headlights;

        if ((hour < 6) || (hour > 20)) {
            headlights = "headlightsTurnedOn";
        } else {
            headlights = "headlightsTurnedOff";
        }

        if (season.equals("winter")) {
             car = new Suv(headlights);
         } else if (season.equals("summer")) {
             car = new Cabrio(headlights);
         } else {
             car = new Sedan(headlights);
         }
        return car;
    }

}
