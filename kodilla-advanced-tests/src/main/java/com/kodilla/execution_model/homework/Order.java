package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Order {

    private double orderValue;
    private LocalDate orderData; //data w formacie yyyy-MM-dd
    private String clientLogin;

    public Order(double orderValue, LocalDate orderData, String clientLogin) {
        this.orderValue = orderValue;
        this.orderData = orderData;
        this.clientLogin = clientLogin;
    }

    public double getOrderValue() {
        return orderValue;
    }

    public LocalDate getOrderData() {
        return orderData;
    }

    public String getClientLogin() {
        return clientLogin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return Double.compare(order.getOrderValue(), getOrderValue()) == 0 &&
                getOrderData().equals(order.getOrderData()) &&
                getClientLogin().equals(order.getClientLogin());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOrderValue(), getOrderData(), getClientLogin());
    }
}
