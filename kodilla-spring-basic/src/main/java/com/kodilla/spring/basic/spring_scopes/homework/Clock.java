package com.kodilla.spring.basic.spring_scopes.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class Clock {

    long time = System.currentTimeMillis();

    public long getTime(){
        return time;
    }
}
