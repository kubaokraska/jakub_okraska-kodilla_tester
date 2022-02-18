package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Order order;

        warehouse.addOrder(new Order("14"));
        warehouse.addOrder(new Order("15"));
        warehouse.addOrder(new Order("12"));
        warehouse.addOrder(new Order("11"));

        warehouse.addOrder(new Order("5"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("15"));

        try {
            order = warehouse.getOrder("10");
            System.out.println("Order exist: " + order);
        } catch (OrderDoesntExistException e) {
            System.out.println("Order Doesn't Exist");
        }
    }
}