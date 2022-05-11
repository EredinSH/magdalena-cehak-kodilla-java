package om.kodilla.good.patterns.challenges.flights;

import java.sql.SQLOutput;
import java.util.List;

public class FlightSearchEngine {

    public static void main(String[] args) {

        Timetable timetable = new Timetable();
        System.out.println("Szukamy lotów z:");
        List<Flight> flightFrom = timetable.getFlightsFrom("Vienna");
        timetable.showFlight(flightFrom);
        System.out.println("--------------------------------------");

        System.out.println("Szukamy lotów do:");
        List<Flight> flightTo = timetable.getFlightsTo("Warszawa");
        timetable.showFlight(flightTo);
        System.out.println("--------------------------------------");

        System.out.println("Szukamy lotów przez:");
        List<Flight> flightBy = timetable.getFlightsBy("New York","Bangkok");
        timetable.showFlight(flightBy);
        System.out.println("--------------------------------------");

    }

}
