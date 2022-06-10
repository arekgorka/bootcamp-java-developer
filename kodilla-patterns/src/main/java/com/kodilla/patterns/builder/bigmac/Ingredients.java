package com.kodilla.patterns.builder.bigmac;

public class Ingredients {

    public static final String SALAD = "salad";
    public static final String ONION = "onion";
    public static final String BEACON = "beacon";
    public static final String PICKLES = "pickles";
    public static final String CHILLIPEPPERS = "chilli peppers";
    public static final String MUSHROOMS = "mushrooms";
    public static final String PRAWNS = "prawns";
    public static final String CHEESE = "cheese";
    private String ingredient;

    public Ingredients (String ingredient) {
        switch (ingredient) {
            case SALAD:
                this.ingredient = SALAD;
                break;
            case ONION:
                this.ingredient = ONION;
                break;
            case BEACON:
                this.ingredient = BEACON;
                break;
            case PICKLES:
                this.ingredient = PICKLES;
                break;
            case CHILLIPEPPERS:
                this.ingredient = CHILLIPEPPERS;
                break;
            case MUSHROOMS:
                this.ingredient = MUSHROOMS;
                break;
            case PRAWNS:
                this.ingredient = PRAWNS;
                break;
            case CHEESE:
                this.ingredient = CHEESE;
                break;
            default:
                System.out.println("We don't have " + ingredient + ". Please choose other ingredient.");
        }
    }

    public String getIngredient() {
        return ingredient;
    }

    public String toString() {
        return ingredient;
    }
}
