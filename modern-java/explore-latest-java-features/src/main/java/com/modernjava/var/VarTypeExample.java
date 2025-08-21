package com.modernjava.var;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class VarTypeExample {




    //var is used for type inference, allowing the compiler to determine the type of the variable based on the assigned value.
    //However, it cannot be used as a variable name or in method parameters.
    //The var keyword can only be used for local variables, not for class fields or method parameters.
    //var in the class fields are not allowed.
    //private var x = "abc";
    public static void main(String[] args) {

        var list = List.of("Vaari","Raavi");
        System.out.println("list : " + list);

        System.out.println("--------------------");
        for(var name : list){
            System.out.println("name : " + name);
        }

        System.out.println("--------------------");
        var map = Map.ofEntries(Map.entry("v",List.of("Vaari","Vaahi")),
                Map.entry("r",List.of("Raavi","Rajat")));

        System.out.println("map : " + map);

        System.out.println("--------------------");
        for(var entry: map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("--------------------");

        var name = transform("vaari");
        System.out.println("Transformed name : " + name);

        //Limitations of var:

       // var x = null; // This is not allowed, as var cannot be assigned with null value
        var var = "abc"; // This is still allowed, as var is not a reserved keyword in Java and can be used as a variable name
        System.out.println("var : " + var);

        var value = "vaari";
        //value = 5; //This is not allowed, as var is a final variable and cannot be reassigned and we cannot change the type of a var variable after it has been assigned a value.

    }

    static String transform(String name) { // var in the method parameter is not allowed

        return name.toUpperCase();

    }

}

