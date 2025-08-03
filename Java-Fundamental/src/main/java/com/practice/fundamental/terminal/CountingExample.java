package com.practice.fundamental.terminal;

import com.practice.fundamental.data.StudentDataBase;

import static java.util.stream.Collectors.counting;

public class CountingExample {

    //counting() is a terminal operation that counts the number of elements in the stream.
    //It returns a Long value representing the count of elements.
    //In this case, it counts the total number of students in the StudentDataBase.
    public static long countStudents(){
      return  StudentDataBase.getAllStudents()
                .stream()
                .collect(counting());
    }

    public static long countFilteredStudents(){
        //counting() can also be used with a filter to count only specific elements in the stream.
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(s -> s.getName().startsWith("J"))
                .collect(counting());

    }
    public static void main(String[] args) {

        System.out.println("Total number of students: " + countStudents());
        System.out.println("Number of students whose name starts with 'J': " + countFilteredStudents());
    }
}
