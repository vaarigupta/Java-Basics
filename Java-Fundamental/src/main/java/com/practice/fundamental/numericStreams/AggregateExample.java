package com.practice.fundamental.numericStreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class AggregateExample {

    public static void main(String[] args) {

        int sum = IntStream.rangeClosed(1,5).sum();
        System.out.println("Sum of numbers from 1 to 5: " + sum);

        OptionalInt max = IntStream.rangeClosed(1,100).max();
        System.out.println("Maximum number from 1 to 100: " + (max.isPresent()? max.getAsInt():-1));

        OptionalLong min = LongStream.rangeClosed(5,50).min();
        System.out.println("Minimum number from 5 to 50: " + (min.isPresent() ? min.getAsLong() : Integer.MAX_VALUE));

        long count = LongStream.rangeClosed(1,100).count();
        System.out.println("Count of numbers from 1 to 100: " + count);

        OptionalDouble average = LongStream.rangeClosed(1,100).average();
        System.out.println("Average of numbers from 1 to 100: " + (average.isPresent() ? average.getAsDouble() : -1.0));
    }
}
