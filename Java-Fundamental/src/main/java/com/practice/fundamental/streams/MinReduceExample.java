package com.practice.fundamental.streams;

import java.util.List;
import java.util.Optional;

public class MinReduceExample {

    public static int findMinElement(List<Integer> integerList) {
        return integerList
                .stream()
                // a=MAX_VALUE, b=6(from stream) => result=6
                // a=6, b=7(from stream) => result=6
                // a=6, b=8(from stream) => result=6
                // a=6, b=9(from stream) => result=6
                // a=6, b=10(from stream) => result=6
                // Here, we are using MAX_VALUE as the identity value, which is the maximum possible value for integers which helps to find the minimum element.
                // a variable holds the accumulated minimum value, and b is the current element from the stream
                .reduce(Integer.MAX_VALUE,(a,b)-> a<b?a:b);
    }

    public  static Optional<Integer> findMinElementWithoutIdentity(List<Integer> integerList) {
        return integerList
                .stream()
                .reduce((a,b)->a<b?a:b);
    }

    // This method finds the minimum element in a list of integers using reduce with an identity value.
    public static void main(String[] args) {

        List<Integer> integerList = List.of(6,7,8,9,10);
        int maxElement = findMinElement(integerList);
        System.out.println("Minimum element in the list: " + maxElement);

        System.out.println("--------------------");
        System.out.println("Finding minimum element without identity...");
        // Example with an empty list to demonstrate handling of Optional
        List<Integer> emptyList = List.of();
        Optional<Integer> minElementWithoutIdentity = findMinElementWithoutIdentity(integerList);
        if(minElementWithoutIdentity.isPresent()) {
            System.out.println("Minimum element in the list without identity: " + minElementWithoutIdentity.get());
        } else {
            System.out.println("No elements in the list to find minimum.");
        }
    }
}
