package com.kodilla.kodillagoodpatterns.flightsearchengine;

import java.util.HashSet;
import java.util.Set;


public class SearcherFlightThrough implements Searcher {

    private final SearcherFlightFrom searcherFlightFrom;
    private final SearcherFlightTo searcherFlightTo;

    public SearcherFlightThrough(final SearcherFlightFrom searcherFlightFrom, final SearcherFlightTo searcherFlightTo) {
        this.searcherFlightFrom = searcherFlightFrom;
        this.searcherFlightTo = searcherFlightTo;
    }

    public void searchFlight(FlightList flightList) {
        Set<Flight> specialFlightList = new HashSet<>();
        String flightFrom;
        String flightTo;

        for (Flight flight: flightList.getFlightList()) {
            specialFlightList.add(flight);
            flightTo = flight.getFlightTo();
            for (Flight flight1: specialFlightList) {
                flightFrom = flight1.getFlightFrom();
                if (flightTo.equals(flightFrom) && flight.getFlightFrom().equals(searcherFlightFrom.getDesiredFlightFrom())
                && flight1.getFlightTo().equals(searcherFlightTo.getDesiredFlightTo())) {
                    System.out.println(searcherFlightFrom.getDesiredFlightFrom() + " ---> " + flightTo +
                            " ---> " + searcherFlightTo.getDesiredFlightTo());
                }
            }
        }
    }
}


