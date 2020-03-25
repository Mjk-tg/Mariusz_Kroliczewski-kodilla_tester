package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.List;

class ShopTestSuite {

    Shop shop = new Shop();

    @Test
    void addOrder() {
        //Given
        shop.orders.add(new Order(10.00, LocalDate.of(2018,9,19),"Tytus"));

        //Then
        Assertions.assertEquals(6, shop.ordersQuantity());
    }

    @Test
    void returnRequiredOrdersByDataIfFirstDataIsBeforSecond() {
        //Given
        LocalDate data1 = LocalDate.of(2019, 11, 30);
        LocalDate data2 = LocalDate.of(2020, 2, 21);

        //When
        List orderListByData = shop.returnRequiredOrdersByData(data2, data1);

        Order expectedOrder3 = new Order(200.00, LocalDate.of(2019, 12, 1), "Tytus");
        Order expectedOrder5 = new Order(300.50, LocalDate.of(2020,1,19),"Tytus");

        //Then
        Assertions.assertEquals(2, orderListByData.size());
        Assertions.assertTrue(orderListByData.contains(expectedOrder3));
        Assertions.assertTrue(orderListByData.contains(expectedOrder5));
    }

    @Test
    void returnRequiredOrdersByDataIfFirstDataIsAfterSecond() {
        //Given
        LocalDate data2 = LocalDate.of(2019, 11, 30);
        LocalDate data1 = LocalDate.of(2020, 2, 21);

        //When
        List orderListByData = shop.returnRequiredOrdersByData(data2, data1);

        Order expectedOrder3 = new Order(200.00, LocalDate.of(2019, 12, 1), "Tytus");
        Order expectedOrder5 = new Order(300.50, LocalDate.of(2020,1,19),"Tytus");

        //Then
        Assertions.assertEquals(2, orderListByData.size());
        Assertions.assertTrue(orderListByData.contains(expectedOrder3));
        Assertions.assertTrue(orderListByData.contains(expectedOrder5));
    }

    @Test
    void returnRequiredOrdersByValueWhenFirstValueIsSmallerAsSecond() {
        //Given
        double value1 = 120;
        double value2 = 300;

        //When
        List orderListByValue = shop.returnRequiredOrdersByValue(value1, value2);

        Order expectedOrder3 = new Order(200.00, LocalDate.of(2019,12,1),"Tytus");
        Order expectedOrder5 = new Order(125.00, LocalDate.of(2020,3,12),"Tytus");

        //Then
        Assertions.assertEquals(2, orderListByValue.size());
        Assertions.assertTrue(orderListByValue.contains(expectedOrder3));
        Assertions.assertTrue(orderListByValue.contains(expectedOrder5));
    }

        @Test
        void returnRequiredOrdersByValueWhenFirstValueIsBiggerAsSecond() {
            //Given
            double value2 = 120;
            double value1 = 300;

            //When
            List orderListByValue = shop.returnRequiredOrdersByValue(value1, value2);

            Order expectedOrder3 = new Order(200.00, LocalDate.of(2019,12,1),"Tytus");
            Order expectedOrder5 = new Order(125.00, LocalDate.of(2020,3,12),"Tytus");

            //Then
            Assertions.assertEquals(2, orderListByValue.size());
            Assertions.assertTrue(orderListByValue.contains(expectedOrder3));
            Assertions.assertTrue(orderListByValue.contains(expectedOrder5));
    }

    @Test
    void ordersQuantity() {

        Assertions.assertEquals(5, shop.ordersQuantity());
    }

    @Test
    void totalOrdersValue() {

        Assertions.assertEquals(826.00,shop.totalOrdersValue());
    }

    @BeforeEach
    public void createOrdersForTesting(){

        shop.orders.add(new Order(100.00, LocalDate.of(2019,9,19),"Tytus"));
        shop.orders.add(new Order(100.50, LocalDate.of(2019,11,13),"Tytus"));
        shop.orders.add(new Order(200.00, LocalDate.of(2019,12,1),"Tytus"));
        shop.orders.add(new Order(300.50, LocalDate.of(2020,1,19),"Tytus"));
        shop.orders.add(new Order(125.00, LocalDate.of(2020,3,12),"Tytus"));
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting Shop set values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }

}