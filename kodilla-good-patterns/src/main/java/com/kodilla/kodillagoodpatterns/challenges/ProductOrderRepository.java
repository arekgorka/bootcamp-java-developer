package com.kodilla.kodillagoodpatterns.challenges;

public class ProductOrderRepository implements OrderRepository {

    public boolean createOrder(User user, Product product) {
        System.out.println("Create new order in repository");
        return true;
    }
}
