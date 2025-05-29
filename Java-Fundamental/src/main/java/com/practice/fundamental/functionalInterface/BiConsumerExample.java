package com.practice.fundamental.functionalInterface;

import com.practice.fundamental.data.StudentDataBase;
import com.practice.fundamental.model.Student;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {


    public static void printStudentNamesAndActivities(){

        List<Student> students = StudentDataBase.getAllStudents();
        BiConsumer<String,List<String>> nameActivitiesConsumer = (name, activities) ->{
            System.out.println("Name :" + name + " | Activities: " + activities);
        };

        students.forEach(student -> {
            nameActivitiesConsumer.accept(student.getName(), student.getActivities());
        });
    }
    public static void main(String[] args) {
        // Example usage of BiConsumer

        BiConsumer<String,String> biConsumer = (s1,s2) ->{
            System.out.println("First String: " + s1);
            System.out.println("Second String: " + s2);
        };

        biConsumer.accept("vaari", "gupta");

        System.out.println("-------------------");
        BiConsumer<Integer,Integer> biConsumerSum = (a,b) -> {
            System.out.println("Sum of " + a + " and " + b + " is: " + (a + b));
        };

//        biConsumerSum.accept(5,10);

        BiConsumer<Integer,Integer> biConsumerMultiply = (a,b) ->{
            System.out.println("Multiplication of " + a + " and " + b + " is: " + (a * b));
        };

        biConsumerSum.andThen(biConsumerMultiply).accept(10,5);
        System.out.println("-------------------");
        // Using BiConsumer to print student names and activities
        printStudentNamesAndActivities();


    }
}
