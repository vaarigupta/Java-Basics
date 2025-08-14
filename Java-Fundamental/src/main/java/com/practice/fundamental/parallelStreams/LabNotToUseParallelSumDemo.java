package com.practice.fundamental.parallelStreams;

import java.util.stream.IntStream;

public class LabNotToUseParallelSumDemo {

    //Explanation: https://chatgpt.com/s/t_689d6766fa6c8191b1f222973172acd1
    // This class demonstrates why using parallel streams for simple summation tasks can lead to inconsistent results.
    // The `Sum` class is not thread-safe, and when multiple threads modify the same instance concurrently,
    // it can result in lost updates and unpredictable outcomes.
    public static void calculateSum() {

        Sum sum = new Sum();
        IntStream.rangeClosed(1,1000)
                .forEach((value)-> sum.performSum(value));
        System.out.println("Total Sum: " + sum.getTotal());
        //Total Sum: 500500
    }

    public static void calculateSumUsingParallelStream() {

        Sum sum = new Sum();
        IntStream.rangeClosed(1,1000)
                .parallel()
                .forEach((value)-> sum.performSum(value));
        System.out.println("Total Sum: " + sum.getTotal());
        //Total Sum: 498197
        //Total Sum: 494441
        //Total Sum: 500156
        //Total Sum: 500500
        //The result is not consistent because the parallel stream does not guarantee the order of execution.
    }
    public static void main(String[] args) {

       // calculateSum();
        System.out.println("----------------------------");
        calculateSumUsingParallelStream();
    }
}
