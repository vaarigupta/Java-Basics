package com.practice.fundamental.streams;

import com.practice.fundamental.data.StudentDataBase;
import com.practice.fundamental.model.Student;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {

        Function<Student, String> studentToNameFunction = Student::getName;
        Function<Student, List<String>> studentToActivitiesFunction = Student::getActivities;

        Predicate<Student> gradeLevelPredicate = student -> student.getGradeLevel()>=3;
        Predicate<Student> gpaPredicate = student -> student.getGpa()>=3.9;

        Map<String,List<String>> studentMap = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.toMap(studentToNameFunction
                ,studentToActivitiesFunction));

        System.out.println("Student Map: " + studentMap);

        Map<String,List<String>> studentFilteredMap = StudentDataBase.getAllStudents()
                .stream() //Stream of Students
                .filter(gradeLevelPredicate) //Stream of Students with grade level >= 3
                .filter(gpaPredicate) //Stream of Students with grade level >= 3 and GPA >= 3.9
                .collect(Collectors.toMap(studentToNameFunction
                        ,studentToActivitiesFunction)); //M

        System.out.println("Student filtered Map: " + studentFilteredMap);
    }
}
