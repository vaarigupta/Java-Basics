package com.practice.fundamental.streams;

import com.practice.fundamental.data.StudentDataBase;
import com.practice.fundamental.model.Student;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class FilterExample {

    public static List<Student> filterStudentsByGender(){

     return StudentDataBase.getAllStudents().stream() // Stream of Students (Stream<Student>)
                .filter(student -> student.getGender().equals("female")) // Filtering students by gender(female) (Stream<Student>)
                .collect(toList()); // collecting each student to a List (List<Student>)
    }

    public static List<Student> filterStudentsByGradeLevel(){

        return StudentDataBase.getAllStudents().stream() // Stream of Students (Stream<Student>)
                .filter(student -> student.getGradeLevel() >= 3) // Filtering students by grade level (Stream<Student>)
                .collect(toList()); // collecting each student to a List (List<Student>)
    }
    public static void main(String[] args) {

        System.out.println("Filtered Students by Gender(female)");
        filterStudentsByGender().forEach(System.out::println);

        System.out.println("Filtered Students by Grade Level");
        filterStudentsByGradeLevel().forEach(System.out::println);

    }
}
