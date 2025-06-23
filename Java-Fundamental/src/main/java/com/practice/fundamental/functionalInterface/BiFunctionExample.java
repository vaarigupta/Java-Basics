package com.practice.fundamental.functionalInterface;

import com.practice.fundamental.data.StudentDataBase;
import com.practice.fundamental.model.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    public static BiFunction<List<Student>, Predicate<Student>, Map<String,Double>> studentGpaMapFunction = ((students, studentPredicate) -> {
        Map<String,Double> studentGpaMap = new HashMap<>();

        students.forEach( student -> {
            if(studentPredicate.test(student)){
                studentGpaMap.put(student.getName(), student.getGpa());
            }
        });
        return studentGpaMap;
    });

    public static void main(String[] args) {

        Map<String,Double> studentGpaMap = studentGpaMapFunction.apply(StudentDataBase.getAllStudents(),PredicateStudentExample.isGpaGreaterThan3_9);
        Map<String,Double> studentGpaMap1 = studentGpaMapFunction.apply(StudentDataBase.getAllStudents(),PredicateStudentExample.isGradeLevelGreaterThan4);
        System.out.println("Student GPA Map: " + studentGpaMap);
        System.out.println("Student GPA Map1: " + studentGpaMap1);
    }
}
