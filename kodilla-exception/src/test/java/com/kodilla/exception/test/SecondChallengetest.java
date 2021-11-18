package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SecondChallengetest {

    @Test
void testProbablyIWillThrowException() {
        //GIVEN
        SecondChallenge secondChallenge = new SecondChallenge();

        //WHEN & THEN
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2,10)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(3,10)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0,10)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(10,1.5))
        );
    }

}
