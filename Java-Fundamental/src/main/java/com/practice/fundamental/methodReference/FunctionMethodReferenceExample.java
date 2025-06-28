package com.practice.fundamental.methodReference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

    static Function<String,String> toUpperCase = (s) -> s.toUpperCase();

    static Function<String,String> toUpperCaseMethodReference = String::toUpperCase;
    public static void main(String[] args) {

        System.out.println(toUpperCase.apply("vaari"));
        System.out.println(toUpperCaseMethodReference.apply("vaari"));
    }
}
