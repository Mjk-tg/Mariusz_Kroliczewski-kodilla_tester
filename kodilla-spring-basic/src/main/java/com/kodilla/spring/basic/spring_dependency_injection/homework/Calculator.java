package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private Display display;
    public double value;

    public Calculator(Display display) {
        this.display = display;
    }

    public double add(double a, double b){
        value=a+b;
        display.console(value);
        return value;
    }

    public double subtract(double a, double b) {
        value=a-b;
        display.console(value);
        return value;
    }

    public double multiply(double a, double b) {
        value=a*b;
        display.console(value);
        return value;
    }

    public double divide(double a, double b) throws DivideByZeroException {
        if (b == 0.0) {
            throw new DivideByZeroException();
        }
        value = a / b;
        display.console(value);
        return value;
    }
}
