package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(10,1.5);
        } catch (Exception e) {
            System.out.println("Wystąpił błąd: " + e);
        } finally {
            System.out.println("To zadanie jest dziwne");
        }
    }

}
