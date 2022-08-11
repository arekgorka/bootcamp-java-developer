package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class AdditionalIngredientDecorator extends AbstractPizzaOrderDecorator {
    private final String ingredient;

    public AdditionalIngredientDecorator(PizzaOrder pizzaOrder, String ingredient) {
        super(pizzaOrder);
        this.ingredient = ingredient;
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3.00));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "+ " + ingredient;
    }
}
