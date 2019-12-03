package com.kodilla.abstracts.homework;

public abstract class Shape {

    private double firstDim;
    private double secondDim;

    public Shape (double firstDim, double secondDim) {
        this.firstDim = firstDim;
        this.secondDim = secondDim;
    }

    public abstract double perimeter();

    public abstract double area();

    public double getFirstDim() {
        return firstDim;
    }

    public double getSecondDim() {
        return secondDim;
    }


}
