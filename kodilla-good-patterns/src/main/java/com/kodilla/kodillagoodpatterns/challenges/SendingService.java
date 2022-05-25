package com.kodilla.kodillagoodpatterns.challenges;

import java.time.LocalDate;

public interface SendingService {

    boolean send(User user, Product product, LocalDate dateOfOrder);
}
