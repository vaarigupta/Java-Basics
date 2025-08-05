package com.practice.fundamental.terminal;

import com.practice.fundamental.data.StudentDataBase;
import com.practice.fundamental.model.Student;

import java.util.stream.Collectors;

import static java.util.stream.Collectors.summingInt;

public class SummingAverageIntExample {


    public static int sumOfNoteBooks(){

        return StudentDataBase.getAllStudents()
                .stream().collect(summingInt(Student::getNoteBooks));

    }

    public static double averageOfNoteBooks(){

        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.averagingInt(Student::getNoteBooks));

    }
    public static void main(String[] args) {

        System.out.println("Sum of Notebooks: " + sumOfNoteBooks());
        System.out.println("Average of Notebooks: " + averageOfNoteBooks());
    }
}
