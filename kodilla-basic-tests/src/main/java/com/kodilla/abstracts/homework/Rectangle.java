package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {


    public Rectangle(double height, double width) {
        super(height, width);
    }

    @Override
    public double perimeter() {
        return (getHeight()+getWidth())*2;
    }

    @Override
    public double area() {
        return getHeight()*getWidth();
    }



}
