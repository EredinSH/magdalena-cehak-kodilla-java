package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {

    private final String countryName;
    private final List<String> countries = new ArrayList<>();

    public Continent(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }

    public List<String> getCountries() {
        return new ArrayList<>(countries);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Continent continent = (Continent) o;

        if (!countryName.equals(continent.countryName)) return false;
        return countries.equals(continent.countries);
    }

    @Override
    public int hashCode() {
        int result = countryName.hashCode();
        result = 31 * result + countries.hashCode();
        return result;
    }
}
