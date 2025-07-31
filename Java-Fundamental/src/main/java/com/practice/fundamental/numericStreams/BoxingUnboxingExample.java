package com.practice.fundamental.numericStreams;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class BoxingUnboxingExample {

    //boxing : converting primitive int to Integer object using boxed() and collect
    public static List<Integer> boxing(){
        return IntStream.rangeClosed(1,10)
                .boxed() // converts each int to Integer object
                .collect(Collectors.toList());
    }

    //unboxing : converting Integer object to primitive int using mapToInt and sum
    //converts a List<Integer> to an intStream using mapToInt then sums the values
    public static int unboxing(List<Integer> numbers){
        return numbers
                .stream()
                .mapToInt(Integer::intValue) // converts each Integer to int and returns an IntStream
                .sum();
    }
    public static void main(String[] args) {

        List<Integer> boxedNumbers = boxing();
        System.out.println("Boxed Numbers: " + boxedNumbers);

        int sumOfUnboxed = unboxing(boxedNumbers);
        System.out.println("Sum of Unboxed Numbers: " + sumOfUnboxed);
    }
}
