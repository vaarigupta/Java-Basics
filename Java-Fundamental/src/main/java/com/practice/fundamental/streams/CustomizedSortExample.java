package com.practice.fundamental.streams;

import com.practice.fundamental.data.StudentDataBase;
import com.practice.fundamental.model.Student;

import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class CustomizedSortExample {

    //sorted() is a terminal operation that sorts the elements of the stream based on the provided comparator.
    //Comparators are used to define the order in which elements should be sorted.
    //Comparator.comparing() is a static method that creates a comparator based on the specified key extractor function.
    public static List<Student> sortStudentsByName() {
        // Implementation for sorting students by name

      return  StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(toList());
    }

    public static List<Student> sortStudentsByGPA() {
        // Implementation for sorting students by name

        return  StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(toList());
    }

    public static List<Student> sortStudentsByGPADesc() {
        // Implementation for sorting students by name

        return  StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(toList());
    }
    public static void main(String[] args) {

        System.out.println("Students sorted by name: ");
        sortStudentsByName().forEach(System.out::println);

        System.out.println("Students sorted by GPA: ");
        sortStudentsByGPA().forEach(System.out::println);

        System.out.println("Students sorted by GPA in descending order: ");
        sortStudentsByGPADesc().forEach(System.out::println);
    }
}
