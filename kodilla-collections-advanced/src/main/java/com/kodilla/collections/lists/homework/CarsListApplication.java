package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Fiat;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;


public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> car = new ArrayList<>();
        Car fiat125 = new Fiat(165,13,9);
        Car fiat126 = new Fiat(135,15,10);
        Car fiat127 = new Fiat(175,11,8);
        Car fiat131 = new Fiat(190,9,8);
        Car fiat132 = new Fiat(185,10,9);
        Car fordGranada = new Ford(157,12,7);
        Car opelAscona = new Opel(155,13,8);


        car.add(fiat125);
        car.add(fiat126);
        car.add(fiat127);
        car.add(fiat131);
        car.add(fiat132);
        car.add(fordGranada);
        car.add(opelAscona);

        for (Car auto: car
             ) {
            CarUtils.describeCar(auto);
        }
        System.out.println(" Elementów w kolekcji " + car.size());

        car.remove(car.size()-1);
        car.remove(fiat131);


        for (Car auto: car
        ) {
            CarUtils.describeCar(auto);
        }
        System.out.println(" Elementów w kolekcji " + car.size());


    }
}
