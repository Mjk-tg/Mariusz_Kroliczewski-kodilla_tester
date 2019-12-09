package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        Ford ford = new Ford(75,9, 4);
        Fiat fiat = new Fiat(80,6,3);
        Opel opel = new Opel(79,7,4);

        doRace(ford);
        doRace(fiat);
        doRace(opel);

    }

    public static void doRace(Car car) {

        for (int i=1; i < 4; i++ ) {
            car.increaseSpeed();
        }

        for (int i=1; i < 3; i++ ) {
            car.decreaseSpeed();

        }

        System.out.println(car.getSpeed());
    }

}
