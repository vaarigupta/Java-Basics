package com.practice.fundamental.functionalInterface;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    public static UnaryOperator<String> toUpperCaseFunction = (name) -> name.toUpperCase();
    public static UnaryOperator<String> addSuffixFunction = (name) -> name.concat(" and vaari");

    public static void main(String[] args) {
        System.out.println(toUpperCaseFunction.apply("vaari"));
        System.out.println(addSuffixFunction.apply("himanshu"));
    }
}
