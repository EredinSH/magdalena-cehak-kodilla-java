package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> numberList = new ArrayList<>();

        for (int number : numberList) {
            if (number %2 == 0) {
                numberList.add(number);
            }
        }

        return numberList;

    }
}
