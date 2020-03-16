package com.kodilla.exception.homework;

import org.junit.Test;
import static org.junit.Assert.*;

public class WarehouseTestSuite {

    Warehouse warehouse = new Warehouse();

@Test
    public void ifWarehouseGetOrderForExistingOrders() throws OrderDoesntExistException {

    //given
    String number = "102/01/20";
    warehouse.addOrder(new Order(number));

    //when
    Order existingOrder = warehouse.getOrder(number);

    //then
    assertEquals(existingOrder.getNumber(), number);

}

    @Test(expected = OrderDoesntExistException.class)
    public void ifWarehouseGetOrderSupportsExceptionForNoExistingOrders() throws OrderDoesntExistException {

        //given
        String wantedNumber = "100/01/19";
        String number = "102/01/20";
        warehouse.addOrder(new Order(number));

        //when
        String existingOrder = warehouse.getOrder(wantedNumber).getNumber();

        //then
        assertNotEquals("100/01/19", existingOrder);
    }
}
