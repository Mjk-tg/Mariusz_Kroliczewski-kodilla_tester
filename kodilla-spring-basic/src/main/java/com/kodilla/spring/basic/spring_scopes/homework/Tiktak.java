package com.kodilla.spring.basic.spring_scopes.homework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Tiktak {
    public static void main(String[] args) throws InterruptedException {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock clock1 = context.getBean(Clock.class);
        Thread.sleep(300);
        System.out.println();
        Clock clock2 = context.getBean(Clock.class);
        Thread.sleep(300);
        Clock clock3 = context.getBean(Clock.class);

        long time1=clock1.getTime();
        long time2=clock2.getTime();
        long time3=clock3.getTime();

        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);


    }
}
