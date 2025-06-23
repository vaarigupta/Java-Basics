package com.practice.fundamental.functionalInterface;

import com.practice.fundamental.data.StudentDataBase;
import com.practice.fundamental.model.Student;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public  static Supplier<Student> studentSupplier = () ->
            new Student("Adam",
                    2,
                    3.6,
                    "male",
                    Arrays.asList("swimming", "basketball","volleyball"));


    public static Supplier<List<Student>> studentListSupplier = () -> StudentDataBase.getAllStudents();
     public static void main(String[] args) {

        Student s1 = studentSupplier.get(); // get a new student object using the supplier
        System.out.println("Student 1: " + s1);

         System.out.println("-----------------------------------");
        List<Student> students = studentListSupplier.get(); // get the list of students using the supplier
        System.out.println("Students List: " + students);
    }
}
