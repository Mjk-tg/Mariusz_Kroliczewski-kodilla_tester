package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Fiat;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;


public class CarAplication {


    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15)+1];
        for (int i = 0; i < cars.length; i++)
            cars[i] = drawCar();

        for (int i = 0; i < cars.length; i++);
        for ( Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar(){
        Random random = new Random();
        int drawCar = random.nextInt(3);
        int speed = random.nextInt(100) *1+100;
        int acceleration = random.nextInt();
        int deceleration = random.nextInt();
        if (drawCar == 0)
            return new Ford(speed, acceleration, deceleration);
        else if (drawCar == 1)
            return new Fiat(speed, acceleration, deceleration);
        else
            return new Opel(speed, acceleration, deceleration);

    }
}
