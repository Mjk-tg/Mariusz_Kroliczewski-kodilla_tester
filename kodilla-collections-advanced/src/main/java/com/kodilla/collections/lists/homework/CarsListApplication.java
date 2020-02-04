package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Fiat;

import java.util.ArrayList;
import java.util.List;


public class CarsListApplication {
    public static void main(String[] args) {
        List<Fiat> car = new ArrayList<>();
        Fiat fiat125 = new Fiat(165,13,9);
        Fiat fiat126 = new Fiat(135,15,10);
        Fiat fiat127 = new Fiat(175,11,8);
        Fiat fiat131 = new Fiat(190,9,8);
        Fiat fiat132 = new Fiat(185,10,9);
        car.add(fiat125);
        car.add(fiat126);
        car.add(fiat127);
        car.add(fiat131);
        car.add(fiat132);

        for (Fiat fiat: car
             ) {
            CarUtils.describeCar(fiat);
        }
        System.out.println(" Elementów w kolekcji " + car.size());

        car.remove(car.size()-1);
        car.remove(fiat131);


        for (Fiat fiat: car
        ) {
            CarUtils.describeCar(fiat);
        }
        System.out.println(" Elementów w kolekcji " + car.size());


    }
}
