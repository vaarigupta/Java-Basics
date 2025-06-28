package com.practice.fundamental.methodReference;

import com.practice.fundamental.data.StudentDataBase;
import com.practice.fundamental.model.Student;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {


    public static Consumer<Student> printStudent = System.out::println;

    public static Consumer<Student> printStudentActivities = Student::printActivities;


    public static void main(String[] args) {

        StudentDataBase.getAllStudents().forEach(printStudent);
        System.out.println("-------------------");
        StudentDataBase.getAllStudents().forEach(printStudentActivities);
    }
}
