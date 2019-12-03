package com.kodilla.abstracts.homework;

public class Square extends Shape {

    public Square(double firstDim, double secondDim) {
        super(firstDim, secondDim);
    }


    @Override
    public double perimeter() {
        return getFirstDim() * 4;
    }

    @Override
    public double area() {
        return Math.pow(getFirstDim(),2);
    }
}
