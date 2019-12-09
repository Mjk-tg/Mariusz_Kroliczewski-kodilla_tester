package com.kodilla.collections.interfaces.homework;

public class Fiat extends Ford {

    private int speed;
    private int acceleration;
    private int deceleration;

    public Fiat(int speed, int acceleration, int deceleration) {
        super(speed, acceleration, deceleration);
        this.acceleration = acceleration;
        this.deceleration = deceleration;
        this.speed = speed;
    }

}
