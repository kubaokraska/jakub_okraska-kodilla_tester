package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarConfigurationTestSuite {

    @Test
    public void shouldReturnCar() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car bean = (Car) context.getBean("createCar");

        String carType = bean.getCarType();
        List<String> possibleCar = Arrays.asList("Sedan", "Cabrio", "SUV");

        Assertions.assertTrue(possibleCar.contains(carType));
    }

    @Test
    public void shouldHasLightsOn() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car bean = (Car) context.getBean("createCar");

        Assertions.assertTrue(bean.hasHeadlightsTurnedOn());
    }
}