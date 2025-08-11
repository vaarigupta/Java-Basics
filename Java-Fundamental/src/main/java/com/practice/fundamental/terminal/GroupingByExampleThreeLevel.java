package com.practice.fundamental.terminal;

import com.practice.fundamental.data.StudentDataBase;
import com.practice.fundamental.model.Student;

import java.util.*;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toSet;

public class GroupingByExampleThreeLevel {

    //groupingBy is a terminal operation that collects elements into a Map based on a classifier function, use a supplier to create a specific type of Map and a downstream collector to further process the grouped data.
    //TreeMap is a sorted map implementation that maintains the order of keys based on their natural ordering or a specified comparator.
    public static void groupingByNameAndNoteBooks(){

        TreeMap<String,Map<Integer, List<Student>>> students =  StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName,
                        TreeMap::new,
                        groupingBy(Student::getNoteBooks)));

        System.out.println(students);
    }


    //LinkedHashMap is a hash table and linked list implementation of the Map interface, maintaining insertion order.
    public static void groupingByName(){

       LinkedHashMap<String,Set<Student>> students = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName, LinkedHashMap::new,toSet()));

        System.out.println(students);
    }
    public static void main(String[] args) {

        groupingByNameAndNoteBooks();
        System.out.println("---------------------------------");
        groupingByName();
    }
}
