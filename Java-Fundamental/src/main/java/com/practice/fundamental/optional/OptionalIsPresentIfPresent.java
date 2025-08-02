package com.practice.fundamental.optional;

import com.practice.fundamental.data.StudentDataBase;
import com.practice.fundamental.model.Student;

import java.util.Optional;

public class OptionalIsPresentIfPresent {

    // isPresent() method checks if the Optional contains a value.
    // If the Optional is empty, it returns false; otherwise, it returns true.
    public static boolean isPresent(){
       Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
      //  Optional<Student> studentOptional = Optional.empty();
        // isPresent() checks if the Optional contains a value
        return studentOptional.isPresent();
    }

    // ifPresent() method executes the given action if the Optional contains a value.
    // If the Optional is empty, it does nothing.
    public static void ifPresent(){

      //  Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.empty();
        // ifPresent() executes the given action if the Optional contains a value
        studentOptional.ifPresent(student -> {
            System.out.println("Student is present: " + student);
        });
    }
    // This class is a placeholder for demonstrating the use of Optional's isPresent and ifPresent methods.
    public static void main(String[] args) {

        System.out.println("Checking if student is present using isPresent() method:");
        System.out.println("Is student present? " + isPresent());
        System.out.println("-----------------------------------");
        System.out.println("Executing ifPresent() method:");
        ifPresent();
    }
}
