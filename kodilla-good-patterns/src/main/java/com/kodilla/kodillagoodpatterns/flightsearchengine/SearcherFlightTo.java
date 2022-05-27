package com.kodilla.kodillagoodpatterns.flightsearchengine;

import java.util.List;
import java.util.stream.Collectors;

public class SearcherFlightTo implements Searcher {

    private final String desiredFlightTo;

    public SearcherFlightTo(final String desiredFlightTo) {
        this.desiredFlightTo = desiredFlightTo;
    }

    public String getDesiredFlightTo() {
        return desiredFlightTo;
    }

    public void searchFlight(FlightList flightList) {
        flightList.getFlightList().stream()
                .filter(flight -> flight.getFlightTo().equals(desiredFlightTo))
                .map(flight -> flight.getFlightFrom() + "--->" + flight.getFlightTo())
                .forEach(System.out::println);
    }
}
