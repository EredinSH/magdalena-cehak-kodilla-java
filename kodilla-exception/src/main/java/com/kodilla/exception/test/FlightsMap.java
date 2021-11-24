package com.kodilla.exception.test;

import com.sun.jdi.Value;

import java.util.HashMap;
import java.util.Map;

public class FlightsMap {

    public boolean findFilght(Flight flight) throws Exception {
        HashMap<String, Boolean> flightsDetector = new HashMap<>();
        flightsDetector.put("Chopin",true);
        flightsDetector.put("Robin Hood", false);
        flightsDetector.put("Mikołaj Kopernik", true);

            if (flightsDetector.containsKey(flight.getDepartureAirport()) == true && flightsDetector.containsKey(flight.getArrivalAirport()) == true) {
                return flightsDetector.get(flight.getDepartureAirport()) && flightsDetector.get(flight.getArrivalAirport());
            } else {
                throw new RouteNotFoundException("Błędnie wpisana nazwa lotniska");
            }
    }

    public static void main(String[] args)throws Exception {
        FlightsMap flightMap = new FlightsMap();
        Flight flight1 = new Flight("Chopin", "Las Vegas");

        try {
            flightMap.findFilght(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println("Wyszukiwanego lotniska nie ma w naszej ofercie.");
        } finally {
            System.out.println("Życzymy udanej podróży!");
        }
    }

}
