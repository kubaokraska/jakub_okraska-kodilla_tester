package com.kodilla.parametrized_tests.homework;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {
    Set<Order> orderCollection = new HashSet<>();

    public void addOrder(Order order) {
        orderCollection.add(order);
    }

    public Set<Order> getOrdersByTime(Date dateStart, Date dateEnd) {
        Set<Order> resultCollection = orderCollection
                .stream()
                .filter(o -> o.getDate().after(dateStart) && o.getDate().before(dateEnd))
                .collect(Collectors.toSet());

        return resultCollection;
    }

    public Set<Order> getOrdersByPrice(double priceLower, double priceHigher) {
        Set<Order> resultCollection = orderCollection
                .stream()
                .filter(o -> o.getPrice() > priceLower && o.getPrice() < priceHigher)
                .collect(Collectors.toSet());

        return resultCollection;
    }

    public int getNumberOfOrder() {
        return orderCollection.size();
    }

    public double getAllPriceValue() {
        double allPrice = 0;

        for (Order order : orderCollection)
            allPrice = allPrice + order.getPrice();

        return allPrice;
    }

    public Set<Order> getShopCollection() {
        return this.orderCollection;
    }
}