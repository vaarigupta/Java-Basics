package com.practice.fundamental.streams;

import com.practice.fundamental.data.StudentDataBase;
import com.practice.fundamental.model.Student;

import java.util.List;

public class MapFilterReduceExample {

    // This class demonstrates the use of map, filter, and reduce operations on a stream of students.
    public static int countStudentActivities(){

        return StudentDataBase.getAllStudents()
                .stream()
                .map(student -> student.getActivities().size()) // Map each student to the size of their activities list
                .reduce(0, Integer::sum); // Reduce the stream of activity counts to a single sum
    }

    public static int countStudentNoteBooks(){

        return StudentDataBase.getAllStudents()
                .stream() // Stream of Students
                .filter(student -> student.getGradeLevel()>=3)// Filter students with grade level >= 3
                .filter(student -> student.getGender().equals("female")) //filter students whose gender is female
                .map(Student::getNoteBooks) // Map each student to the number of notebooks they have
                .reduce(0,Integer::sum); // Reduce the stream of noteBooks to a single sum
    }
    // This class is a placeholder for the Map, Filter, and Reduce example.
    public static void main(String[] args) {

        System.out.println("Total number of activities across all students: " + countStudentActivities());
        System.out.println("Total number of notebooks for students with grade level >= 3: " + countStudentNoteBooks());
    }
}
