package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
import java.util.ArrayList;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
        System.out.println("-----------------------------------------");
    }

    @AfterEach
    public void after() {
        System.out.println("-----------------------------------------");
        System.out.println("Test Case: end");
    }

    @DisplayName("Verification program operation when list is empty")
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> emptyList = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //When
        ArrayList<Integer> resultList = oddNumbersExterminator.exterminate(emptyList);

        //Then
        Assertions.assertEquals(emptyList, resultList);

    }

    @DisplayName("Verification program operation when list includes even and odd numbers")
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> normalList = new ArrayList<>();
        normalList.add(231);
        normalList.add(2);
        normalList.add(56);
        normalList.add(564);
        normalList.add(4563);
        normalList.add(32);
        normalList.add(21);
        normalList.add(356);
        normalList.add(633);

        ArrayList<Integer> correctList = new ArrayList<>();
        correctList.add(2);
        correctList.add(56);
        correctList.add(564);
        correctList.add(32);
        correctList.add(356);

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //When
        ArrayList<Integer> resultList = oddNumbersExterminator.exterminate(normalList);

        //Then
        Assertions.assertEquals(correctList, resultList);

    }

}
