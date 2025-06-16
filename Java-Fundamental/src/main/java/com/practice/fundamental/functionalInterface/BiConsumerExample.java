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

    public static void printStudentBasedOnConditions(){

        BiConsumer<String, Integer> studentConsumer = (name, gradeLevel) ->{
            if(gradeLevel>=4){
                System.out.println("Student Name: " + name + " | Grade Level: " + gradeLevel);
            }
        };
        Student s1 = StudentDataBase.getAllStudents().get(5);
        studentConsumer.accept(s1.getName(),s1.getGradeLevel());

        System.out.println("-------------------");

        StudentDataBase.getAllStudents().forEach(student ->  {
            studentConsumer.accept(student.getName(), student.getGradeLevel());
        });


    }
    /**
     * Main method to demonstrate the usage of BiConsumer functional interface.
     * It shows how to use BiConsumer for different operations like printing strings,
     * performing arithmetic operations, and printing student names and activities.
     */
    public static void main(String[] args) {
        // Example usage of BiConsumer

        //Simple BiConsumer to print two strings
        BiConsumer<String,String> biConsumer = (s1,s2) ->{
            System.out.println("First String: " + s1);
            System.out.println("Second String: " + s2);
        };
        biConsumer.accept("vaari", "gupta");
        System.out.println("-------------------");

        // Using BiConsumer to perform Sum operation on two integers
        BiConsumer<Integer,Integer> biConsumerSum = (a,b) -> {
            System.out.println("Sum of " + a + " and " + b + " is: " + (a + b));
        };

        // Using BiConsumer to perform Multiplication operation on two integers
        BiConsumer<Integer,Integer> biConsumerMultiply = (a,b) ->{
            System.out.println("Multiplication of " + a + " and " + b + " is: " + (a * b));
        };

        biConsumerSum.andThen(biConsumerMultiply).accept(10,5);
        System.out.println("-------------------");


        // Using BiConsumer to print student names and activities
        printStudentNamesAndActivities();
        System.out.println("-------------------");

        // Using BiConsumer to print student names and grade levels based on conditions
        printStudentBasedOnConditions();

    }
}
