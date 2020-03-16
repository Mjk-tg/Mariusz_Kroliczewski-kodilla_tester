package com.kodilla.exception.homework;

import java.util.Objects;

public class Order {
    String number;

    public Order(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return getNumber().equals(order.getNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber());
    }
}
