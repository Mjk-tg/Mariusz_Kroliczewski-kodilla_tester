package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10,20);
        Square square = new Square(10,10);
        TriangleRectangular triangleRectangular = new TriangleRectangular(10,10);

        System.out.println("Obwód prostokąta = " + rectangle.perimeter() + " Pole powierzchni prostokąta = " + rectangle.area());
        System.out.println("Obwód kwadratu = " + square.perimeter() + " Pole powierzchni kwadratu = " + square.area());
        System.out.println("Obwód trójkąta prostokątnego = " + triangleRectangular.perimeter() + " Pole powierzchni trójkąta prostokątnego = " + triangleRectangular.area());

    }
}
