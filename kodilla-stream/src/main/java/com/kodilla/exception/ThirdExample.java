package com.kodilla.exception;

public class ThirdExample {
    public static void main(String[] args) {
        AirportRepository airportRepository = new AirportRepository();
        try {
            boolean isViennaInUse = airportRepository.isAirportInUse("Warsaw");
            System.out.println("Vienna status:" + isViennaInUse);
        } catch (AirportNotFoundException e) {
            System.out.println("Sorry, This ariponr cannot bla bla bla");
        } finally {
            System.out.println("Thankt from KodillaAirport");
        }
    }
}