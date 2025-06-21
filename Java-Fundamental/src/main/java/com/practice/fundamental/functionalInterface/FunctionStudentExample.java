package com.practice.fundamental.functionalInterface;

import com.practice.fundamental.data.StudentDataBase;
import com.practice.fundamental.model.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static com.practice.fundamental.functionalInterface.PredicateStudentExample.isGpaGreaterThan3_9;

public class FunctionStudentExample {

    static Function<List<Student>, Map<String,Double>> studentGpaMapFunction = students ->{
        Map<String,Double> stringDoubleMap = new HashMap<>();
        students.forEach(student -> {
            if(isGpaGreaterThan3_9.test(student)){
                stringDoubleMap.put(student.getName(), student.getGpa());
            }
        });
        return stringDoubleMap;
    };

    public static void main(String[] args) {
        System.out.println("Student GPA Map: " + studentGpaMapFunction.apply(StudentDataBase.getAllStudents()));
    }
}
