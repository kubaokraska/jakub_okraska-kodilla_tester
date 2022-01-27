package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Volkswagen;

import java.util.Random;

public class CarsApplication {
    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];

        for (int i = 0; i < cars.length; i++)
            cars[i] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar() {
        Random random = new Random();
        int pickCar = random.nextInt(3);
        int increaseSpeed = random.nextInt(10);
        if (pickCar == 0) {
            Car car = new Ford();
            for (int i = 0; i < increaseSpeed; i++)
                car.increaseSpeed();

            return car;
        } else if (pickCar == 1) {
            Car car = new Opel();
            for (int i = 0; i < increaseSpeed; i++)
                car.increaseSpeed();

            return car;
        } else {
            Car car = new Volkswagen();
            for (int i = 0; i < increaseSpeed; i++)
                car.increaseSpeed();

            return car;
        }
    }
}