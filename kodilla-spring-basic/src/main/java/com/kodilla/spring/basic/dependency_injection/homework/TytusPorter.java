package com.kodilla.spring.basic.dependency_injection.homework;

public class TytusPorter implements DeliveryService{

    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 30) {
            System.out.println("Tytus Porter inform: Package too heavy");
            return false;
        }
        System.out.println("Tytus Porter inform: Delivering in progress...");
        return true;
    }
}
