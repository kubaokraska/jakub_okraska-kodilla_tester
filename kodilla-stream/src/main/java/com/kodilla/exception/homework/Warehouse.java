package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Warehouse {
    private List<Order> orders = new ArrayList<>();

    public List<Order> addOrder(Order order) {
        this.orders.add(order);
        return this.orders;
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        String returnString = orders
                .stream()
                .filter(o -> o.getNumber().equals(number))
                .map(Order::toString)
                .collect(Collectors.joining());

        if (returnString.equals(""))
            throw new OrderDoesntExistException();
        return new Order(returnString);
    }
}