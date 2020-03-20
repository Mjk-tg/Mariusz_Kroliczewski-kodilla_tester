package com.kodilla.spring.basic.dependency_injection.homework;

public class TytusPorterNotificationService implements NotificationService{

    @Override
    public void success(String address) {
        System.out.println("Tytus Porter delivered package to: " + address);
    }

    @Override
    public void fail(String address) {
        System.out.println("Tytus Porter not delivered package to: " + address);
    }
}

