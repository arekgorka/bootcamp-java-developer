package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void addLog() {
        logger = Logger.LOGGER;
        logger.log("blabla");
        logger.log("Marcin76");
        logger.log("Login");
    }


    @Test
    void testGetLastLog() {
        //Given
        //When
        String lastLog = logger.getLastLog();
        //Then
        Assertions.assertEquals("Login",lastLog);
    }

}
