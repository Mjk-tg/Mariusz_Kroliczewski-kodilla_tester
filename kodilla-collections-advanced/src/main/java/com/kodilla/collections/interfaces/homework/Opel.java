package com.kodilla.collections.interfaces.homework;

public class Opel implements Car{

    private int speed;
    private int acceleration;
    private int deceleration;
    public Opel(int speed, int acceleration, int deceleration) {
        this.acceleration = acceleration;
        this.deceleration = deceleration;
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int getAcceleration() {
        return acceleration;
    }

    @Override
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
