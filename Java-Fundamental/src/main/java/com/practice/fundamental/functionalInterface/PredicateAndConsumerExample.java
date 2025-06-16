package com.practice.fundamental.functionalInterface;

import com.practice.fundamental.data.StudentDataBase;
import com.practice.fundamental.model.Student;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    static Predicate<Student> isGradeLevelGreaterThan3 = student -> student.getGradeLevel()>=3;
    static Predicate<Student> isGPAGreaterThan3_5 = student -> student.getGpa()>=3.5;

    static Predicate<Student> isGradeLevelAndGpa = isGradeLevelGreaterThan3.and(isGPAGreaterThan3_5);
    static BiConsumer<String, List<String>> studentNamesAndActivitiesConsumer = (name,activities )->
            System.out.print("Name: " + name + " | Activities: " + activities);
    static BiConsumer<Integer,Double> studentGradeAndGpaConsumer = (gradeLevel,gpa) ->
            System.out.println(" | Grade Level: " + gradeLevel + " | GPA: " + gpa);
    static public void printStudentsBasedOnGradeandGpa(){

        StudentDataBase.getAllStudents().forEach(student -> {
            if(isGradeLevelAndGpa.test(student)){
                studentNamesAndActivitiesConsumer.accept(student.getName(),student.getActivities());
                studentGradeAndGpaConsumer.accept(student.getGradeLevel(), student.getGpa());
            }
        });
    }

    public static void main(String[] args) {
        printStudentsBasedOnGradeandGpa();
    }
}
