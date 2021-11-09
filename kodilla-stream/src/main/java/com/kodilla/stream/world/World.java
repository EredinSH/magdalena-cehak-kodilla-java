package com.kodilla.stream.world;


import java.util.HashSet;
import java.util.Set;

public final class World {

    private final String continentName;
    private final Set<World> continents = new HashSet<>();

    public World(String continentName) {
        this.continentName = continentName;
    }

    World continent1 = new World("Africa");
    World continent2 = new World("Asia");
    World continent3 = new World("North America");
    World continent4 = new World("North America");
    World continent5 = new World("South America");
    World continent6 = new World("Antarctica");
    World continent7 = new World("Europe");

    public void addCountry(World country) {
        continents.add(country);
    }

    public String getContinentName() {
        return continentName;
    }

    public Set<World> getContinents() {
        return new HashSet<>(continents);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        World world = (World) o;

        if (!continentName.equals(world.continentName)) return false;
        return continents.equals(world.continents);
    }

    @Override
    public int hashCode() {
        int result = continentName.hashCode();
        result = 31 * result + continents.hashCode();
        return result;
    }


}
