package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class GarageTestSuite {

    @Test
    void shouldCreateCarBeanDependentOnSeason() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Garage garage = context.getBean(Garage.class);
        garage.chooseTheCar();
        Car car = (Car) context.getBean("chooseTheCar");


        //When
        String choosenCar = car.getCarType();

        //Then
        Assertions.assertEquals("Suv", choosenCar);
    }

}