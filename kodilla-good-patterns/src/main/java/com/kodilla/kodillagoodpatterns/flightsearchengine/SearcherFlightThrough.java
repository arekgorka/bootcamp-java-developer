package com.kodilla.kodillagoodpatterns.flightsearchengine;

import java.util.List;
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

        flightList.getFlightList().stream()
                .filter(flight -> flight.getFlightFrom().equals(searcherFlightFrom.getDesiredFlightFrom())
                        || flight.getFlightTo().equals(searcherFlightTo.getDesiredFlightTo()))
                .map(flight -> flight.getFlightFrom() + "--->" + flight.getFlightTo())
                .forEach(System.out::println);
    }
}


