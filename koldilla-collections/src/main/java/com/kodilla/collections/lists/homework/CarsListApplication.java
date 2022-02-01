package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Volkswagen;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Volkswagen());
        cars.add(new Ford());
        cars.add(new Volkswagen()); // [1*]

        Car opel = new Opel();
        cars.add(opel);
        cars.add(new Ford());
        cars.add(new Opel());

        cars.add(new Volkswagen());
        System.out.println("Wielkosc listy: " + cars.size());

        for (Car car : cars)
            CarUtils.describeCar(car);

        cars.remove(2); // [1*]
        cars.remove(opel);
        cars.remove(new Opel());


        System.out.println("Wielkosc listy: " + cars.size());

        for (Car car : cars)
            CarUtils.describeCar(car);
    }
}