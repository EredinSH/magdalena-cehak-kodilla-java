package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //GIVEN
        World world = new World();

        Continent europa = new Continent("Europa");
        Continent asia = new Continent("Asia");

        Country poland = new Country("Poland",new BigDecimal("35000000"));
        Country portugal  = new Country("Portugal",new BigDecimal("10000000"));
        Country italy = new Country("Italy",new BigDecimal("15000000"));
        Country japan = new Country("Japan",new BigDecimal("50000000"));
        Country taiwan = new Country("Taiwan",new BigDecimal("80000000"));
        Country china = new Country("China",new BigDecimal("130000000"));

        world.addContinent(europa);
        world.addContinent(asia);

        europa.addCountry(poland);
        europa.addCountry(portugal);
        europa.addCountry(italy);

        asia.addCountry(japan);
        asia.addCountry(taiwan);
        asia.addCountry(china);

        //WHEN
        BigDecimal population = world.getPeopleQuantity();

        //THEN
        BigDecimal populationExpected = new BigDecimal("320000000");
        assertEquals(populationExpected, population);

    }

}
