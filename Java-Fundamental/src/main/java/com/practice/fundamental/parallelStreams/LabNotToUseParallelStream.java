package com.practice.fundamental.parallelStreams;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class LabNotToUseParallelStream {

    //Explanation : https://chatgpt.com/s/t_689d53cdb818819193b9d066d466cdeb
    // Parallel streams can be slower for small/simple tasks because splitting work,
    // managing threads, and merging results adds overhead. With boxed Integers,
    // extra autoboxing/unboxing further increases cost. Parallelism benefits only
    // for large CPU-bound workloads with minimal coordination.
    public static void sumSequential(List<Integer> integerList){
        long startTime = System.currentTimeMillis();
        int sum = integerList
                 .stream()
                .reduce(0,(x,y)->x+y);
        long endTime = System.currentTimeMillis();
        System.out.println("Sum using sequential stream: " + sum);
        System.out.println("Time taken for sequential stream: " + (endTime - startTime) + " ms");

    }

    public static void parallelSum(List<Integer> integerList){
        long startTime = System.currentTimeMillis();
        int sum = integerList
                .parallelStream()
                .reduce(0,(x,y)->x+y);
        long endTime = System.currentTimeMillis();
        System.out.println("Sum using parallel stream: " + sum);
        System.out.println("Time taken for parallel stream: " + (endTime - startTime) + " ms");
    }
    public static void main(String[] args) {

       List<Integer> integerList = IntStream.rangeClosed(1,100000)
                .boxed()
                .collect(toList());
        sumSequential(integerList);
        System.out.println("---------------------------------");
         parallelSum(integerList);
    }
}
