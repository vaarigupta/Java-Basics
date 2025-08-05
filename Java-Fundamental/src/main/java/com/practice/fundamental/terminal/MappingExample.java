package com.practice.fundamental.terminal;

import com.practice.fundamental.data.StudentDataBase;
import com.practice.fundamental.model.Student;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.mapping;

public class MappingExample {

    public static List<String> getStudentNames(){

        return StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName, Collectors.toList()));
    }
    public static void main(String[] args) {

        List<String> studentNames = getStudentNames();
        System.out.println("Student Names: " + studentNames);
    }
}
