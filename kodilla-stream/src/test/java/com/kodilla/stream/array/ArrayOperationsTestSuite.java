package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {

        //Given
        int[] randomNumbers = new int[] {28,34,25,33,42,11,5,67,3,2,23,53,64,74,3,1,5,3,66,13};

        //When
        OptionalDouble mean = ArrayOperations.getAverage(randomNumbers);

        //Then
        OptionalDouble expectedMean = IntStream.range(0, randomNumbers.length)
                        .map(number-> randomNumbers[number])
                        .average();

        assertEquals(expectedMean,mean);

    }
}
