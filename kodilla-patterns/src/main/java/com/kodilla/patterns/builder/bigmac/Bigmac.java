package com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.builder.pizza.Pizza;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {
    private final Bun bun;
    private final Burgers burgers;
    private final Sauce sauce;
    private List<String> ingredients = new ArrayList<>();

    public static class BigmacBuilder {
        private Bun bun;
        private Burgers burgers;
        private Sauce sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(Bun bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder burgers(Burgers burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(Sauce sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredient(Ingredients ingredient) {
            ingredients.add(ingredient.getIngredient());
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun,burgers,sauce,ingredients);
        }

    }

    public Bigmac(final Bun bun,final Burgers burgers,final Sauce sauce,final List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public Bun getBun() {
        return bun;
    }

    public Burgers getBurgers() {
        return burgers;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers='" + burgers + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
