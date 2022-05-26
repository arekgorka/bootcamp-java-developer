package com.kodilla.kodillagoodpatterns.food2door;

public class Product {

    private String kindOfProduct;
    private int amountOfProduct;

    public Product(final String kindOfProduct,final int amountOfProduct) {
        this.kindOfProduct = kindOfProduct;
        this.amountOfProduct = amountOfProduct;
    }

    public String getKindOfProduct() {
        return kindOfProduct;
    }

    public int getAmountOfProduct() {
        return amountOfProduct;
    }
}
