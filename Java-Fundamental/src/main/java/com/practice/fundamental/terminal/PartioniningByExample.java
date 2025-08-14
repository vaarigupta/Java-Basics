package com.practice.fundamental.terminal;

import com.practice.fundamental.data.StudentDataBase;
import com.practice.fundamental.model.Student;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toSet;

public class PartioniningByExample {


    // This class demonstrates how to partition a list of students based on their GPA using partitioningBy collector.
    // The partitioningBy collector is used to divide the stream into two groups based on a predicate.
    // In this case, students are partitioned into two groups: those with a GPA greater than or equal to 3.9 and those with a GPA less than 3.9.
    // The output will show two partitions: one for students with GPA >= 3.9 and another for those with GPA < 3.9 where key is Boolean and value is List<Student>.
    public static void partitioningByGPA(){

     Map<Boolean, List<Student>> students = StudentDataBase.getAllStudents()
                .stream()
                .collect(partitioningBy(student -> student.getGpa()>=3.9));

        System.out.println(students);
    }

    public static void  partitioningByGenderToSet(){

        Map<Boolean, Set<Student>> students = StudentDataBase.getAllStudents()
                .stream()
                .collect(partitioningBy(student->student.getGender().equals("female"),
                        toSet()));

        System.out.println(students);
    }
    public static void main(String[] args) {

        // The output will show two partitions: one for students with GPA >= 3.9 and another for those with GPA < 3.9.
        partitioningByGPA();
        System.out.println("---------------------------------");
        partitioningByGenderToSet();

    }
}
