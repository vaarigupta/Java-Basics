package com.practice.fundamental.streams;

import com.practice.fundamental.data.StudentDataBase;
import com.practice.fundamental.model.Student;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class DistinctCountSortExample {

    //distinct() is an intermediate operation that filters out duplicate elements from the stream.
    //collect() is a terminal operation that collects the elements of the stream into a collection, such as a List or Set.
    public static List<String> getStudentActivities(){

       return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .collect(toList());
    }

    //count() is a terminal operation that returns the number of elements in the stream.
    public static long getStudentActivitiesCount(){

        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();
    }

    //sorted() is a intermediate operation that sorts the elements of the stream in natural order or according to a specified comparator.
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
