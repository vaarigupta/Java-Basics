package com.practice.fundamental.streams;

import com.practice.fundamental.data.StudentDataBase;
import com.practice.fundamental.model.Student;

import java.util.Optional;

public class FindFirstAnyExample {

    //findFirst() returns the first element of the stream that matches the filter condition, if present.
    // It is a short-circuiting operation, meaning it can stop processing as soon as the first match is found.
    //In short-circuiting operations, the stream processing can terminate early if a condition is met, avoiding unnecessary computations
    //and ultimately not whole stream is processed, improving performance.
    public static Optional<Student> findFirstStudent(){

        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa()>=3.7) // Filter students with GPA >= 3.7
                .findFirst();
    }

    //findAny() returns any element of the stream that matches the filter condition, if present.
    public static Optional<Student> findAnyStudent(){
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa()>=3.7) // Filter students with GPA >= 3.7
                .findAny();
    }
    public static void main(String[] args) {

        Optional<Student> firstStudent = findFirstStudent();
        if (firstStudent.isPresent()) {
            System.out.println("First student: " + firstStudent.get());
        } else {
            System.out.println("No students found.");
        }

        Optional<Student> anyStudent = findAnyStudent();
        if (anyStudent.isPresent()) {
            System.out.println("Any student: " + anyStudent.get());
        } else {
            System.out.println("No students found.");
        }
    }
}
