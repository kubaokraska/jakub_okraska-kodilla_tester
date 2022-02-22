package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.Authenticator;
import java.util.Date;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {
    Shop shop = new Shop();

    Order luq = new Order(10, new Date(1540264000000L), "luq");
    Order neo = new Order(33.99, new Date(1540274000000L), "neo");
    Order secondNeo = new Order(33.99, new Date(1540274000000L), "neo"); // duplicate
    Order drake = new Order(200, new Date(1540284000000L), "drake");

    Order muller = new Order(696, new Date(1540294000000L), "muller");
    Order ninja = new Order(100, new Date(1542284000000L), "ninja");
    Order dragon = new Order(79.99, new Date(1542294000000L), "dragon");

    @Test
    public void getOrdersByTimeTest() {
        //When
        Date dateStart = new Date(1542294000000L);
        Date dateEnd = new Date(1542294000000L);
        Set<Order> resultOrder = shop.getOrdersByTime(dateStart, dateEnd);
        //Then
        assertEquals(3, resultOrder.size());
    }

    @Test
    public void getOrdersByTimeTest_WithException() {
        Date dateStart = new Date(1542494000000L);
        Date dateEnd = new Date(1542494000000L);
        Set<Order> resultOrder = shop.getOrdersByTime(dateStart, dateEnd);
        //Then
        assertThrows(OrderDoesntExist.class, () -> resultOrder.size());
    }

    @Test
    public void getOrdersByPriceTest() {
        //When
        double startingPrice = 10000;
        double endingPrice = 1000000;
        Set<Order> resultOrder = shop.getOrdersByPrice(startingPrice, endingPrice);
        //Then
        assertEquals(0, resultOrder.size());
    }

    @Test
    public void getOrdersByPriceTest_WithException() {
        //When
        double startingPrice = 1000;
        double endingPrice = 1200;
        Set<Order> resultOrder = shop.getOrdersByPrice(startingPrice, endingPrice);
        //Then
        assertThrows(OrderDoesntExist.class,() -> resultOrder.size());
    }

    @Test
    public void getNumberOfOrder() {
        assertEquals(6, shop.getNumberOfOrder());

    }

    @Test
    public void getAllPriceValue() {
        assertEquals(1119.98, shop.getAllPriceValue());
    }

    @BeforeEach
    public void initializeOrders() {
        shop.addOrder(dragon);
        shop.addOrder(drake);
        shop.addOrder(luq);
        shop.addOrder(neo);
        shop.addOrder(muller);
        shop.addOrder(ninja);
        shop.addOrder(secondNeo);
    }
}