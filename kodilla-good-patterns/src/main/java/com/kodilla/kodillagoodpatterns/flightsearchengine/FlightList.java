package com.kodilla.kodillagoodpatterns.flightsearchengine;

import java.util.HashSet;
import java.util.Set;

public class FlightList {

    private final Set<Flight> flightList = new HashSet<>();

    public Set<Flight> getFlightList() {
        flightList.add(new Flight("Gdańsk","Warszawa"));
        flightList.add(new Flight("Gdańsk","Wrocław"));
        flightList.add(new Flight("Gdańsk","Kraków"));
        flightList.add(new Flight("Gdańsk","Szczecin"));
        flightList.add(new Flight("Warszawa","Radom"));
        flightList.add(new Flight("Warszawa","Lódź"));
        flightList.add(new Flight("Warszawa","Kraków"));
        flightList.add(new Flight("Warszawa","Gdańsk"));
        flightList.add(new Flight("Warszawa","Wrocław"));
        flightList.add(new Flight("Warszawa","Szczecin"));
        flightList.add(new Flight("Kraków","Gdańsk"));
        flightList.add(new Flight("Kraków","Warszawa"));
        flightList.add(new Flight("Kraków","Wrocław"));
        flightList.add(new Flight("Radom","Warszawa"));
        flightList.add(new Flight("Lódź","Warszawa"));
        flightList.add(new Flight("Wrocław","Gdańsk"));
        flightList.add(new Flight("Wrocław","Warszawa"));
        flightList.add(new Flight("Wrocław","Kraków"));
        flightList.add(new Flight("Szczecin","Gdańsk"));
        flightList.add(new Flight("Szczecin","Warszawa"));
        return flightList;
    }
}
