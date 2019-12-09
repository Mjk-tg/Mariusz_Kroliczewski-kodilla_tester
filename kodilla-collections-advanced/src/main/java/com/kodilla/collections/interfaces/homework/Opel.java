package com.kodilla.collections.interfaces.homework;

public class Opel extends Ford{

    private int speed;
    private int acceleration;
    private int deceleration;

    public Opel(int speed, int acceleration, int deceleration) {
        super(speed, acceleration, deceleration);
        this.acceleration = acceleration;
        this.deceleration = deceleration;
        this.speed = speed;
    }


}
