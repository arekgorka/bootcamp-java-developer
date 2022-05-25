package com.kodilla.kodillagoodpatterns.challenges;


import java.time.LocalDate;

public class Order {

    private User user;
    private Product product;
    private LocalDate dayOfOrder;

    public Order(final User user, final Product product, final LocalDate dayOfOrder) {
        this.user = user;
        this.product = product;
        this.dayOfOrder = dayOfOrder;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDate getDayOfOrder() {
        return dayOfOrder;
    }
}
