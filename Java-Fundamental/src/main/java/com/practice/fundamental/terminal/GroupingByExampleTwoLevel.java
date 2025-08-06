package com.practice.fundamental.terminal;

import com.practice.fundamental.data.StudentDataBase;
import com.practice.fundamental.model.Student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.fasterxml.jackson.databind.type.LogicalType.Map;
import static java.util.stream.Collectors.groupingBy;

public class GroupingByExampleTwoLevel {

    // This class is intended to demonstrate two-level grouping using Java Streams.

    public static void groupingByGradelevelandGpa(){

       Map<Integer, Map<String, List<Student>>> students = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        groupingBy(student -> student.getGpa()>= 3.8 ? "Outstanding" : "Average")));

        System.out.println(students);
    }

    public static void groupingByNameAndCountOfNotebooks(){

        Map<String,Integer> students = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName,
                         Collectors.summingInt(Student::getNoteBooks)));
        System.out.println(students);
    }
    public static void main(String[] args) {

        groupingByGradelevelandGpa();
        System.out.println("---------------------------------");
        groupingByNameAndCountOfNotebooks();
    }
}
