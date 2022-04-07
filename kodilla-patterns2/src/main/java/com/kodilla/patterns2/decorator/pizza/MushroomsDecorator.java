package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class MushroomsDecorator extends AbstractPizzaOrderDecorator {
    public MushroomsDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost(String size) {
        return super.getCost(size).add(new BigDecimal(2.00));
    }

    @Override
    public String getDescription(String size){
        return super.getDescription(size) + ", mushrooms ";
    }
}
