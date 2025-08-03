package com.practice.fundamental.optional;

import com.practice.fundamental.data.StudentDataBase;
import com.practice.fundamental.model.Bike;
import com.practice.fundamental.model.Student;

import java.util.Optional;

public class FlatMapExample {

    // flatMap is used to transform an Optional<Student> into an Optional<Bike> if the student has a bike.
    // It allows us to avoid nested Optionals and directly access the Bike object if it exists.
    //flatMap is particularly useful when dealing with nested Optionals, as it flattens the structure and allows for easier chaining of operations.
    public static void flatMap(){

       Optional.ofNullable(StudentDataBase.studentSupplier.get()) //ofNullable is used to Optional<Student> to handle the case where the student might be null
               .filter(student -> student.getGpa()>=3.0) // Filter students with GPA >= 3.0 of type Optional<Student>
               .flatMap(Student::getBike) // Use flatMap to extract the Bike from the Student, if present, resulting in Optional<Bike>
               .map(Bike::getName) // Use map to get the name of the Bike, resulting in Optional<String>
               .ifPresent( bikeName -> System.out.println("Bike Name: " + bikeName)); // ifPresent is used to print the bike name if it exists
    }
    public static void main(String[] args) {

        flatMap();
    }
}
