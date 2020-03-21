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
    public void shouldCreateDifferentClocks() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock clock1 = context.getBean(Clock.class);
        Clock clock2 = context.getBean(Clock.class);
        Clock clock3 = context.getBean(Clock.class);
        long time1=clock1.getTime();
        long time2=clock1.getTime();
        long time3=clock1.getTime();

        Assertions.assertNotEquals(clock1, clock2);
        Assertions.assertNotEquals(clock1, clock3);
        Assertions.assertNotEquals(clock2, clock3);

        Assertions.assertEquals(time1, time2);
        Assertions.assertEquals(time2, time3);
        Assertions.assertEquals(time1, time3);    }
}