package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Game {

    String userName;
    int howManyRounds;
    int computerScore;
    int humanScore;
    boolean end = false;
    public void play() {
        userName = UserDialogs.getUserName();
        howManyRounds = UserDialogs.getNumberOfRounds();
        int round = 1;
        while(round <= howManyRounds && end == false) {
            UserSelection userSelection = UserDialogs.getUserSelection();
            UserSelection computerSelection = AI.getComputerSelection();
            if(userSelection == UserSelection.QUIT) {
                System.exit(0);
            } else if (userSelection == UserSelection.NEW_GAME) {
                howManyRounds = 0;
                System.out.println("Let`s start again!");
            }
            Winner winner = AI.selectWinner(userSelection,computerSelection);
            if(winner == Winner.COMPUTER) {
                computerScore++;
            } else if (winner == Winner.HUMAN) {
                humanScore++;
            } else {
                humanScore++;
                computerScore++;
            }
            UserDialogs.showPartialResult(round,howManyRounds,userSelection,computerSelection,winner,humanScore,computerScore);

            round++;
        }
        UserDialogs.showFinalResult(computerScore,humanScore);
    }

}
