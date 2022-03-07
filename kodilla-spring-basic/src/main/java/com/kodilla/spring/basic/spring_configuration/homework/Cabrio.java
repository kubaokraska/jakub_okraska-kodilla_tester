package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalDate;

public class Cabrio implements Car{

    @Override
    public boolean hasHeadlightsTurnedOn() {
        LocalDate today = LocalDate.now();
        if(/*obsluga LocalDate mnie przerasta*/)
            return true;
        else
            return false;
    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }
}