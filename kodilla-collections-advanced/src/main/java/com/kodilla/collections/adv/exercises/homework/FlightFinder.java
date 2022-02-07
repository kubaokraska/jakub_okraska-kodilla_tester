package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {

    public static List<Flight> findFlightsFrom(String departure) {
        List<Flight> departureFlightList = new ArrayList<>();

        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getDeparture().equals(departure))
                departureFlightList.add(flight);
        }
        return departureFlightList;
    }

    public static List<Flight> findFlightsTo(String arrival) {
        List<Flight> arrivalFlightList = new ArrayList<>();

        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getArrival().equals(arrival))
                arrivalFlightList.add(flight);
        }
        return arrivalFlightList;
    }
}