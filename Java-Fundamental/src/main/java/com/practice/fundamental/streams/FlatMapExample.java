package com.practice.fundamental.streams;

import com.practice.fundamental.data.StudentDataBase;
import com.practice.fundamental.model.Student;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class FlatMapExample {

    // flatMap() is an intermediate operation that flattens a stream of collections into a single stream of elements.
    public  static List<String> getStudentActivities(){

        // Using flatMap to get a list of all activities from all students
       return StudentDataBase.getAllStudents().stream()//making a stream of students (Stream<Student>)
                .map(Student::getActivities)//getting the activities of each student (Stream<List<String>>)
                .flatMap(List::stream) //flattening the stream of lists of activities into a single stream of activities (Stream<String>)
                .collect(toList()); //collecting the stream of activities into a List (List<String>)
    }
    public static void main(String[] args) {

        System.out.println("Student Activities: " + getStudentActivities());
    }
}
