package com.kodilla.collections.interfaces.homework;

public class Fiat implements Car {

    private int speed;
    private int acceleration;
    private int deceleration;
    public Fiat(int speed, int acceleration, int deceleration) {
        this.acceleration = acceleration;
        this.deceleration = deceleration;
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public int getDeceleration() {
        return deceleration;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + acceleration;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - deceleration;
    }
}
