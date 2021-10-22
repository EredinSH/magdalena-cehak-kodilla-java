package com.kodilla.testing.weather.stub;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    Map<String, Double> resultMap = new HashMap<>();

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double getAverage() {
        double sum = 0;
        double average = 0;
        for(Map.Entry<String, Double> mapSum : resultMap.entrySet()) {
            sum += mapSum.getValue();

        }

        average = sum / resultMap.size();
        return average;

    }

    public double getMedian() {

        double median;
        int size = resultMap.size();

        if(size%2 == 0) {
            median = (resultMap.get(resultMap.size()/2) + resultMap.get((resultMap.size()/2) -1))/2;

        } else {
            median = resultMap.get(resultMap.size()/2);
        }

        return median;

    }
}
