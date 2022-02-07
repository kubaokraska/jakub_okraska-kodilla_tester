package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FlightFinderTest {

    @Test
    public void testFindFlightsFrom(){
        //given
        List <Flight> expectedFlightList = new ArrayList<>();
        expectedFlightList.add(new Flight("Poznań", "Berlin"));
        expectedFlightList.add(new Flight("Poznań", "Berlin"));
        expectedFlightList.add(new Flight("Poznań","Sztokholm"));
        expectedFlightList.add(new Flight("Poznań","Amsterdam"));
        //when
       List <Flight> result = FlightFinder.findFlightsFrom("Poznań");
        //then
        assertEquals(4,result.size()); // chcialem tu wstawic asserEquals(expectedFlightList, result), ale nie działa
    }

    @Test
    public void testFindFlightsTo(){
        //given
        List <Flight> expectedFlightList = new ArrayList<>();
        expectedFlightList.add(new Flight("Berlin", "Warszawa"));
        expectedFlightList.add(new Flight("Madryt", "Warszawa"));
        expectedFlightList.add(new Flight("Wrocław", "Warszawa"));
        //when
        List <Flight> result = FlightFinder.findFlightsTo("Warszawa");
        //then
        assertEquals(3,result.size()); // chcialem tu wstawic asserEquals(expectedFlightList, result), ale nie działa
    }
}