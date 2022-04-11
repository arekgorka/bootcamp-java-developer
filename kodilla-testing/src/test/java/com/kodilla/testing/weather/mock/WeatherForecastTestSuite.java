package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {                                              // [7]

    @Mock
    private Temperatures temperaturesMock;

    @BeforeEach
    void beforeEach() {
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
    }

    @Test
    void testCalculateForecastWithMock() {                                     // [9]
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();     // [12]

        //Then
        Assertions.assertEquals(5, quantityOfSensors);                          // [13]
    }                                                                          // [14]

    @Test
    void testCalculateMean() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double meanWeather = weatherForecast.calculateMean();
        double meanTemperaturesMap = 0;
        for(Map.Entry<String, Double> meanForTemperatureMap: temperaturesMock.getTemperatures().entrySet()) {
            meanTemperaturesMap += meanForTemperatureMap.getValue();
        }
        meanTemperaturesMap /= temperaturesMock.getTemperatures().size();

        //Then
        System.out.println(meanWeather);
        Assertions.assertEquals(meanTemperaturesMap,meanWeather);
    }

    @Test
    void testCalculateMedian() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double medianWeather = weatherForecast.calculateMedian();
        //Then

        Assertions.assertEquals(25.5,medianWeather);

    }
}