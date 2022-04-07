package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost(){

        //GIVEN
        PizzaOrder theOrder = new BasicPizzaOrder();

        //WHEN
        BigDecimal calculatedCost = theOrder.getCost("M");

        //THEN
        assertEquals(new BigDecimal(20), calculatedCost);

    }

    @Test
    public void testBasicPizzaOrderGetDescription() {

        //GIVEN
        PizzaOrder theOrder = new BasicPizzaOrder();

        //WHEN
        String description = theOrder.getDescription("M");

        //THEN
        assertEquals("Size M: basic pizza - tomato sauce, cheese ", description);

    }

    @Test
    public void testWegetarianPizzaGetCost() {

        //GIVEN
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new MushroomsDecorator(pizzaOrder);
        pizzaOrder = new VegetablesDecorator(pizzaOrder);

        //WHEN
        BigDecimal theCost = pizzaOrder.getCost("S");

        //THEN
        assertEquals(new BigDecimal(25.00), theCost);

    }

    @Test
    public void testWegetarianPizzaGetDescription(){

        //GIVEN
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new MushroomsDecorator(pizzaOrder);
        pizzaOrder = new VegetablesDecorator(pizzaOrder);

        //WHEN
        String description = pizzaOrder.getDescription("S");

        //THEN
        assertEquals("Size S: basic pizza - tomato sauce, cheese , mushrooms , onion, pepper, zucchini ", description);

    }

    @Test
    public void testMegaPizzaGetCost() {

        //GIVEN
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ChickenDecorator(pizzaOrder);
        pizzaOrder = new HamDecorator(pizzaOrder);
        pizzaOrder = new HamDecorator(pizzaOrder);
        pizzaOrder = new MushroomsDecorator(pizzaOrder);
        pizzaOrder = new VegetablesDecorator(pizzaOrder);

        //WHEN
        BigDecimal theCost = pizzaOrder.getCost("L");

        //THEN
        assertEquals(new BigDecimal(49.00), theCost);

    }

    @Test
    public void testMegaPizzaGetDescription() {

        //GIVEN
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ChickenDecorator(pizzaOrder);
        pizzaOrder = new HamDecorator(pizzaOrder);
        pizzaOrder = new HamDecorator(pizzaOrder);
        pizzaOrder = new MushroomsDecorator(pizzaOrder);
        pizzaOrder = new VegetablesDecorator(pizzaOrder);

        //WHEN
        String description = pizzaOrder.getDescription("L");

        //THEN
        assertEquals("Size L: basic pizza - tomato sauce, cheese , chicken , ham , ham , mushrooms , onion, pepper, zucchini ", description);

    }

}
