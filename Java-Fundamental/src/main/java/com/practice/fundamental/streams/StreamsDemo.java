package com.practice.fundamental.streams;

import com.practice.fundamental.data.StudentDB;
import com.practice.fundamental.model.Student;

import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsDemo {

    public static void main(String[] args) {

        Predicate<Student> studentPredicate = student -> student.getAge()>20;

        Map<String,Integer> studentGradesMap = StudentDB.getAllStudents()
                .stream()
                .filter(studentPredicate)
                .collect(Collectors.toMap(Student::getName, Student::getAge));

        System.out.println("Student Grades Map: " + studentGradesMap);
    }
}
