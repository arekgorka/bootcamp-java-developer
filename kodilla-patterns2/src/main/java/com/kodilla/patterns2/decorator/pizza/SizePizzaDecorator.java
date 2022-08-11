package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.Objects;

public class SizePizzaDecorator extends AbstractPizzaOrderDecorator {

    private final String pizzaSize;

    public SizePizzaDecorator(PizzaOrder pizzaOrder, String pizzaSize) {
        super(pizzaOrder);
        this.pizzaSize = pizzaSize;
    }

    @Override
    public BigDecimal getCost() {
        if (pizzaSize.equals(PizzaSize.MEDIUM)) {
            return super.getCost().add(new BigDecimal(5.00));
        }
        if (pizzaSize.equals(PizzaSize.LARGE)) {
            return super.getCost().add(new BigDecimal(10.00));
        }
        if (pizzaSize.equals(PizzaSize.EXTRA_LARGE)) {
            return super.getCost().add(new BigDecimal(20.00));
        }
        return super.getCost().add(new BigDecimal(0.00));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "(" + pizzaSize + ") ";
    }
}
