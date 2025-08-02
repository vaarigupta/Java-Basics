package com.practice.fundamental.optional;

import com.practice.fundamental.data.StudentDataBase;
import com.practice.fundamental.model.Student;

import java.util.Optional;

public class optionalOrElseExamples
{
    public static String getNameUsingOrElse(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        // If student is present, return the name, otherwise return "Unknown"
        return studentOptional.map(Student::getName)
                .orElse("No name found");
    }
    public static void main(String[] args) {

        System.out.println("Name using orElse: " + getNameUsingOrElse());
    }
}
