package com.practice.fundamental.streams;

import com.practice.fundamental.data.StudentDataBase;
import com.practice.fundamental.model.Student;

import java.util.List;
import java.util.Optional;

public class ReduceExample {


    // This method multiplies all integers in the list using the reduce operation with an identity value of 1. (with identity value)
    public static int multiplyList(List<Integer> values){

       return values.stream()
               //a=1 , b=1(from stream) => result=1
               //a=1, b=2 (from stream)=> result=2
               //a=2 , b=3 (from stream)=> result=6 (a is the result of previous multiplication,or we can say reduced value after each element in the stream))
               //a=6, b=4 (from stream)=> result=24
               //a=24, b=5(from stream) => result=120
                .reduce(1,(a,b) -> a * b);
        //reducing the list to a single value by multiplying all elements using an identity value of 1 which is the multiplicative identity

    }

    // This method multiplies all integers in the list using the reduce operation without an identity value. (without identity value)
    public static Optional<Integer> multiplyListWithoutIdentity(List<Integer> values){

        return values.stream()
                .reduce((a,b) -> a * b);
    }

    public static Optional<Student> getHighestGpaStudent(){
        return StudentDataBase.getAllStudents().stream()
                .reduce((s1,s2) ->s1.getGpa() >s2.getGpa()? s1:s2);
    }
    public static void main(String[] args) {

        List<Integer> values = List.of(1,2,3,4,5);
        int result = multiplyList(values);
        System.out.println("Multiplication of list values: " + result);

        Optional<Integer> resultWithoutIdentity = multiplyListWithoutIdentity(values);
        if (resultWithoutIdentity.isPresent()) {
            System.out.println("Multiplication of list values without identity: " + resultWithoutIdentity.get());
        } else {
            System.out.println("No values to multiply.");
        }

        Optional<Student> highestGpaStudent = getHighestGpaStudent();
        if(highestGpaStudent.isPresent()) {
            System.out.println("Student with highest GPA: " + highestGpaStudent.get());
        } else {
            System.out.println("No students available to determine the highest GPA.");
        }

    }
}
