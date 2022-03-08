package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalDate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfiguration {

    @Bean
    public Car createCar() {
        LocalDate today = LocalDate.now();
        if (today.getDayOfYear() >= 81 && today.getDayOfYear() < 174)
            return new Sedan();
        if (today.getDayOfYear() >= 174 && today.getDayOfYear() < 267)
            return new Cabrio();
        if (today.getDayOfYear() >= 267 && today.getDayOfYear() < 357)
            return new Sedan();
        else
            return new SUV();
    }
}