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

        boolean flightScan = false;

        try {
            if (flightsDetector.containsKey(flight.getDepartureAirport()) == true && flightsDetector.containsKey(flight.getArrivalAirport()) == true) {
                System.out.println("Twój lot z " + flight.getArrivalAirport() + " do " + flight.getDepartureAirport() + " jest w systemie.");
                flightScan = true;
            } else {
                throw new RouteNotFoundException("Błędnie wpisana nazwa lotniska");
            }

        } catch (RouteNotFoundException e) {
            System.out.println("Wyszukiwanego lotniska nie ma w naszej ofercie.");
        } finally {
            System.out.println("Życzymy udanej podróży!");
        }

        return flightScan;
    }

    public static void main(String[] args)throws Exception {
        FlightsMap flightMap = new FlightsMap();
        Flight flight1 = new Flight("Chopin", "Las Vegas");
        flightMap.findFilght(flight1);
    }

}
