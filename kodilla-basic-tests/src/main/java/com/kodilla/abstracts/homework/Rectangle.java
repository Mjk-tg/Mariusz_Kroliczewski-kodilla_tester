package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {


    public Rectangle(double firstDim, double secondDim) {
        super(firstDim, secondDim);
    }

    @Override
    public double perimeter() {
        return (getFirstDim()+getSecondDim())*2;
    }

    @Override
    public double area() {
        return getSecondDim()*getFirstDim();
    }



}
