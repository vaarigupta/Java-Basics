package com.practice.fundamental.functionalInterface;

import com.practice.fundamental.data.StudentDataBase;
import com.practice.fundamental.model.Student;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiPredicateExample {

    static BiPredicate<Integer,Double> isGradeLevelAndGpaBiPredicate = (gradeLevel, gpa) ->
            gradeLevel >= 3 && gpa >= 3.5;
    static BiConsumer<String, List<String>> studentNamesAndActivitiesConsumer = (name, activities )->
            System.out.print("Name: " + name + " | Activities: " + activities);
    static BiConsumer<Integer,Double> studentGradeAndGpaConsumer = (gradeLevel,gpa) ->
            System.out.println(" | Grade Level: " + gradeLevel + " | GPA: " + gpa);
    static public void printStudentsBasedOnGradeandGpa(){

        StudentDataBase.getAllStudents().forEach(student -> {
            if(isGradeLevelAndGpaBiPredicate.test(student.getGradeLevel(),student.getGpa())){
                studentNamesAndActivitiesConsumer.accept(student.getName(),student.getActivities());
                studentGradeAndGpaConsumer.accept(student.getGradeLevel(), student.getGpa());
            }
        });
    }

    public static void main(String[] args) {
        printStudentsBasedOnGradeandGpa();
    }
}
