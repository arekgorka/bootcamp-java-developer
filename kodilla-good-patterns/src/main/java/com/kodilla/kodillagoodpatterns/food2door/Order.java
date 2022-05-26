package com.kodilla.kodillagoodpatterns.food2door;

public class Order {

    private Producer producer;
    private Product product;

    public Order(final Producer producer,final Product product) {
        this.producer = producer;
        this.product = product;
    }

    public Producer getProducer() {
        return producer;
    }

    public Product getProduct() {
        return product;
    }
}
