package com.kodilla.abstracts.homework;

public class TriangleRectangular extends  Shape {


    public TriangleRectangular(double firstDim, double secondDim) {
        super(firstDim, secondDim);
    }

    double hypotenuse = Math.sqrt(Math.pow(getFirstDim(),2) + Math.pow(getSecondDim(),2));

    @Override
    public double perimeter() {
        return getFirstDim() + getSecondDim() + hypotenuse ;
    }

    @Override
    public double area() {
        return (getFirstDim() * getSecondDim())/2;
    }
}
