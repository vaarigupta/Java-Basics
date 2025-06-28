package com.practice.fundamental.lambda;

import java.util.function.Consumer;

public class LambdaRestrictionExample1 {

    static int value = 10;
    public static void main(String[] args) {

        int i=2;

        // Lambda expressions cannot modify local variables that are effectively final
        Consumer<Integer> consumer = (value) -> {
            //Lambda expresssions are allowed to use local variables but not allowed to modify them
            // even though they are not declared final, this concept is called effectively final
            //i++; // This line would cause a compilation error because 'i' is effectively final
            System.out.println(value +i);
        };

        consumer.accept(5);

        Consumer<Integer> consumer1 = (val) -> {
            // This modifies the static variable 'value', which is allowed, it is not a local variable
            value++;
            System.out.println(value +val);
        };

        consumer1.accept(5);
    }
}
