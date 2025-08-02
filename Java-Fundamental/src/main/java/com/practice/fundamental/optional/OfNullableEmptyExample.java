package com.practice.fundamental.optional;

import java.util.Optional;

public class OfNullableEmptyExample {

    // This example demonstrates the use of Optional.ofNullable, It can hold a non-null value or empty or null.
    //If the value is null, it returns an empty Optional, and if the value is non-null, it returns an Optional containing that value.
    //It will not throw a NullPointerException if the value is null.
    public static Optional<String> ofNullable(){
        Optional<String> optional = Optional.ofNullable(null);
        return optional;
    }

    // This example demonstrates the use of Optional.of, It needs a non-null value or empty to create an Optional.
    //If the value is null, it will throw a NullPointerException.
    public static Optional<String> of(){
        Optional<String> optional = Optional.of("");
        return optional;
    }

    // This example demonstrates the use of Optional.empty, It creates an empty Optional instance.
    // It does not hold any value and is used to represent the absence of a value.
    // It is useful when you want to indicate that there is no value present.
    public static Optional<String> empty(){
        return Optional.empty();
    }
    public static void main(String[] args) {

        Optional<String> optional1 = ofNullable();
        System.out.println("Optional.ofNullable: " + optional1);

        Optional<String> optional2 = of();
        System.out.println("Optional.of: " + optional2);

        Optional<String> optional3 = empty();
        System.out.println("Optional.empty: " + optional3.isPresent());
    }
}
