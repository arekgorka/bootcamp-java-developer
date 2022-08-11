package com.kodilla.patterns2.decorator.pizza;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    public PizzaSauce pizzaSauce;
    public PizzaIngredients pizzaIngredients;
    public PizzaSize pizzaSize;

    @Test
    public void testPizzaWithAdditionalIngredientsDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new AdditionalIngredientDecorator(pizzaOrder,pizzaIngredients.MUSHROOMS);
        //When
        String description = pizzaOrder.getDescription();
        System.out.println(description);
        //Then
        assertEquals("Margherita + mushrooms ", description);
    }

    @Test
    public void testPizzaWithAdditionalIngredientsCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new AdditionalIngredientDecorator(pizzaOrder,pizzaIngredients.MUSHROOMS);
        //When
        BigDecimal cost = pizzaOrder.getCost();
        System.out.println(cost);
        //Then
        assertEquals(new BigDecimal(18), cost);
    }

    @Test
    public void testPizzaXLWithAdditionalIngredientsDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new SizePizzaDecorator(pizzaOrder,pizzaSize.EXTRA_LARGE);
        pizzaOrder = new AdditionalIngredientDecorator(pizzaOrder,pizzaIngredients.MUSHROOMS);
        //When
        String description = pizzaOrder.getDescription();
        System.out.println(description);
        //Then
        assertEquals("Margherita (XL) + mushrooms ", description);
    }

    @Test
    public void testPizzaXLWithAdditionalIngredientsCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new SizePizzaDecorator(pizzaOrder,pizzaSize.EXTRA_LARGE);
        pizzaOrder = new AdditionalIngredientDecorator(pizzaOrder,pizzaIngredients.MUSHROOMS);
        //When
        BigDecimal cost = pizzaOrder.getCost();
        System.out.println(cost);
        //Then
        assertEquals(new BigDecimal(38), cost);
    }

    @Test
    public void testPizzaSWithAdditionalIngredientsCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new SizePizzaDecorator(pizzaOrder,pizzaSize.SMALL);
        pizzaOrder = new AdditionalIngredientDecorator(pizzaOrder,pizzaIngredients.MUSHROOMS);
        //When
        BigDecimal cost = pizzaOrder.getCost();
        System.out.println(cost);
        //Then
        assertEquals(new BigDecimal(18), cost);
    }

    @Test
    public void testPizzaXLWithAdditionalIngredientsAndSauceDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new SizePizzaDecorator(pizzaOrder,pizzaSize.EXTRA_LARGE);
        pizzaOrder = new AdditionalIngredientDecorator(pizzaOrder,pizzaIngredients.MUSHROOMS);
        pizzaOrder = new AdditionalIngredientDecorator(pizzaOrder,pizzaIngredients.DOUBLE_CHEESE);
        pizzaOrder = new AdditionalIngredientDecorator(pizzaOrder,pizzaIngredients.HAM);
        pizzaOrder = new AdditionalIngredientDecorator(pizzaOrder,pizzaIngredients.PEPPERS);
        pizzaOrder = new AdditionalIngredientDecorator(pizzaOrder,pizzaIngredients.OLIVES);
        pizzaOrder = new AdditionalSauceDecorator(pizzaOrder,pizzaSauce.GARLIC);
        pizzaOrder = new AdditionalSauceDecorator(pizzaOrder,pizzaSauce.THOUSAND_ISLAND);
        //When
        String description = pizzaOrder.getDescription();
        System.out.println(description);
        //Then
        assertEquals("Margherita (XL) + mushrooms + double cheese + ham + peppers + olives + garlic sauce + 1000 island sauce ", description);
    }

    @Test
    public void testPizzaXLWithAdditionalIngredientsAndSauceCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new SizePizzaDecorator(pizzaOrder,pizzaSize.EXTRA_LARGE);
        pizzaOrder = new AdditionalIngredientDecorator(pizzaOrder,pizzaIngredients.MUSHROOMS);
        pizzaOrder = new AdditionalIngredientDecorator(pizzaOrder,pizzaIngredients.DOUBLE_CHEESE);
        pizzaOrder = new AdditionalIngredientDecorator(pizzaOrder,pizzaIngredients.HAM);
        pizzaOrder = new AdditionalIngredientDecorator(pizzaOrder,pizzaIngredients.PEPPERS);
        pizzaOrder = new AdditionalIngredientDecorator(pizzaOrder,pizzaIngredients.OLIVES);
        pizzaOrder = new AdditionalSauceDecorator(pizzaOrder,pizzaSauce.GARLIC);
        pizzaOrder = new AdditionalSauceDecorator(pizzaOrder,pizzaSauce.THOUSAND_ISLAND);
        //When
        BigDecimal cost = pizzaOrder.getCost();
        System.out.println(cost);
        //Then
        assertEquals(new BigDecimal(52), cost);
    }

}
