package com.practice.fundamental.optional;

import com.practice.fundamental.data.StudentDataBase;
import com.practice.fundamental.model.Student;

import java.util.Optional;

public class FilterMapExample {

    public static void optionalFilter(){

        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        studentOptional.filter(student -> student.getGpa()>=2.0)
                .ifPresent(student -> System.out.println("Student details: " + student));
    }

    public static void optionalMap(){

      //  Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.empty();
        studentOptional.map(Student::getName)
                .ifPresentOrElse(
                        name -> System.out.println("Student Name: " + name),
                        () -> System.out.println("No student found")
                );
    }
    public static void main(String[] args) {

        optionalFilter();
        System.out.println("-----------------------------------");
        optionalMap();
    }
}
