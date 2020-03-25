package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ClockTestSuite {

    @Test
    public void shouldCreateDifferentClocks() throws InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock clock1 = context.getBean(Clock.class);
        Thread.sleep(300);
        Clock clock2 = context.getBean(Clock.class);
        Thread.sleep(300);
        Clock clock3 = context.getBean(Clock.class);

        long time1=clock1.getTime();
        long time2=clock2.getTime();
        long time3=clock3.getTime();

        Assertions.assertNotEquals(clock1, clock2);
        Assertions.assertNotEquals(clock1, clock3);
        Assertions.assertNotEquals(clock2, clock3);

        Assertions.assertNotEquals(time1, time2);
        Assertions.assertNotEquals(time2, time3);
        Assertions.assertNotEquals(time1, time3);
    }
}