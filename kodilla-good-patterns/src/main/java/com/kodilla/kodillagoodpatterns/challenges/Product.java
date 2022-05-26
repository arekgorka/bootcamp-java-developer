package com.kodilla.kodillagoodpatterns.challenges;

public class Product {

    private String productName;
    private double price;

    public Product(final String productName, final double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}
