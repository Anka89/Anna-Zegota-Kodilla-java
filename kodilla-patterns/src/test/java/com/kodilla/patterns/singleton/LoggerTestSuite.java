package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void logInto() {
        Logger.getInstance().log("This is your last chance" );
    }

    @Test
    public void getLastLog() {
        //Given
        String result = Logger.getInstance().getLastLog();

        //When
        String expected = "This is your last chance";

        //Then
        Assert.assertEquals(expected, result);
    }
}
