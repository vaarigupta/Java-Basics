package com.practice.fundamental.suite;


import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
//@SelectClasses(com.practice.fundamental.junithelper.CalculatorTest.class)
//@SelectClasses({
//        com.practice.fundamental.junithelper.CalculatorTest.class,
//        com.practice.fundamental.junithelper.CalculatorBeforeAllTest.class})
//@SelectPackages("com.practice.fundamental.junithelper")
@SelectPackages({
        "com.practice.fundamental.junithelper",
        "com.practice.fundamental.suite"})
public class TestSuite {


}
