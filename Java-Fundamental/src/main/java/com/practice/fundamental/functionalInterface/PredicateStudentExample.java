package com.practice.fundamental.functionalInterface;

import com.practice.fundamental.data.StudentDataBase;
import com.practice.fundamental.model.Student;

import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> isGradeLevelGreaterThan4 = student -> student.getGradeLevel()>=4;
    static Predicate<Student> isGpaGreaterThan3_9 = student -> student.getGpa()>=3.9;

    //printing students based on their grade level using Predicate functional interface
    public static void printStudentsBasedOnGrade(){
        StudentDataBase.getAllStudents().forEach((student)->{
            if(isGradeLevelGreaterThan4.test(student)){
                System.out.println("Student Name: " + student.getName() + " | Grade Level: " + student.getGradeLevel());
            }
        });

    }

    //printing students based on their GPA using Predicate functional interface
    public static void printStudentsBasedOnGpa(){
        StudentDataBase.getAllStudents().forEach((student)->{
            if(isGpaGreaterThan3_9.test(student)){
                System.out.println("Student Name: " + student.getName() + " | GPA: " + student.getGpa());
            }
        });
    }

    //printing students based on their grade level and GPA using Predicate functional interface
    public static void printStudentsBasedOnGradeAndGpaUsingAndNegate(){
        //using Predicate functional interface to filter students based on grade level and GPA both
        StudentDataBase.getAllStudents().forEach((student)->{
            if(isGradeLevelGreaterThan4.and(isGpaGreaterThan3_9).test(student)){
                System.out.println("Student Name: " + student.getName() + " | Grade Level: " + student.getGradeLevel() + " | GPA: " + student.getGpa());
            }
        });

        System.out.println("-----------------------------------");
        // using Predicate functional interface to filter students based on grade level and GPA using "and" and "negate" method
        StudentDataBase.getAllStudents().forEach((student)->{
            if(isGradeLevelGreaterThan4.and(isGpaGreaterThan3_9).negate().test(student)){
                System.out.println("Student Name: " + student.getName() + " | Grade Level: " + student.getGradeLevel() + " | GPA: " + student.getGpa());
            }
        });
    }

    //printing students based on their grade level or GPA using Predicate functional interface
    public static void printStudentsBasedOnGradeAndGpaUsingOr(){
        StudentDataBase.getAllStudents().forEach((student)->{
            if(isGradeLevelGreaterThan4.or(isGpaGreaterThan3_9).test(student)){
                System.out.println("Student Name: " + student.getName() + " | Grade Level: " + student.getGradeLevel() + " | GPA: " + student.getGpa());
            }
        });
    }
    /**
     * Main method to demonstrate the usage of Predicate functional interface.
     * It shows how to filter students based on their grade level and GPA.
     */
    public static void main(String[] args) {

    //testing the Predicate functional interface
        System.out.println("Testing Predicate functional interface:");
        System.out.println("-----------------------------------");

        // Print students based on grade level
        printStudentsBasedOnGrade();
        System.out.println("-----------------------------------");

        // Print students based on GPA
        printStudentsBasedOnGpa();
        System.out.println("-----------------------------------");

        // Print students based on both grade level and GPA - "and" and "negate" conditions
        printStudentsBasedOnGradeAndGpaUsingAndNegate();

        System.out.println("-----------------------------------");
        // Print students based on either grade level or GPA
        printStudentsBasedOnGradeAndGpaUsingOr();



    }
}
