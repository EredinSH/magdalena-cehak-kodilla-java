package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizzaOrder implements PizzaOrder {
    
    @Override
    public BigDecimal getCost(String size) {
        BigDecimal cost = new BigDecimal(0);
        if (size == "S") {
            cost = new BigDecimal(15.00);
        }
        if (size == "M") {
            cost = new BigDecimal(20.00);
        } if (size == "L") {
            cost = new BigDecimal(25.00);
        }
        return cost;
    }
    
    @Override
    public String getDescription(String size) {
        String description = "basic pizza - tomato sauce, cheese ";
        String choosenSize = null;
        if (size == "S") {
            choosenSize = "Size S: ";
        }
        if (size == "M") {
            choosenSize = "Size M: ";
        } if (size == "L") {
            choosenSize = "Size L: ";
        }
        return choosenSize + description;
    }
    
}
