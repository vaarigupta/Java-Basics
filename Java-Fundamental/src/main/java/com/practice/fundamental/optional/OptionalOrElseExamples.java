package com.practice.fundamental.optional;

import com.practice.fundamental.data.StudentDataBase;
import com.practice.fundamental.model.Student;

import java.util.Optional;

public class OptionalOrElseExamples
{
    // This method demonstrates the use of Optional's orElse method to provide a default value
    // orElse is used to return a value if the Optional is empty.
    // If the Optional contains a value, it returns that value; otherwise, it returns the specified default value present in orElse.
    public static String getNameUsingOrElse(){
       // Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.empty();
        // If student is present, return the name, otherwise return "Unknown"
        return studentOptional.map(Student::getName)
                .orElse("No name found");
    }

    // This method demonstrates the use of Optional's orElseGet method to provide a default value
    // orElseGet is used to return a value if the Optional is empty, but it allows for a supplier function to generate the default value.
    // If the Optional contains a value, it returns that value; otherwise, it calls the supplier function to generate the default value.
    public static String getNameUsingOrElseGet(){

        //Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.empty();

        return studentOptional.map(Student::getName)
                .orElse("No name found using orElseGet");
        //      .orElseGet(() -> "No name found using orElseGet");
    }

    // This method demonstrates the use of Optional's orElseThrow method to throw an exception if the Optional is empty.
    // orElseThrow is used to throw an exception if the Optional is empty.
    // If the Optional contains a value, it returns that value; otherwise, it throws the specified exception.
    public static String getNameUsingOrElseThrow(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
     //   Optional<Student> studentOptional = Optional.empty();

        return studentOptional.map(Student::getName)
                .orElseThrow(() -> new RuntimeException("No name found using orElseThrow"));
    }


    // This method demonstrates the use of Optional's orElseThrow method to throw an exception if the Optional is empty.
    // orElseThrow without a supplier will throw NoSuchElementException if the Optional is empty.
    // If the Optional contains a value, it returns that value; otherwise, it throws NoSuchElementException.
    public static String getNameUsingOrElseThrowNoSupplier(){
      //  Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
           Optional<Student> studentOptional = Optional.empty();

        return studentOptional.map(Student::getName)
                .orElseThrow();
    }
    public static void main(String[] args) {

        System.out.println("Name using orElse: " + getNameUsingOrElse());
        System.out.println("Name using orElseGet: " + getNameUsingOrElseGet());
        System.out.println("Name using orElseThrow: " + getNameUsingOrElseThrow());
        System.out.println("Name using orElseThrow without supplier: " + getNameUsingOrElseThrowNoSupplier());
    }
}
