package com.practice.fundamental.streams;

import java.util.List;
import java.util.Optional;

public class LimitSkipExample {

    //The limit() method is used to limit the number of elements in a stream.
    //The limit() uses a concept of short-circuiting, meaning it can stop processing as soon as the specified number of elements is reached.
    public static Optional<Integer> limitSum(List<Integer> integerList){
        return integerList
                .stream() //stream of integers
                .limit(2) //limit the stream to the first two elements
                .reduce(Integer::sum); // reduce the limited elements by summing them up
    }
    //The skip() method is used to skip a specified number of elements in a stream.
    public static Optional<Integer> skipSum(List<Integer> integerList){
        return integerList
                .stream() //stream of integers
                .skip(2) //skip the first two elements
                .reduce(Integer::sum); // reduce the remaining elements by summing them up
    }
    public static void main(String[] args) {

        List<Integer> integerList = List.of(1, 2, 3, 4, 5);
        Optional<Integer> sum = limitSum(integerList);

        if (sum.isPresent()) {
            System.out.println("Sum of the first two elements: " + sum.get());
        } else {
            System.out.println("No elements to sum.");
        }

        Optional<Integer> sumAfterSkip = skipSum(integerList);
        if(sumAfterSkip.isPresent()){
            System.out.println("Sum after skipping the first two elements: " + sumAfterSkip.get());
        } else {
            System.out.println("No elements to sum after skipping.");
        }
    }
}
