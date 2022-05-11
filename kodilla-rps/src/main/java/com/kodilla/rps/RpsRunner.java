package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) {

        boolean end = false;
        int numberOfRounds;
        Game game = new Game();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! Give your name. ");
        String name = scanner.nextLine();
        System.out.println(name + " How many duels do you want to fight?");
        numberOfRounds = Integer.parseInt(scanner.nextLine());

        System.out.println("In our game we follow the rules: ");
        System.out.println("To play ROCK press 1");
        System.out.println("To play PAPER press 2");
        System.out.println("To play SCISSORS press 3");
        System.out.println("To end the game press x");
        System.out.println("To start the game over again press n");

        System.out.println("LETS START THE GAME!");

        if (numberOfRounds > 0) {
            while (!end) {
                if (scanner.hasNextInt() && !scanner.next().equals("n") && !scanner.next().equals("x")) {
                    game.playerMove();
                    game.computerMove();
                    game.getWinner();
                    numberOfRounds--;
                } else if (scanner.hasNextInt() && scanner.next().equals("x")) {
                    System.out.println("Are you sure you want end the game? Yes or No?");
                    String answer = scanner.nextLine();
                    if (answer == "yes") {
                        end = true;
                    }
                } else if (scanner.hasNextInt() && scanner.next().equals("n")) {
                    System.out.println("Are you sure you want start from the beginning? Yes or No?");
                    String answer = scanner.nextLine();
                    if (answer == "yes") {
                        end = true;
                    }
                } else {
                    game.getWinnerOfTheDuels();
                }
            }
        } else {
            System.out.println("END OF THE GAME!");
        }
    }

}
