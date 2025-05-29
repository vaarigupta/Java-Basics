package com.practice.fundamental.streams;

import com.practice.fundamental.data.PersonDB;
import com.practice.fundamental.model.Person;

import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsDemo {

    public static void main(String[] args) {

        Predicate<Person> studentPredicate = student -> student.getAge()>20;

        Map<String,String> studentGradesMap = PersonDB.getAllPersons()
                .stream()
                .collect(Collectors.toMap(Person::getName, Person::getGrade));

        System.out.println("Person Grades Map: " + studentGradesMap);

        Map<String,Integer> studentGradesMap1 = PersonDB.getAllPersons()
                .stream()
                .filter(studentPredicate)
                .collect(Collectors.toMap(Person::getName, Person::getAge));

        System.out.println("Person Grades Map using filter: " + studentGradesMap1);
    }
}
