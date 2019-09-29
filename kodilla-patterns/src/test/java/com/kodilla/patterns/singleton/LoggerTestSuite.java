package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void assignLogs(){
        Logger.getInstance().log("Pierwszy wpis do logu !");
        Logger.getInstance().log("Drugi wpis do logu !");
        Logger.getInstance().log("Trzeci wpis do logu !");

    }

    @Test
    public void testGetLastLog(){
        //Given
        //When
        String lastLog = Logger.getInstance().getLastLog();
        System.out.println("Last Log : " + lastLog );
        //Then
        Assert.assertEquals("Trzeci wpis do logu !",lastLog);
    }
}
