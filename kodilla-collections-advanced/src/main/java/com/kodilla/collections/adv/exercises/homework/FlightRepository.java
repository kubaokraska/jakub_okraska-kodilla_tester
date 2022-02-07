package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightRepository {

    public static List<Flight> getFlightsTable() {
        List<Flight> flightList = new ArrayList<>();

        flightList.add(new Flight("Poznań", "Berlin"));
        flightList.add(new Flight("Poznań", "Berlin"));
        flightList.add(new Flight("Madryt", "Poznań"));
        flightList.add(new Flight("Poznań", "Amsterdam"));

        flightList.add(new Flight("Berlin", "Poznań"));
        flightList.add(new Flight("Berlin", "Wrocław"));
        flightList.add(new Flight("Berlin", "Warszawa"));
        flightList.add(new Flight("Warszawa", "Opole"));

        flightList.add(new Flight("Warszawa", "Madryt"));
        flightList.add(new Flight("Madryt", "Warszawa"));
        flightList.add(new Flight("Poznań", "Sztokholm"));
        flightList.add(new Flight("Wrocław", "Warszawa"));

        return flightList;
    }
}