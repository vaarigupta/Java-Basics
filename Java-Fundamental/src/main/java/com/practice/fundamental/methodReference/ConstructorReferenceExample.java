package com.practice.fundamental.methodReference;

import com.practice.fundamental.data.StudentDataBase;
import com.practice.fundamental.model.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceExample {

    // This is a constructor reference. It refers to the constructor of the Student class.
    // It can be used to create a new instance of the Student class without needing to call the constructor explicitly.
    // This is useful when you want to create a new instance of a class without needing to pass any arguments to the constructor.
    // It can be used in functional programming contexts, such as when you want to create a new instance of a class in a functional interface.
    // For example, you can use it to create a new instance of the Student class in a lambda expression or a method reference.
    // This is a functional interface that has a single abstract method that returns an instance of the Student class.
    public  static Supplier<Student> studentSupplier = Student::new;

    public static Function<Student,Student> studentFunction = Student::new;

    public static void main(String[] args) {

        // Using the constructor reference to create a new instance of the Student class
        System.out.println("Student: " + studentSupplier.get());// get a new student object using the supplier
        // Using the constructor reference to create a new instance of the Student class with a parameter
        Student student = StudentDataBase.studentSupplier.get();

        System.out.println("Student using Function: " + studentFunction.apply(student)); // get a new student object using the function

    }
}
