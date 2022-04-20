package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public Map<String,Boolean> findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Warsaw", true);
        flightMap.put("Berlin", false);
        flightMap.put("Paris", true);
        flightMap.put("Odessa", false);

            if (flightMap.containsKey(flight.getDepartureAirport())){
                System.out.println("Flight to " + flight.getDepartureAirport() + " is available");
            } else {
                throw new RouteNotFoundException();
            }
        return flightMap;
    }
}
