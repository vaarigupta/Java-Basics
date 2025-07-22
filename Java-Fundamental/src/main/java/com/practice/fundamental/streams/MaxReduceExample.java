package com.practice.fundamental.streams;

import java.util.List;
import java.util.Optional;

public class MaxReduceExample {

    // The reduce() method is a terminal operation that performs a reduction on the elements of the stream using an associative accumulation function and returns an Optional.
    // This method finds the maximum element in a list of integers using reduce with an identity value.
    public static int findMaxElement(List<Integer> integerList){
        return integerList
                .stream()
                // a=0, b=6(from stream) => result=6
                // a=6, b=7(from stream) => result=7
                // a=7, b=8(from stream) => result=8
                // a=8, b=9(from stream) => result=9
                // a=9, b=10(from stream) => result=10
                // a=10, b=0(from stream) => result=10
                // Here, we are using 0 as the identity value, which is the minimum possible value for integers.
                //a variable holds the accumulated maximum value, and b is the current element from the stream.
                .reduce(0, (a,b)-> a> b?a:b);
    }

    public static Optional<Integer> findMaxElementWithoutIdentity(List<Integer> integerList){
        return integerList
                .stream()
                .reduce((a,b)->a>b?a:b);
    }
    public static void main(String[] args) {

        List<Integer> integerList = List.of(6,7,8,9,10);
        int maxElement = findMaxElement(integerList);
        System.out.println("Maximum element in the list: " + maxElement);

        System.out.println("--------------------");
        System.out.println("Finding maximum element without identity...");
        // Example with an empty list to demonstrate handling of Optional
        List<Integer> emptyList = List.of();
        Optional<Integer> maxElementWithoutIdentity = findMaxElementWithoutIdentity(emptyList);
        if(maxElementWithoutIdentity.isPresent()) {
            System.out.println("Maximum element in the list without identity: " + maxElementWithoutIdentity.get());
        } else {
            System.out.println("No elements in the list to find maximum.");
        }
    }
}
