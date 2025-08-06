package com.practice.fundamental.terminal;

import com.practice.fundamental.data.StudentDataBase;
import com.practice.fundamental.model.Student;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class GroupingByExample {


    // This class demonstrates how to group students based on different criteria using Java Streams.
    //groupingBy is a terminal operation that collects elements into a Map based on a classifier function.
    // // It can be used to group by a single attribute or a customized condition.
    // The examples below show how to group students by gender, grade level, and GPA.
    public static void groupingByBasedOnGender(){

       Map<String, List<Student>> students =   StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGender));

        System.out.println(students);
    }

    public static void groupingByBasedOnCustomizedCondition(){

        Map<String,List<Student>> students = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(student -> {
                    int grade = student.getGradeLevel();
                    return switch (grade) {
                        case 1 -> "Freshman";
                        case 2 -> "Sophomore";
                        case 3 -> "Junior";
                        case 4 -> "Senior";
                        default -> "Unknown";
                    };
                }
            ));

        System.out.println(students);
    }

    public static void groupingByBasedOnCustomizedCondition1(){

     Map<String,List<Student>> students = StudentDataBase.getAllStudents()
                     .stream()
                             .collect(groupingBy(student -> student.getGpa()>=3.8?"Outstanding":"Average"));
        System.out.println(students);
    }
    public static void main(String[] args) {

       // groupingByBasedOnGender();
      //  groupingByBasedOnCustomizedCondition();
        groupingByBasedOnCustomizedCondition1();
    }
}
