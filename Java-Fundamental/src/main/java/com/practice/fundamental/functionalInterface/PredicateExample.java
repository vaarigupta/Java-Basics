package com.practice.fundamental.functionalInterface;
import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> isEven = (num) -> {
        return num%2==0;
    };

    static Predicate<Integer> isDivisibleBy2 = num -> num%2==0;
    static Predicate<Integer> isDivisibleBy5 = num -> num%5==0;

    static void printPredicateANDResult(){
        System.out.println("AND Predicate:");
        System.out.println( 10 + " is divisible by 2 and 5 : " +isDivisibleBy2.and(isDivisibleBy5).test(10));
        System.out.println(13 + " is divisible by 2 and 5 : " + isDivisibleBy2.and(isDivisibleBy5).test(13));
    }

    static void printPredicateORResult(){
        System.out.println( 8 + " is divisible by 2 or 5 : " + isDivisibleBy2.or(isDivisibleBy5).test(8));
        System.out.println(7 + " is divisible by 2 or 5 : " + isDivisibleBy2.or(isDivisibleBy5).test(7));
    }

    static void printPredicateNegateResult(){
        System.out.println( 8 + " is divisible by 2 or 5 with negate : " + isDivisibleBy2.or(isDivisibleBy5).negate().test(8));
        System.out.println(7 + " is divisible by 2 and 5 with negate : " + isDivisibleBy2.and(isDivisibleBy5).negate().test(7));
    }
    /**
     * Predicate is a functional interface that represents a single argument function that returns a boolean value.
     * It is often used for filtering or matching conditions.
     *
     * Common methods:
     * - test(T t): Evaluates the predicate on the given argument.
     * - and(Predicate<? super T> other): Returns a composed predicate that represents a short-circuiting logical AND of this predicate and another.
     * - or(Predicate<? super T> other): Returns a composed predicate that represents a short-circuiting logical OR of this predicate and another.
     * - negate(): Returns a predicate that represents the logical negation of this predicate.
     */
    public static void main(String[] args) {

        System.out.println(isEven.test(4));
        printPredicateANDResult();
        printPredicateORResult();
        printPredicateNegateResult();

    }
}
