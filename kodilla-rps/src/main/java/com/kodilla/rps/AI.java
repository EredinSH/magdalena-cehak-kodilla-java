package com.kodilla.rps;

import java.util.Random;

public class AI {
    public static UserSelection getComputerSelection() {

        Random random = new Random();
        int n = random.nextInt(100);
        if(n < 25){
            return UserSelection.ROCK;
        } else if (n < 70) {
            return UserSelection.PAPER;
        } else {
            return UserSelection.SCISSORS;
        }

    }

    public static Winner selectWinner(UserSelection userSelection, UserSelection computerSelection) {

        if (userSelection == UserSelection.PAPER) {
            if (computerSelection == UserSelection.PAPER) {
                return Winner.DRAW;
            } else if (computerSelection == UserSelection.ROCK) {
                return Winner.HUMAN;
            } else {
                return Winner.COMPUTER;
            }
        } else if (userSelection == UserSelection.ROCK) {
            if (computerSelection == UserSelection.ROCK) {
                return Winner.DRAW;
            } else if (computerSelection == UserSelection.SCISSORS) {
                return Winner.HUMAN;
            } else {
                return Winner.COMPUTER;
            }
        } else  {
            if (computerSelection == UserSelection.SCISSORS) {
                return Winner.DRAW;
            } else if (computerSelection == UserSelection.PAPER) {
                return Winner.HUMAN;
            } else {
                return Winner.COMPUTER;
            }
        }
    }

}
