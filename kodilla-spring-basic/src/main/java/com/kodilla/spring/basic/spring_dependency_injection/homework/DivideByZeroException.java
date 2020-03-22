package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class DivideByZeroException extends Exception {
    public DivideByZeroException(){
        super("Divider cannot be 0");
    }
}
