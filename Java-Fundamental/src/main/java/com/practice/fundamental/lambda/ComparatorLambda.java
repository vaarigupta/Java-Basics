package com.practice.fundamental.lambda;

import java.util.Comparator;

public class ComparatorLambda {

    public static void main(String[] args) {

        Comparator<Integer> comparator = new Comparator<>(){
            @Override
            public int compare(Integer o1, Integer o2){
                return o1.compareTo(o2);
            }
        };

        System.out.println("Result using conventional method :" + comparator.compare(20, 10)); // Output: 1 (20 is greater than 10)

        //using lambda expression
        Comparator<Integer> lambdaComparator = ( Integer o1, Integer o2) -> {
            return o1.compareTo(o2);
        };
        System.out.println( "Result using lambda 1 :" + lambdaComparator.compare(20, 10)); // Output: 1 (20 is greater than 10)
        Comparator<Integer> lambdaComparator2 = (o1, o2) -> o1.compareTo(o2);

        System.out.println( "Result using lambda 2 :"  + lambdaComparator2.compare(20, 10)); // Output: 1 (20 is greater than 10)
    }
}
