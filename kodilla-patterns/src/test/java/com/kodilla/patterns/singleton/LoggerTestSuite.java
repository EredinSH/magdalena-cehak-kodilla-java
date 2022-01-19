package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void openLastLog() {
        logger = Logger.LOGIN;
        logger.log("Monday 10:35");
    }

    @Test
    void getLstLogTest() {
        //GIVEN
        //WHEN
        String lastLog = logger.getLastLog();
        System.out.println("Last log: " + lastLog);

        //THEN
        assertEquals("Monday 10:35", lastLog);

    }

}
