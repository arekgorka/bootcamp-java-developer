package com.kodilla.exception.test;

public class FlightFinderRunner {

    public static void main (String[] args) {

    FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.findFlight(new Flight("Frankfurt","New York"));
        } catch (RouteNotFoundException e) {
            System.out.println("We don't have that flight");
        } finally {
            System.out.println("Goodbay!");
        }
    }
}
