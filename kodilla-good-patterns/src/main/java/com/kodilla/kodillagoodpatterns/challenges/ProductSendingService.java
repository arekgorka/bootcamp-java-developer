package com.kodilla.kodillagoodpatterns.challenges;

import java.time.LocalDate;

public class ProductSendingService implements SendingService {

    public boolean send(User user, Product product, LocalDate dateOfOrder) {
        System.out.println("We are sending your order: \n " +
                "User: " + user.name + ", " + user.nick + ", " + user.mail + "\n" +
                "Order: " + product.productName + " - " + product.price + "$. \n" +
                "Date of order: " + dateOfOrder.toString());
        return true;
    }
}
