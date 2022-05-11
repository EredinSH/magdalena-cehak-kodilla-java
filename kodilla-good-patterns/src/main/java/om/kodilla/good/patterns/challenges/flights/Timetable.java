package om.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public final class Timetable {

    private final List<Flight> flightsList = new ArrayList<>();

    public Timetable() {
        flightsList.add(new Flight("New York","Warszawa"));
        flightsList.add(new Flight("New York","Madrid"));
        flightsList.add(new Flight("New York","Berlin"));
        flightsList.add(new Flight("Warszawa","Bangkok"));
        flightsList.add(new Flight("Warszawa","Madrid"));
        flightsList.add(new Flight("Madrid","New York"));
        flightsList.add(new Flight("Madrid","Vienna"));
        flightsList.add(new Flight("Berlin","New York"));
        flightsList.add(new Flight("Bangkok", "Vienna"));
        flightsList.add(new Flight("Vienna","Bangkok"));
    }

    public List<Flight> getFlightsFrom(String location) {
        return flightsList.stream()
                .filter(f -> f.getFlightFrom().equals(location))
                .collect(Collectors.toList());
    }

    public List<Flight> getFlightsTo(String location) {
        return flightsList.stream()
                .filter(f -> f.getFlightTo().equals(location))
                .collect(Collectors.toList());
    }

    public void getFlightsBy(String start,String sharedCity, String end) {
        List<Flight> resultList = flightsList.stream()
                .filter(f -> f.getFlightFrom().equals(start) && f.getFlightTo().equals(sharedCity))
                .collect(Collectors.toList());
        flightsList.stream()
                .filter(f -> f.getFlightTo().equals(end) && f.getFlightFrom().equals(sharedCity))
                .collect(Collectors.toCollection(() -> resultList));
        if(resultList.size() == 0) {
            System.out.println("Nie ma takiego lotu");
        } else {
            resultList.stream().forEach(System.out::println);
        }
    }

    public void showFlight(List<Flight> list){
        if(list.size() > 0) {
            for(Flight flight : list) {
                System.out.println(flight);
            }
        } else {
            System.out.println("Nie znaleziono wyszukiwanego lotu!");
        }
    }

}
