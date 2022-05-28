package com.kodilla.kodillagoodpatterns.flightsearchengine;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SearcherFlightThrough implements Searcher {

    //private String desiredFlightThrough;
    private final SearcherFlightFrom searcherFlightFrom;
    private final SearcherFlightTo searcherFlightTo;

    public SearcherFlightThrough(/*String desiredFlightThrough,*/ final SearcherFlightFrom searcherFlightFrom, final SearcherFlightTo searcherFlightTo) {
        //this.desiredFlightThrough = desiredFlightThrough;
        this.searcherFlightFrom = searcherFlightFrom;
        this.searcherFlightTo = searcherFlightTo;
    }

    public void searchFlight(FlightList flightList) {
        Set<Flight> specialFlightList = new HashSet<>();
        String flightFrom = "";
        String flightTo = "";

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


