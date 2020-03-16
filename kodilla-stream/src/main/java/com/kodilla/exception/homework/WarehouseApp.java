package com.kodilla.exception.homework;


public class WarehouseApp {
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("101/01/20"));
        warehouse.addOrder(new Order("102/01/20"));
        warehouse.addOrder(new Order("103/01/20"));
        warehouse.addOrder(new Order("105/01/20"));
        warehouse.addOrder(new Order("106/01/20"));

        Order foundOrder = null;
        try {
            foundOrder = warehouse.getOrder("101/01/20");
        } catch (OrderDoesntExistException e) {
            e.printStackTrace();
        }
        System.out.println(foundOrder.getNumber());

        try {
            Order foundNoOrder = warehouse.getOrder("100/01/20");
        } catch (OrderDoesntExistException e) {
            e.printStackTrace();
        }

    }
}
