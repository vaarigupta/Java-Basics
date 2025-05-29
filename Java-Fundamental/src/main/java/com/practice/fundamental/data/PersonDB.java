package com.practice.fundamental.data;

import com.practice.fundamental.model.Person;

import java.util.List;

import static com.practice.fundamental.constant.Constant.FEMALE;
import static com.practice.fundamental.constant.Constant.MALE;

public class PersonDB {

    public static List<Person> getAllPersons() {

       Person person1 = new Person("Alice", 20, "A",FEMALE);
       Person person2 = new Person("Bob", 22,  "B" , MALE);
       Person person3 = new Person("Charlie", 21, "C",MALE);
       Person person4 = new Person("Diana", 19, "A",FEMALE);

        List<Person>persons = List.of(person1,person2,person3,person4);
        return persons;
    }
}
