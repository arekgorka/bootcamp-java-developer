package com.kodilla.kodillagoodpatterns.flightsearchengine;

public class Flight {

    private String flightFrom;
    private String flightTo;

    public Flight(String flightFrom, String flightTo) {
        this.flightFrom = flightFrom;
        this.flightTo = flightTo;
    }

    public String getFlightFrom() {
        return flightFrom;
    }

    public String getFlightTo() {
        return flightTo;
    }
}
