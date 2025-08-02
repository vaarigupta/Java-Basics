package com.practice.fundamental.optional;

import com.practice.fundamental.data.StudentDataBase;
import com.practice.fundamental.model.Student;

import java.util.Optional;

public class optionalExample {

    public static Optional<String> getStudentName(){

       Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
       if(studentOptional.isPresent()) {
           return studentOptional.map(Student::getName);
       }
       return Optional.empty();
    }
    public static void main(String[] args) {

        Optional<String> studentName = getStudentName();
      //  Optional<String> studentName = Optional.empty();
        if(studentName.isPresent()){
            System.out.println("Student Name: " + studentName.get());
        } else {
            System.out.println("No student found");
        }
    }
}
