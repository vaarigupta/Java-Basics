package com.practice.fundamental.streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfIterateGenerateExample {

    public static void main(String[] args) {

        Stream.of("Vaari", "Raavi", "Yagesh","Himanshu")
                .forEach( System.out::println);

        System.out.println("-------------------");
        Stream.iterate(1,x ->x*2)
                .limit(10)
                .forEach(i -> System.out.println(i));

        System.out.println("-------------------");
        Supplier<Integer> integerSupplier = () -> new Random().nextInt();
        Stream.generate(integerSupplier)
                .limit(5)
                .forEach(i -> System.out.println(i));
    }

}
