package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {
    public static void main(String[] args) {

        DeliveryService deliveryService = new DeliveryService();

        ShippingCenter shippingCenter = new ShippingCenter(deliveryService);
        shippingCenter.sendPackage("Hill Street 11, New York", 18.2);

    }
}
