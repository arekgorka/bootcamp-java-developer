package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

import static java.util.Arrays.stream;


public interface ArrayOperations {

    static OptionalDouble getAverage(int[] numbers) {

        IntStream.range(0, numbers.length)
                .map(number-> numbers[number])
                .forEach(System.out::println);

        OptionalDouble result = IntStream.range(0,numbers.length)
                .map(number-> numbers[number])
                .average();

        return result;
    }
}
