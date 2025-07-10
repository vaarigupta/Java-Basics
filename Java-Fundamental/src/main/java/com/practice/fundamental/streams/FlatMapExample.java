package com.practice.fundamental.streams;

import com.practice.fundamental.data.StudentDataBase;
import com.practice.fundamental.model.Student;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class FlatMapExample {

    public  static List<String> getStudentActivities(){

        // Using flatMap to get a list of all activities from all students
       return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .collect(toList());
    }
    public static void main(String[] args) {

        System.out.println("Student Activities: " + getStudentActivities());
    }
}
