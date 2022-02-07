package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightApplication {
    public static void main(String[] args) {
List <Flight> flights = new ArrayList<>();

for(Flight flight :FlightFinder.findFlightsTo("Poznań"))
    System.out.println(flight);
    }
}