package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.*;

public class Shop {

    Set<Order> orders = new HashSet<>();

    public Set<Order> addOrder(double value, LocalDate data, String client){

        orders.add(new Order( value, data, client));
        return orders;
    }

    public List returnRequiredOrdersByData(LocalDate data1, LocalDate data2){
        List<Order> orderListByData = new ArrayList<>();
        LocalDate dataStart;
        LocalDate dataFinish;
        if (data1.isBefore(data2)){
            dataStart = data1;
            dataFinish = data2;
            } else {
            dataStart = data2;
            dataFinish = data1;
        }

        for (Order order : orders) {
            if (order.getOrderData().isAfter(dataStart) && order.getOrderData().isBefore(dataFinish))
            orderListByData.add(order);
        }
            return orderListByData;
    }

    public List returnRequiredOrdersByValue(double value1, double value2) {
        List<Order> orderListByValue = new ArrayList<>();
        double valueStart;
        double valueFinish;
        if (value1 <= value2) {
            valueStart = value1;
            valueFinish = value2;
            } else {
            valueStart = value2;
            valueFinish = value1;
        }

        for (Order order : orders) {
            if (order.getOrderValue() > valueStart && order.getOrderValue() < valueFinish)
            orderListByValue.add(order);
        }
            return orderListByValue;
    }

    public int ordersQuantity(){
        return orders.size();
    }

    public double totalOrdersValue(){
        double totalOrdersValue = 0.0;
        for (Order order : orders){
            totalOrdersValue = totalOrdersValue+ order.getOrderValue();
        }
            return totalOrdersValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shop)) return false;
        Shop shop = (Shop) o;
        return Objects.equals(orders, shop.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orders);
    }
}
