package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {

    private int speed;
    private int acceleration;
    private int deceleration;

    public Ford(int speed, int acceleration, int deceleration) {
        this.acceleration = acceleration;
        this.deceleration = deceleration;
        this.speed = speed;

    }


    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = (int) (speed + acceleration);
    }

    @Override
    public void decreaseSpeed() {
        speed = (int) (speed - deceleration);
    }

}