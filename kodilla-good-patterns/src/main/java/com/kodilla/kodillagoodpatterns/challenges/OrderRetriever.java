package com.kodilla.kodillagoodpatterns.challenges;

import java.time.LocalDate;

public class OrderRetriever {

    public Order retrieve() {

        User user = new User("Jack","$Jack89","jack89@gmail.com");
        Product product = new Product("Guitar", 1899.99);
        LocalDate dayOfOrderProduct = LocalDate.of(2022,5,12);

        return new Order(user, product, dayOfOrderProduct);
    }
}
