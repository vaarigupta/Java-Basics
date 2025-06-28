package com.practice.fundamental.lambda;

import java.util.function.Consumer;

public class LambdaRestrictionExample {

    public static void main(String[] args) {
        int i = 2;

//       Not allowed to use the same local variable name 'i' as the lambda parameter and inside the lambda expression
//        Consumer<Integer> consumer1 = (i) -> {
//            System.out.println("Value from parameter: " + i);
//        }; //commented out because it will cause a compilation error

        //Not allowed to redefine the same local variable name 'i' inside the lambda expression
        Consumer<Integer> consumer2 = (val) -> {
         // This is not allowed because 'i' is already defined in the outer scope and cannot be redefined in the lambda expression
         //   int i =10; // This line would cause a compilation error
            System.out.println("Value from parameter: " + val);
        };

        consumer2.accept(10);
    }
}