package com.kodilla.testing.weather.stub;
import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {

        this.temperatures = temperatures;
    }


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
        for(Map.Entry<String, Double> mapSum : temperatures.getTemperatures().entrySet()) {
            sum += mapSum.getValue();
        }

        average = sum / temperatures.getTemperatures().size();
        return average;

    }

    public double getMedian() {

        List<Double> sortList = new ArrayList<>();

        for(Map.Entry<String, Double> mapSum : temperatures.getTemperatures().entrySet()) {
            sortList.add(mapSum.getValue());
        }
        Collections.sort(sortList);

        double median;
        int size = sortList.size();

        if(size%2 == 0) {
            median = (sortList.get(sortList.size()/2) + sortList.get((sortList.size()/2) -1))/2;

        } else {
            median = sortList.get(sortList.size()/2);
        }

        return median;

    }
}
