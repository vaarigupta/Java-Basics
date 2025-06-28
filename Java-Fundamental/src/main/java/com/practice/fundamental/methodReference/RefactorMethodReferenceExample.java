package com.practice.fundamental.methodReference;

import com.practice.fundamental.data.StudentDataBase;
import com.practice.fundamental.model.Student;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {

    // Using method reference to check if the student is in grade level 2 or above
    public static Predicate<Student> p1 =RefactorMethodReferenceExample::studentGradeLevelCheck;

    //Created a separate method that checks if the student is in grade level 2 or above
    public static boolean studentGradeLevelCheck(Student s){
        return s.getGradeLevel()>=2;
    }
    public static void main(String[] args) {
        System.out.println(p1.test(StudentDataBase.studentSupplier.get())); // Using method reference to check if the student is in grade level 3 or above
    }
}
