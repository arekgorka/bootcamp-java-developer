package com.kodilla.stream.world;

import com.kodilla.stream.forum.ForumUser;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Continent {

    private final String nameContinent;
    private final List<Country> countryListOfContinent = new ArrayList<>();

    public Continent(String nameContinent) {
        this.nameContinent = nameContinent;
    }

    public void addCountryToContinent(Country country) {
        countryListOfContinent.add(country);
    }

    public List<Country> getCountry() {
        return countryListOfContinent;
    }

    public List<BigDecimal> getCountryListOfContinent() {
        return countryListOfContinent.stream()
                .map(Country::getPeopleQuantity)
                .collect(Collectors.toList());
    }
}
