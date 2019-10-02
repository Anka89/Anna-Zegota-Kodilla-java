package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int numbers [] = {1,2,3,4,5,6,1,2,3,4,5,6,1,2,3,4,5,6};
        double averageExpected = 3.5;
        //When
        double average = ArrayOperations.getAverage(numbers);
        //Then
        System.out.println( (average) );
        Assert.assertEquals(averageExpected, average, 0.001);
    }
}