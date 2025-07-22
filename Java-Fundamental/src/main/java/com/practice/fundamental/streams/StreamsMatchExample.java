package com.practice.fundamental.streams;

import com.practice.fundamental.data.StudentDataBase;

public class StreamsMatchExample {

    //All of these methods uses a concept of short-circuiting, meaning they can stop processing as soon as the condition is met, improving performance.
    //allMatch() checks if all elements in the stream match the given predicate and returns true if they do, otherwise false.
    public static boolean allMatch(){
        return StudentDataBase.getAllStudents()
                .stream()
                .allMatch(student -> student.getGpa()>=3.5);
    }

    //anyMatch() checks if any element in the stream matches the given predicate and returns true if at least one does, otherwise false.
    public static boolean anyMatch(){
        return StudentDataBase.getAllStudents()
                .stream()
                .anyMatch(student -> student.getGpa()>=3.9);
    }

    //noneMatch() checks if no elements in the stream match the given predicate and returns true if none do, otherwise false.
    // It is the negation of allMatch().
    // If allMatch() returns false, noneMatch() will return true.
    public static boolean noneMatch(){
        return StudentDataBase.getAllStudents()
                .stream()
                .noneMatch(student -> student.getGpa()>=4.1);
    }
    public static void main(String[] args) {

        System.out.println("All students have GPA >= 3.5: " + allMatch());
        System.out.println("At least one student has GPA >= 3.9: " + anyMatch());
        System.out.println("No student has GPA >= 4.1: " + noneMatch());

    }
}
