package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BigmacTestSuite {

    @Test
    void testPossibleBigmac1Builder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(new Bun("With sezam"))
                .burgers(new Burgers(2))
                .sauce(new Sauce("standard"))
                .ingredient(new Ingredients("onion"))
                .ingredient(new Ingredients("mushrooms"))
                .ingredient(new Ingredients("cheese"))
                .ingredient(new Ingredients("beacon"))
                .build();
        System.out.println(bigmac);
        System.out.println(" ");
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        assertEquals("With sezam", bigmac.getBun().getBun());
        assertEquals(2,bigmac.getBurgers().getBurgers());
        assertEquals("standard", bigmac.getSauce().getSauce());
        assertEquals(4, howManyIngredients);

    }

    @Test
    void testImpossibleBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(new Bun("toast"))
                .burgers(new Burgers(15))
                .sauce(new Sauce("dunski"))
                .ingredient(new Ingredients("onion"))
                .ingredient(new Ingredients("mushrooms"))
                .ingredient(new Ingredients("cheese"))
                .ingredient(new Ingredients("tomato"))
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        assertNull(bigmac.getBun().getBun());
        assertEquals(0,bigmac.getBurgers().getBurgers());
        assertNull(bigmac.getSauce().getSauce());
        assertNull(bigmac.getIngredients().get(3));
        assertEquals(4, howManyIngredients);
    }

}
