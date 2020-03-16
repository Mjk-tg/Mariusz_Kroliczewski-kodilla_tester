package com.kodilla.exception.homework;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Warehouse {

    private Set<Order> orders = new HashSet<>();

    public Set addOrder(Order order){
        orders.add(order);
        return orders;
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
            List<Order> foundOrder = getOrders()
                .stream()
                .filter(o->o.getNumber().equals(number))
                .collect(Collectors.toList());
            if (foundOrder.size()!=0){
            Order order = foundOrder.get(0);
            return order;
            }
            throw new OrderDoesntExistException();

    }
    private Set<Order> getOrders(){
        return orders;
    }


}
