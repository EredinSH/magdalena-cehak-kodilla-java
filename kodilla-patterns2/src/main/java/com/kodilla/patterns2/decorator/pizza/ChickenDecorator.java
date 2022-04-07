package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ChickenDecorator extends AbstractPizzaOrderDecorator {
    public ChickenDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost(String size) {
        return super.getCost(size).add(new BigDecimal(6.00));
    }

    @Override
    public String getDescription(String size){
        return super.getDescription(size) + ", chicken ";
    }
}
