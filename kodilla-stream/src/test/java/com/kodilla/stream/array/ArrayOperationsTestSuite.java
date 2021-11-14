package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //GIVEN
        int[] numbers = new int[20];
        numbers[0] = 615;
        numbers[1] = 24;
        numbers[2] = 714;
        numbers[3] = 765;
        numbers[4] = 5;
        numbers[5] = 21;
        numbers[6] = 342;
        numbers[7] = 100;
        numbers[8] = 211;
        numbers[9] = 43;
        numbers[10] = 11;
        numbers[11] = 3;
        numbers[12] = 315;
        numbers[13] = 99;
        numbers[14] = 12;
        numbers[15] = 88;
        numbers[16] = 7;
        numbers[17] = 54;
        numbers[18] = 111;
        numbers[19] = 91;

        //WHEN
        double average = ArrayOperations.getAverage(numbers);
        double expectedAverage = 181.55;

        //THEN
        assertEquals(expectedAverage,average,0.001);

    }

}
