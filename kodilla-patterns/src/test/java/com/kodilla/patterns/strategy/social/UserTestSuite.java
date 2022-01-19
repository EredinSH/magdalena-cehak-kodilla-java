package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.predictors.AggressivePredictor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {

        //GIVEN
        User john = new Millenials("John Smith");
        User mike = new YGeneration("Mike Vazowsky");
        User gerard = new ZGeneration("Gerard Butler");

        //WHEN
        String johnPublish = john.sharing();
        System.out.println("John make a comment with " + johnPublish);
        String mikePublish = mike.sharing();
        System.out.println("Mike make a comment with " + mikePublish);
        String gerardPublish = gerard.sharing();
        System.out.println("Gerard make a comment with " + gerardPublish);

        //THEN
        assertEquals("Facebook", johnPublish);
        assertEquals("Snapchat", mikePublish);
        assertEquals("Twitter", gerardPublish);

    }

    @Test
    public void testIndividualSharingStrategy() {

        //GIVEN
        User john = new Millenials("John Smith");

        //WHEN
        String johnPublish = john.sharing();
        System.out.println("John should make a comment with " + johnPublish);
        john.setSharingStrategy(new TwitterPublisher());
        johnPublish = john.sharing();
        System.out.println("John make a comment with " + johnPublish);

        //THEN
        assertEquals("Twitter", johnPublish);

    }

}
