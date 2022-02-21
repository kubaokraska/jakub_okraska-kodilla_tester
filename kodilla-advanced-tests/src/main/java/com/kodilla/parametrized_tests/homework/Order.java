package com.kodilla.parametrized_tests.homework;

import java.util.Date;
import java.util.Objects;

public class Order {
    private double price;
    private Date date;
    private String login;

    public Order(double price, Date date, String login) {
        this.price = price;
        this.date = date;
        this.login = login;
    }

    public double getPrice() {
        return price;
    }

    public Date getDate() {
        return date;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(order.price, price) == 0 && Objects.equals(date, order.date) && Objects.equals(login, order.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, date, login);
    }
}