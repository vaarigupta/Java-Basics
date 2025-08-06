package com.practice.fundamental.terminal;

import com.practice.fundamental.data.StudentDataBase;
import com.practice.fundamental.model.Student;

import java.util.*;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toSet;

public class GroupingByExampleThreeLevel {

    public static void groupingByNameAndNoteBooks(){

        TreeMap<String,Map<Integer, List<Student>>> students =  StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName,
                        TreeMap::new,
                        groupingBy(Student::getNoteBooks)));

        System.out.println(students);
    }

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
