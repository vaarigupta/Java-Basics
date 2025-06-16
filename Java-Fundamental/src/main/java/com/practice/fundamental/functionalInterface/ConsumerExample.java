package com.practice.fundamental.functionalInterface;

import com.practice.fundamental.data.StudentDataBase;
import com.practice.fundamental.model.Student;

import java.util.function.Consumer;

public class ConsumerExample {

    //putting the Consumer functional interface to reuse and remove redundancy and duplicate code
    static Consumer<Student> studentConsumer = (student) -> System.out.println(student);
    static Consumer<Student> studentNameConsumer = (student) -> System.out.println("Name:" + student.getName());
    static Consumer<Student> studentActivitiesConsumer = (student) -> System.out.println("Activities: " + student.getActivities());
    static Consumer<Student> studentFilteredConsumer = (student) ->{
        if(student.getGradeLevel()>=3 && student.getGpa()>=3.9){
            studentNameConsumer.andThen(studentActivitiesConsumer).accept(student); //Consumer chaining using "andThen" method
        }
    };

    // conventional way of implementing Consumer functional interface
    static Consumer<Student> studentGenderConsumer = new Consumer<Student>() {
        @Override
        public void accept(Student student) {
            //student.getGender();
            System.out.println(student.getName() +  " -> " + student.getGender());
        }
    };
    public static  void printStudents(){
        // Using Consumer to print students
        System.out.println("Printing students list:");
        StudentDataBase.getAllStudents().forEach(studentConsumer);
    }

    public static void printStudentNamesAndActivities() {
      // Using Consumer to print student names and activities
      System.out.println("Printing student names and activities:");
      StudentDataBase.getAllStudents().forEach(studentNameConsumer.andThen(studentActivitiesConsumer)); //consumer chaining using "andThen" method
    }

    public static void printNamesAndActivitiesUsingConditions() {
        // Using Consumer to print student names and activities based on conditions
        System.out.println("Printing student names and activities based on conditions:");
        StudentDataBase.getAllStudents().forEach(studentFilteredConsumer);
    }
    public static void main(String[] args) {

        // Example of using a Consumer functional interface
        Consumer<String> consumer = (str) -> System.out.println("Consuming: " + str);
        consumer.accept("vaari");
        System.out.println("-----------------------------------");

        // Using Consumer to print students
        printStudents();
        System.out.println("-----------------------------------");

        // Using Consumer to print student names and activities
        printStudentNamesAndActivities();
        System.out.println("-----------------------------------");

        // Using Consumer to print student names and activities based on conditions
        printNamesAndActivitiesUsingConditions();
        System.out.println("-----------------------------------");

        // Using Consumer to print Gender of the first student
        studentGenderConsumer.accept(StudentDataBase.getAllStudents().get(0));
    }
}
