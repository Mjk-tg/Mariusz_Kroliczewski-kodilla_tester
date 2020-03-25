package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertThrows;


@SpringBootTest
public class CalculatorTestSuite {
    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    Calculator calculator = context.getBean(Calculator.class);

    @Test
    public  void shouldDisplayResult(){
        //given
        Display display = context.getBean(Display.class);
        //when
        double screen = display.console(10);
        //then
        Assertions.assertEquals(10,screen);
    }

    @Test
    public void shouldAddNumbers() {
        //given
        double a=0;
        double b=1;

        //when
        double result = calculator.add(a, b);

        //then
        Assertions.assertEquals(1,result);
    }

    @Test
    public void shouldSubtractNumbers() {
        //given
        double a=0;
        double b=1;

        //when
        double result = calculator.subtract(a, b);

        //then
        Assertions.assertEquals(-1,result);
    }

    @Test
    public void shouldMultiplyNumbers() {
        //given
        double a=0;
        double b=1;

        //when
        double result = calculator.multiply(a, b);

        //then
        Assertions.assertEquals(0,result);
    }

    @Test
    public void shouldDivideNumbers() throws DivideByZeroException {
        //given
        double a=0;
        double b=1;

        //when
        double result = calculator.divide(a, b);

        //then
        Assertions.assertEquals(0,result);
    }

   @Test
    public void shouldThrowExceptionIfDividingByZero() throws DivideByZeroException {
        //given
        double a=1.0;
        double b=0.0;

        //when

        //then
       assertThrows(DivideByZeroException.class, () -> {
           calculator.divide(a, b);
       });
    }
}