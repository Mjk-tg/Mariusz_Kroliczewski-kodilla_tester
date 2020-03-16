package com.kodilla.exception.homework;

public class OrderDoesntExistException extends Exception{
    public OrderDoesntExistException() {
        super("Order does not exist in the repository");
    }

}
