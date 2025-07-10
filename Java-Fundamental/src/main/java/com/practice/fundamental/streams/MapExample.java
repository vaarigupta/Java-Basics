package com.practice.fundamental.streams;

import com.practice.fundamental.data.StudentDataBase;
import com.practice.fundamental.model.Student;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class MapExample {

    public static List<String> getStudentNamesList(){

        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(toList());
    }

    public static List<String> getStudentNamesListWithUpperCase(){

        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(toList());
    }

    public static Set<String> getStudentNamesSet(){

        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(toSet());
    }
    public static void main(String[] args) {

        System.out.println("Student Names List: " + getStudentNamesList());
        System.out.println("Student Names List with Upper Case: " + getStudentNamesListWithUpperCase());
        System.out.println("Student Names Set: " + getStudentNamesSet());
    }
}
