package com.practice.fundamental.terminal;

import com.practice.fundamental.data.StudentDataBase;
import com.practice.fundamental.model.Student;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;

import static java.util.stream.Collectors.*;

public class GroupingByMinMaxCollecting {

    // This class demonstrates how to group students and find the maximum GPA within each grade level.
    // It uses the groupingBy collector to group students by their grade level and then applies maxBy
    // to find the student with the highest GPA in each grade level.
    // The result is a Map where the key is the grade level and the value is an Optional containing the student
    // with the maximum GPA for that grade level.
    public static void groupingMaxBy(){

      Map<Integer, Optional<Student>> students = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        maxBy(Comparator.comparing(Student::getGpa))));
        System.out.println(students);
    }

    // This method demonstrates how to group students by their grade level and find the maximum GPA
    // within each group using collectingAndThen. It collects the maximum GPA student for each grade level
    // and then applies a transformation to handle the case where no student is found (using orElse).
    // The result is a Map where the key is the grade level and the value is the student with the maximum GPA,
    // or a new Student object if no student is found.
    // This is useful for ensuring that the result always contains a valid Student object, even if no students
    // are present in a particular grade level.
    // The use of collectingAndThen allows for a more concise and readable way to handle the Optional result
    public static void groupingMaxByCollectingThen(){

       Map<Integer,Student> students = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        collectingAndThen(maxBy(Comparator.comparing(Student::getGpa)),
                                student -> student.orElse(new Student()))));

        System.out.println(students);
    }

    // This method demonstrates how to group students by their grade level and find the minimum GPA
    // within each group using collectingAndThen. It collects the minimum GPA student for each grade level
    // and then applies a transformation to retrieve the student object directly from the Optional.
    // The result is a Map where the key is the grade level and the value is the student with the minimum GPA.
    // Using minBy allows us to find the student with the lowest GPA in each grade level,
    // and collectingAndThen is used to extract the student from the Optional result.
    public static void groupingMinByCollectingThen(){

    Map<Integer,Student> students =    StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        collectingAndThen(minBy(Comparator.comparing(Student::getGpa)),
                                Optional::get)));

        System.out.println(students);
    }
    public static void main(String[] args) {

        groupingMaxBy();
        System.out.println("---------------------------------");
        groupingMaxByCollectingThen();
        System.out.println("---------------------------------");
        groupingMinByCollectingThen();
    }
}
