package com.practice.fundamental.functionalInterface;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        // Example of using a Consumer functional interface
        Consumer<String> consumer = (str) -> System.out.println("Consuming: " + str);

        consumer.accept("vaari");
    }
}
