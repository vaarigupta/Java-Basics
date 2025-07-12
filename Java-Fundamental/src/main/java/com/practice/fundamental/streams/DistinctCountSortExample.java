package com.practice.fundamental.streams;

import com.practice.fundamental.data.StudentDataBase;
import com.practice.fundamental.model.Student;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class DistinctCountSortExample {

    public static List<String> getStudentActivities(){

       return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .collect(toList());
    }

    public static long getStudentActivitiesCount(){

        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();
    }

    public static List<String> getSortedStudentActivities(){

        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(toList());
    }
    public static void main(String[] args) {

        System.out.println("Distinct Student Activities: " + getStudentActivities());
        System.out.println("Count of Distinct Student Activities: " + getStudentActivitiesCount());
        System.out.println("Sorted Distinct Student Activities: " + getSortedStudentActivities());
    }
}
