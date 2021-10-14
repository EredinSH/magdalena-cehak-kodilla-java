package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int result;

        result = calculator.add(40,25);

        System.out.println(result);

        result = calculator.substract(60,37);

        System.out.println(result);
    }
}

