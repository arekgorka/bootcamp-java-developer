package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

import static java.util.Arrays.stream;


public interface ArrayOperations {

    static double getAverage(int[] numbers) {

        IntStream.range(0, numbers.length)
                .map(number-> numbers[number])
                .forEach(System.out::println);

        return IntStream.range(0,numbers.length)
                .map(number-> numbers[number])
                .average().orElse(0);
    }

}
