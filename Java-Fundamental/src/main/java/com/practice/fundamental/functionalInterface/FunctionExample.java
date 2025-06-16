package com.practice.fundamental.functionalInterface;

import java.util.function.Function;

public class FunctionExample {

    static Function<String,String>  performToUpperCase = (name) -> name.toUpperCase();
    static Function<String,String> performConcatenation = (name) -> name.concat(" is a string");

    public static void main(String[] args) {
        // Using Function functional interface to convert a string to uppercase
        System.out.println("Uppercase: " + performToUpperCase.apply("hello world"));

        // Using Function functional interface to concatenate a string
        System.out.println("Concatenation: " + performConcatenation.apply("hello world"));

       // Chaining two functions togethers - andThen
        System.out.println("Chained Function (andThen): " + performToUpperCase.andThen(performConcatenation).apply("hello world"));

        // Chaining two functions together in reverse order - compose
        System.out.println("Chained Function in reverse order (compose): " + performToUpperCase.compose(performConcatenation).apply("hello world"));
    }
}
