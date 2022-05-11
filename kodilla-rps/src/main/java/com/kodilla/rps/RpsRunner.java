package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) {

        System.out.println("In our game we follow the rules: ");
        System.out.println("To play ROCK press 1");
        System.out.println("To play PAPER press 2");
        System.out.println("To play SCISSORS press 3");
        System.out.println("To end the game press x");
        System.out.println("To start the game over again press n");

        System.out.println("LETS START THE GAME!");

        Game game = new Game();
        game.play();
    }

}
