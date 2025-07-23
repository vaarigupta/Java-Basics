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

    //only intermediate operations are considered as stateless or stateful operations not terminal operations
    //In this case, distinct() and sorted() are stateful operations because they require maintaining state from previously processed elements in the stream to determine uniqueness and order, respectively.
    //map() and flatMap() are stateless operations because they do not require any state from previous elements to produce their output.
    public static List<String> getUniqueStudentActivities() {

        // Using flatMap to get a unique list of all activities from all students
        return StudentDataBase.getAllStudents()
                .stream()// making a stream of students (Stream<Student>)
                .map(Student::getActivities)// getting the activities of each student (Stream<List<String>>), stateless operation
                .flatMap(List::stream)//flattening the stream of lists of activities into a single stream of activities (Stream<String>), stateless operation
                .distinct()// removing duplicate activities (Stream<String>), stateful operation
                .sorted()// sorting the activities in natural order (Stream<String>) , stateful operation
                .collect(toList()); // collecting the stream of unique activities into a List (List<String>)
    }
    public static void main(String[] args) {

        System.out.println("Student Activities: " + getStudentActivities());
        System.out.println("Unique Student Activities: " + getUniqueStudentActivities());
    }
}
