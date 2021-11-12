package com.kodilla.stream.world;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent> continentsList = new ArrayList<>();

    public boolean addContinent(Continent continent) {
        return continentsList.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal peopleInTheWorld = continentsList.stream()
                .flatMap(continent -> continent.getCountriesList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum,country) -> sum.add(country));
        return peopleInTheWorld;
    }
}
