package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class ShippingCenterTestSuite {
    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
    DeliveryService deliveryService = context.getBean(DeliveryService.class);
    ShippingCenter shippingCenter = context.getBean(ShippingCenter.class);
    String address = "Testaddress@trapezfik.com";

    @Test
    void shouldReturnTrueIfPermissibleWeight(){
        //Given
        double weight = 30.0;

        //When
        boolean result = deliveryService.deliverPackage(address,weight);

        //Then
        Assertions.assertTrue(result);
    }

    @Test
    void shouldReturnFalseIfPackageIsToHeavy(){
        //Given
        double weight = 30.001;

        //When
        boolean result = deliveryService.deliverPackage(address,weight);

        //Then
        Assertions.assertFalse(result);
    }

    @Test
    void triesToSendPackageHeavierThanPermissible() {
        //Given
        double weight = 30.001;

        //When
        String sendingResult = shippingCenter.sendPackage(address,weight);

        //Then
        Assert.assertEquals("Package not delivered to: Testaddress@trapezfik.com",sendingResult);
    }

    @Test
    void triesToSendPackageWithPermissibleWeight() {
        //Given
        double weight = 30.0;

        //When
        String sendingResult = shippingCenter.sendPackage(address,weight);

        //Then
        Assert.assertEquals("Package delivered to: Testaddress@trapezfik.com",sendingResult);
    }
}