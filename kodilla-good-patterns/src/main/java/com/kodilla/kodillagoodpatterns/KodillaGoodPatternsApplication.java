package com.kodilla.kodillagoodpatterns;

import com.kodilla.kodillagoodpatterns.challenges.*;
import com.kodilla.kodillagoodpatterns.flightsearchengine.*;
import com.kodilla.kodillagoodpatterns.food2door.*;
import com.kodilla.kodillagoodpatterns.food2door.Order;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@SpringBootApplication
public class KodillaGoodPatternsApplication {
    public static void main(String[] args) {
        SpringApplication.run(KodillaGoodPatternsApplication.class, args);

        SearcherFlightFrom searcherFlightFrom = new SearcherFlightFrom("Warszawa");
        searcherFlightFrom.searchFlight(new FlightList());
        System.out.println("");

        SearcherFlightTo searcherFlightTo = new SearcherFlightTo("Gdańsk");
        searcherFlightTo.searchFlight(new FlightList());
        System.out.println("");

        SearcherFlightThrough searcherFlightThrough = new SearcherFlightThrough(
                new SearcherFlightFrom("Kraków"),new SearcherFlightTo("Szczecin"));
        searcherFlightThrough.searchFlight(new FlightList());
    }
}

/*
13.4
public static void main(String[] args) {
        SpringApplication.run(KodillaGoodPatternsApplication.class, args);

        ExtraFoodShop extraFoodShop = new ExtraFoodShop(new FoodInformationService());
        HealthyShop healthyShop = new HealthyShop(new FoodInformationService());
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop(new FoodInformationService());

        extraFoodShop.processOrder();
        System.out.println("");
        healthyShop.processOrder();
        System.out.println("");
        glutenFreeShop.processOrder();
    }*/

/*
13.2
public class KodillaGoodPatternsApplication {

    public static void main(String[] args) {
        SpringApplication.run(KodillaGoodPatternsApplication.class, args);

        OrderRetriever orderRetriever = new OrderRetriever();
        Order order = orderRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(
                new OrderInformationService(), new ProductSendingService(), new ProductOrderRepository());

        productOrderService.process(order);
    }

}*/


    /*
    13.1
    MovieStore movieStore = new MovieStore();

    String listofMap = movieStore.getMovies().entrySet().stream()
            .flatMap(stringListEntry -> stringListEntry.getValue().stream())
            .collect(Collectors.joining("!","",""));

        System.out.println(listofMap);*/