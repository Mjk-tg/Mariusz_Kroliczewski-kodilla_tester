package com.kodilla.abstracts.homework;

public abstract class Shape {
    private double height;
    private double width;

    public Shape (double height, double width) {
        this.height = height;
        this.width = width;
    }

    public abstract double perimeter();

    public abstract double area();

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

}
