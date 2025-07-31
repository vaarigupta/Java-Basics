package com.practice.fundamental.numericStreams;

import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class NumericMapToExample {

    public static List<String> mapToObj(){

        return IntStream
                .rangeClosed(1,5)
                .mapToObj(i -> "Number: " + i)
                .collect(toList());
    }

    public static OptionalLong mapToLong(){

        return IntStream.rangeClosed(1,5)
                .mapToLong(x -> x*2)
                .max();
    }

    public static OptionalDouble mapToDouble(){

        return IntStream.rangeClosed(1,5)
                .mapToDouble(x ->x*2.0)
                .average();
    }
    public static void main(String[] args) {

        System.out.println("Mapped Objects: " + mapToObj());

        OptionalLong maxValue = mapToLong();
        if (maxValue.isPresent()) {
            System.out.println("Maximum value after mapping to long: " + maxValue.getAsLong());
        } else {
            System.out.println("No maximum value found.");
        }

        OptionalDouble averageValue = mapToDouble();
        if(averageValue.isPresent()) {
            System.out.println("Average value after mapping to double: " + averageValue.getAsDouble());
        } else {
            System.out.println("No average value found.");
        }
    }
}
