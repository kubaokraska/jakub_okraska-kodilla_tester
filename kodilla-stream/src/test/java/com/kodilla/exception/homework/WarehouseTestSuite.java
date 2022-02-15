package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    @Test
    public void testGetOrder() throws OrderDoesntExistException {
        //given
        Warehouse orderList = new Warehouse();
        orderList.addOrder(new Order("11"));
        orderList.addOrder(new Order("12"));
        orderList.addOrder(new Order("13"));
        //when
        Order returnOrder = orderList.getOrder("12");
        //then
        assertEquals("12", returnOrder.getNumber());
    }

    @Test
    public void testGetOrder_withException() {
        //given
        Warehouse orderList = new Warehouse();
        orderList.addOrder(new Order("11"));
        orderList.addOrder(new Order("12"));
        orderList.addOrder(new Order("13"));
        //when
        //then
        assertThrows(OrderDoesntExistException.class, () -> orderList.getOrder("10"));
    }
}