package com.practice.fundamental.functionalInterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    public static BinaryOperator<Integer> addFunction = (a, b) -> a + b;
    public static BinaryOperator<Integer> multiplyFunction = (a, b) -> a * b;
    public static BinaryOperator<Integer> maxFunction = (a, b) -> a > b ? a : b;

    public static Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
    public static void main(String[] args) {

        // Using BinaryOperator to add two integers
        System.out.println("Addition of 10 and 20: " + addFunction.apply(10, 20));

        // Using BinaryOperator to multiply two integers
        System.out.println("Multiplication of 10 and 20: " + multiplyFunction.apply(10, 20));

        // Using BinaryOperator to find the maximum of two integers
        System.out.println("Maximum of 10 and 20: " + maxFunction.apply(10, 20));

        // Using BinaryOperator with Comparator to find the maximum of two integers
        Integer maxValue = BinaryOperator.maxBy(comparator).apply(10,20);
        Integer minValue = BinaryOperator.minBy(comparator).apply(10,20);

        System.out.println("Maximum value using Comparator: " + maxValue);
        System.out.println("Minimum value using Comparator: " + minValue);

    }
}
