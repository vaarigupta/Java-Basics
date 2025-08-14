package com.practice.fundamental.parallelStreams;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {


    public static int SumSequentially(){

       return IntStream.rangeClosed(1,100000)
                .sum();
    }

    public static int SumParallelly(){
        return IntStream.rangeClosed(1,100000)
                .parallel()
                .sum();
    }

    public static void checkPerformance(Supplier<Integer> supplier, int noOfTimes){

        long startTime = System.currentTimeMillis();
        for(int i=0;i<noOfTimes;i++){
            supplier.get();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime) + " ms");

    }
    // Example of using parallel streams to process a list of integers
    public static void main(String[] args) {

//        long startTime = System.currentTimeMillis();
//        int sequentialSum = SumSequentially();
//        long endTime = System.currentTimeMillis();
//        System.out.println("Sequential Sum: " + sequentialSum);
//        System.out.println("Time taken for sequential sum: " + (endTime - startTime) + " ms");

//        startTime = System.currentTimeMillis();
//        int parallelSum = SumParallelly();
//        endTime = System.currentTimeMillis();
//        System.out.println("Parallel Sum: " + parallelSum);
//        System.out.println("Time taken for parallel sum: " + (endTime - startTime) + " ms");

        System.out.println("Performance Comparison of Sequential vs Parallel Stream");
        System.out.println("Sequential Stream Performance:");
        //Using supplier to pass method reference instead of calling the method directly explained by
        //https://chatgpt.com/share/689c0445-8964-800f-a175-34e33832786c
        checkPerformance(() -> SumSequentially(),100);
        System.out.println("Parallel Stream Performance:");
        checkPerformance(ParallelStreamExample::SumParallelly,100);
    }
}
