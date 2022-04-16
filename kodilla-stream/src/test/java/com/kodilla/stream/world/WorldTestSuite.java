package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {

        //When
        Country poland = new Country("Poland",new BigDecimal(38254697));
        Country germany = new Country("Germany", new BigDecimal(82394456));
        Country uk = new Country("United Kingdom",new BigDecimal(86543254));
        Country japan = new Country("Japan", new BigDecimal(156345221));
        Country china = new Country("China", new BigDecimal(1200300400));
        Country indie = new Country("Indie",new BigDecimal(1120345234));
        Country egypt = new Country("Egypt", new BigDecimal(15200233));
        Country rpa = new Country("RPA",new BigDecimal(59403845));
        Country kongo = new Country("Kongo", new BigDecimal(113452345));
        Continent europe = new Continent("Europa");
        Continent asia = new Continent("Asia");
        Continent africa = new Continent("Africa");
        World earth = new World();

        //When
        europe.addCountryToContinent(poland);
        europe.addCountryToContinent(germany);
        europe.addCountryToContinent(uk);
        asia.addCountryToContinent(japan);
        asia.addCountryToContinent(china);
        asia.addCountryToContinent(indie);
        africa.addCountryToContinent(egypt);
        africa.addCountryToContinent(rpa);
        africa.addCountryToContinent(kongo);
        earth.addContinent(europe);
        earth.addContinent(asia);
        earth.addContinent(africa);

        //Then
        BigDecimal expectedQuantityPeopleOnEarth = new BigDecimal("2872239685");
        assertEquals(expectedQuantityPeopleOnEarth,earth.getPeopleQuantity());
    }
}
