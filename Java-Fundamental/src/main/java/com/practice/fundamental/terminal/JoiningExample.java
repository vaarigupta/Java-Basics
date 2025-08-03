package com.practice.fundamental.terminal;

import com.practice.fundamental.data.StudentDataBase;
import com.practice.fundamental.model.Student;

import java.util.stream.Collectors;

public class JoiningExample {


    // joining() is a terminal operation that concatenates the elements of the stream into a single String
    // It can be used to create a single string from a stream of elements, such as names or other string representations.
    public static String joining1(){

      return   StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }

    // It can be used to create a comma-separated list of elements or any other custom format.
    public static String joining2(){
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining(", "));
    }

    // joining() can also take a delimiter, a prefix, and a suffix
    public static String joining3(){
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining(", ", "Names: ", "."));
    }
    public static void main(String[] args) {

        System.out.println("Joining Example 1: " + joining1());
        System.out.println("Joining Example 2: " + joining2());
        System.out.println("Joining Example 3: " + joining3());
    }
}
