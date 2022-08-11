package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class AdditionalSauceDecorator extends AbstractPizzaOrderDecorator {
    private final String sauce;

    public AdditionalSauceDecorator(PizzaOrder pizzaOrder, String sauce) {
        super(pizzaOrder);
        this.sauce = sauce;
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(1.00));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "+ " + sauce;
    }
}
