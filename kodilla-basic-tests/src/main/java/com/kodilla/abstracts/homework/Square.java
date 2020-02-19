package com.kodilla.abstracts.homework;

public class Square extends Shape {

    public Square(double height, double width) {
        super(height, width);
    }


    @Override
    public double perimeter() {
        return getHeight() * 4;
    }

    @Override
    public double area() {
        return Math.pow(getHeight(),2);
    }
}
