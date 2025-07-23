package com.practice.fundamental.numericStreams;

import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamExample {

    public static int sumofNNumbers(List<Integer> numbers){
        return numbers
                .stream()
                .reduce(0, Integer::sum); // Reduce the stream of numbers to a single sum
    }

    public static int SumOfNNumbers(){
        return IntStream
                .rangeClosed(1,5)
                .sum();
    }
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        int sum = sumofNNumbers(numbers);
        System.out.println("Sum of numbers: " + sum);

        int sumOfRange = SumOfNNumbers();
        System.out.println("Sum of numbers from 1 to 5 using IntStream: " + sumOfRange);
    }
}
