package com.kodilla.rps;

import java.util.Scanner;

public class UserDialogs {
    public static String getUserName() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Welcome! Enter your name: ");
            String name = scanner.nextLine();
            if(name.trim().length() < 3) {
                System.out.println("Are you sure it's your name? It`s really short, try again");
            } else {
                return name;
            }
        }

    }

    public static int getNumberOfRounds() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("How many rounds you want to bet: ");
            String number = scanner.nextLine();
            try{
                int i = Integer.parseInt(number);
                if (i >= 1 && i<=6) {
                    return i;
                } else {
                    System.out.println("Number of rounds can be between 1 and 6");
                }
            } catch (Exception e){
            System.out.println("Wrong number, try again!");
        }
        }

    }

    public static UserSelection getUserSelection() {

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Enter your move - (R)ock, (P)apper, (S)cissors, (X) to quit the game or (N) to start game again ");
            String move = scanner.nextLine().trim().toUpperCase();
            switch (move) {
                case "R":
                    return UserSelection.ROCK;
                case "P":
                    return UserSelection.PAPER;
                case "S":
                    return UserSelection.SCISSORS;
                case "X":
                    return UserSelection.QUIT;
                case "N":
                    return UserSelection.NEW_GAME;
                default:
                    System.out.println("Wrong value! Try again!");

            }
        }

    }

    public static void showPartialResult(int round, int howManyRounds, UserSelection userSelection, UserSelection computerSelection, Winner winner, int humanScore, int computerScore) {

        System.out.println("Round: " + round + " of " + howManyRounds);
        System.out.println("Computer selected: " + computerSelection);
        System.out.println("Human selected: " + userSelection);
        System.out.println("Winner: " + winner);
        System.out.println("Human score: " + humanScore);
        System.out.println("Computer score: " + computerScore);
        System.out.println("-----------------------------------------------");


    }

    public static void showFinalResult(int computerScore, int humanScore) {
        System.out.println("Computer score = " + computerScore);
        System.out.println("Human score = " + humanScore);
        System.out.println("===============================================");
        System.out.println("The final winner is: ");
        if(computerScore > humanScore) {
            System.out.println("COMPUTER");
        } else if (computerScore < humanScore) {
            System.out.println("HUMAN");
        } else {
            System.out.println("IT'S A DRAW");
        }
        System.out.println("===============================================");
    }
}
