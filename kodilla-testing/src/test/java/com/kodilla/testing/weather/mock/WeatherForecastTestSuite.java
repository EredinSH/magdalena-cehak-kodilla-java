package com.kodilla.testing.weather.mock;
import com.kodilla.testing.weather.stub.Temperatures;                            // [2]
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;                                         // [4]
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;                                               // [5]
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;                                                        // [6]
import java.util.Map;                                                            // [7]

import static org.mockito.Mockito.mock;                                          // [8]
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {
    @Mock
    private Temperatures temperaturesMock;

    @BeforeEach
    public void before() {
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

    }

    @Test
    void testCalculateForecastWithMock() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testGetAverage() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        weatherForecast.calculateForecast();

        //When

        double result = weatherForecast.getAverage();

        //Then
        Assertions.assertEquals(25.56 , result);

    }

    @Test
    void testGetMedian() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        weatherForecast.calculateForecast();

        //When
        double result = weatherForecast.getMedian();

        //Then
        Assertions.assertEquals(25.5, result);

    }
}
