package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int resultAdd = calculator.add(40,27);

        if(resultAdd == 67) {
            System.out.println("Kalkulator dodaje poprawnie");
        } else  {
            System.out.println("Kalkulator jest wadliwy");
        }

        int resultSubstract = calculator.substract(60,44);

        if(resultSubstract == 16) {
            System.out.println("Kalkulator odejmuje poprawnie");
        } else  {
            System.out.println("Kalkulator jest wadliwy");
        }

    }
}

