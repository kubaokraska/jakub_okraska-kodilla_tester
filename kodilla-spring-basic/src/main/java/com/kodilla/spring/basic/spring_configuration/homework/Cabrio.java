package com.kodilla.spring.basic.spring_configuration.homework;


import java.time.LocalDateTime;

public class Cabrio implements Car{

    @Override
    public boolean hasHeadlightsTurnedOn() {
        LocalDateTime today = LocalDateTime.now();
        if(today.getHour()>20 && today.getHour()<6)
            return true;
        else
           return false;
    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }
}