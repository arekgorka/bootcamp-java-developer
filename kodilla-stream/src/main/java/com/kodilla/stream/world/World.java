package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {


    public World() {
    }

    private final List<Continent> listOfContinent = new ArrayList<>();

    public void addContinent(Continent continent) {
        listOfContinent.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        return listOfContinent.stream()
                .flatMap(country -> country.getCountry().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum,current) -> sum = sum.add(current));
    }
}
