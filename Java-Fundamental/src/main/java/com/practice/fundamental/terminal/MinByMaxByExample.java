package com.practice.fundamental.terminal;

import com.practice.fundamental.data.StudentDataBase;
import com.practice.fundamental.model.Student;

import java.util.Comparator;
import java.util.Optional;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

public class MinByMaxByExample
{

    public static Optional<Student> getStudentMinGpa(){

        return StudentDataBase.getAllStudents()
                .stream()
                .collect(minBy(Comparator
                        .comparing(Student::getGpa)));
    }

    public static Optional<Student> getStudentMaxGpa(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(maxBy(Comparator
                        .comparing(Student::getGpa)));
    }
    public static void main(String[] args) {

        Optional<Student> studentMinGpa = getStudentMinGpa();
        if (studentMinGpa.isPresent()) {
            System.out.println("Student with minimum GPA: " + studentMinGpa.get());
        } else {
            System.out.println("No student found with minimum GPA.");
        }

        Optional<Student> studentMaxGpa = getStudentMaxGpa();
        if (studentMaxGpa.isPresent()) {
            System.out.println("Student with maximum GPA: " + studentMaxGpa.get());
        } else {
            System.out.println("No student found with maximum GPA.");
        }
    }
}
