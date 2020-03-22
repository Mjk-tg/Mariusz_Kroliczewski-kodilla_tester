package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootTest
public class CalculatorTestSuite {
    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    Calculator bean = context.getBean(Calculator.class);
    Exception exception = context.getBean(DivideByZeroException.class);

    @Test
    public  void shouldDisplayResult(){
        //given
        Display bean = context.getBean(Display.class);
        //when
        Display display = bean.display(10);
        //then
        Assertions.assertNull(display);

    }

    @Test
    public void shouldAddNumbers() {
        //given
        double a=0;
        double b=1;

        //when
        double result = bean.add(a, b);

        //then
        Assertions.assertEquals(1,result);

    }

    @Test
    public void shouldSubtractNumbers() {
        //given
        double a=0;
        double b=1;

        //when
        double result = bean.subtract(a, b);

        //then
        Assertions.assertEquals(-1,result);
    }

    @Test
    public void shouldMultiplyNumbers() {
        //given
        double a=0;
        double b=1;

        //when
        double result = bean.multiply(a, b);

        //then
        Assertions.assertEquals(0,result);
    }

    @Test
    public void shouldDivideNumbers() throws DivideByZeroException {
        //given
        double a=0;
        double b=1;

        //when
        double result = bean.divide(a, b);

        //then
        Assertions.assertEquals(0,result);
    }

//   @Test(expected=DivideByZeroException.class)
//    public void shouldThrowExceptionIfDividingByZero() throws DivideByZeroException {
//        //given
//        double a=1.0;
//        double b=0.0;
//
//        //when
//        double result = bean.divide(a, b);
//
//        //then
//       Assertions.assertEquals(0,result);
//    }

}