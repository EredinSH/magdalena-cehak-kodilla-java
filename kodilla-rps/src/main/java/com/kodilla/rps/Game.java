package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Game {

    private int playerMove;
    private int computerMove;
    private int computerCounter = 0;
    private int playerCounter = 0;

    public void computerMove() {
        Random random = new Random();
        int number = random.nextInt(4);
        computerMove = number;
        if (computerMove == 1) {
            System.out.println("Computer move: ROCK");
        } else if (computerMove == 2) {
            System.out.println("Computer move: PAPER");
        } else if (computerMove == 3) {
            System.out.println("Computer move: SCISSORS");
        }

    }

    public void playerMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your move: ");
        playerMove = scanner.nextInt();
        if (playerMove == 1) {
            System.out.println("Your move: ROCK");
        } else if (playerMove == 2) {
            System.out.println("Your move: PAPER");
        } else if (playerMove == 3) {
            System.out.println("Your move: SCISSORS");
        } else {
            System.out.println("Choose number 1 to 3!");
        }
    }

    public String getWinner() {
        String result = null;
        if (playerMove == computerMove) {
            result = "REMIS!";
        } else if (playerMove == 1 && computerMove == 2) {
            result = "COMPUTER WIN!";
        } else if (playerMove == 2 && computerMove == 1) {
            result = "PLAYER WIN!";
        } else if (playerMove == 1 && computerMove == 3) {
            result = "PLAYER WIN!";
        } else if (playerMove == 3 && computerMove == 1) {
            result = "COMPUTER WIN!";
        } else if (playerMove == 2 && computerMove == 3) {
            result = "COMPUTER WIN!";
        } else if (playerMove == 3 && computerMove == 2) {
            result = "PLAYER WIN!";
        }
        return result;
    }

    public String getWinnerOfTheDuels() {
        if (getWinner().equals("PLAYER WIN!")) {
            playerCounter++;
        } else if (getWinner().equals("COMPUTER WIN!")) {
            computerCounter++;
        }

        String winner;

        if (computerCounter > playerCounter) {
            winner = "COMPUTER WON THE DUEL";
        } else {
            winner = "PLAYER WON THE DUEL";
        }

        return winner;
    }

}
