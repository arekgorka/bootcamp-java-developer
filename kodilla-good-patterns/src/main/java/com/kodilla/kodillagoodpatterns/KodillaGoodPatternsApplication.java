package com.kodilla.kodillagoodpatterns;

import com.kodilla.kodillagoodpatterns.challenges.MovieStore;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@SpringBootApplication
public class KodillaGoodPatternsApplication {

    public static void main(String[] args) {
        SpringApplication.run(KodillaGoodPatternsApplication.class, args);

    MovieStore movieStore = new MovieStore();

    String listofMap = movieStore.getMovies().entrySet().stream()
            .flatMap(stringListEntry -> stringListEntry.getValue().stream())
            .collect(Collectors.joining("!","",""));

        System.out.println(listofMap);
    }

}
