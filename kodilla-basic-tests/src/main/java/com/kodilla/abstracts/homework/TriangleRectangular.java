package com.kodilla.abstracts.homework;

public class TriangleRectangular extends  Shape {


    public TriangleRectangular(double firstDim, double secondDim) {
        super(firstDim, secondDim);
    }

    double hypotenuse = Math.sqrt(Math.pow(getHeight(),2) + Math.pow(getWidth(),2));

    @Override
    public double perimeter() {
        return getHeight() + getWidth() + hypotenuse ;
    }

    @Override
    public double area() {
        return (getHeight() * getWidth())/2;
    }
}
