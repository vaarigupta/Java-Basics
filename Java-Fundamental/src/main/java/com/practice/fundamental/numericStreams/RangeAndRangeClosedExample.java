package com.practice.fundamental.numericStreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class RangeAndRangeClosedExample {

    public static void main(String[] args) {

        IntStream intStream = IntStream.range(1,20);
        System.out.println( "IntStream.range : " + intStream.count());

        IntStream.range(1,10).forEach(i -> System.out.print(i + " "));
        System.out.println("--------------------");
        IntStream intStream1 = IntStream.rangeClosed(1,20);
        System.out.println("IntStream.rangeClosed : " + intStream1.count());

        IntStream.rangeClosed(1,5).forEach(i -> System.out.print(i + " "));
        System.out.println("--------------------");
        LongStream longStream = LongStream.range(1,30);
        System.out.println("LongStream.range  : " + longStream.count());

        LongStream longStream1 = LongStream.rangeClosed(1,30);
        System.out.println("LongStream.rangeClosed : " + longStream1.count());

        IntStream.range(1,6).asDoubleStream().forEach(d -> System.out.print(d + " "));
    }
}
