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

        return StudentDataBase.getAllStudents().stream()  //Stream of Students(Stream<Student>)
                .map(Student::getName)  //getting student as the input and returning the student name as output (Stream<String>)
                .collect(toList()); //collecting the stream of student names into a List (List<String>)
    }

    public static List<String> getStudentNamesListWithUpperCase(){

        return StudentDataBase.getAllStudents().stream() //Stream of Students(Stream<Student>)
                .map(Student::getName) //getting student as the input and returning the student name as output (Stream<String>)
                .map(String::toUpperCase) //converting each student name to upper case (Stream<String>)
                .collect(toList()); //collecting the stream of student names into a List (List<String>)
    }

    public static Set<String> getStudentNamesSet(){

        return StudentDataBase.getAllStudents().stream() //Stream of Students(Stream<Student>)
                .map(Student::getName) //getting student as the input and returning the student name as output (Stream<String>)
                .collect(toSet()); //collecting the stream of student names into a Set (Set<String>)
    }
    public static void main(String[] args) {

        System.out.println("Student Names List: " + getStudentNamesList());
        System.out.println("Student Names List with Upper Case: " + getStudentNamesListWithUpperCase());
        System.out.println("Student Names Set: " + getStudentNamesSet());
    }
}
