package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    public void testBigmacNew() {
        //GIVEN
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("bun with sesame")
                .burgers(2)
                .sauce("barbecue")
                .ingredient("onion")
                .ingredient("beckon")
                .ingredient("cheese")
                .ingredient("salads")
                .build();
        System.out.println(bigmac);

        //WHEN
        int ingredients = bigmac.getIngredients().size();

        //THEN
        assertEquals(4, ingredients);

    }

}
