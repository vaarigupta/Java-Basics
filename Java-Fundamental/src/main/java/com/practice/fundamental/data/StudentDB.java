package com.practice.fundamental.data;

import com.practice.fundamental.model.Student;

import java.util.List;

import static com.practice.fundamental.constant.Constant.FEMALE;
import static com.practice.fundamental.constant.Constant.MALE;

public class StudentDB {

    public static List<Student> getAllStudents() {

        Student student1 = new Student("Alice", 20, "A",FEMALE);
        Student student2 = new Student("Bob", 22,  "B" , MALE);
        Student student3 = new Student("Charlie", 21, "C",MALE);
        Student student4 = new Student("Diana", 19, "A",FEMALE);

        List<Student> students = List.of(student1, student2, student3, student4);
        return students;
    }
}
