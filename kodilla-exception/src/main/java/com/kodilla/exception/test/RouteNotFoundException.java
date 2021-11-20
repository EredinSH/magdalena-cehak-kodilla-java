package com.kodilla.exception.test;

import java.util.stream.Stream;

public class RouteNotFoundException extends Exception {

    public RouteNotFoundException(String message) {
        super(message);
    }

}
