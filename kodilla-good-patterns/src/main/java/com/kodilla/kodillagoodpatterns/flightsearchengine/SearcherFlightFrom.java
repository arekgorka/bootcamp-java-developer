package com.kodilla.kodillagoodpatterns.flightsearchengine;

import java.util.List;
import java.util.stream.Collectors;

public class SearcherFlightFrom  implements Searcher {

    private final String desiredFlightFrom;

    public SearcherFlightFrom(final String desiredFlightFrom) {
        this.desiredFlightFrom = desiredFlightFrom;
    }

    public String getDesiredFlightFrom() {
        return desiredFlightFrom;
    }

    public void searchFlight(FlightList flightList) {
        flightList.getFlightList().stream()
                .filter(flight -> flight.getFlightFrom().equals(desiredFlightFrom))
                .map(flight -> flight.getFlightFrom() + "--->" + flight.getFlightTo())
                .forEach(System.out::println);
    }
}
