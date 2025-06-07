package com.practice.fundamental.junithelper;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorBeforeAllTest {

    private static Calculator calculator;


    // This method is executed once before all tests in this class.
    // It can be used to initialize static resources or configurations.
    // For example, you can create a single instance of the Calculator class.
    @BeforeAll
    static void setUpAll() {
        calculator = new Calculator();
        System.out.println("Setting up Calculator instance before all tests.");
        System.out.println("-------------------------------------");
    }

    @AfterAll
    static void tearDownAll() {
        calculator = null;
        System.out.println("-------------------------------------");
        System.out.println("Cleaning up Calculator instance after all tests.");
    }

    /**
     * JUnit 5 Test class for Calculator
     * This class contains test methods for the Calculator class.
     * Each method tests a specific operation of the Calculator.
     */
    @Test
    public void addTest(){

        // Calculator calculator = new Calculator();
        int actualResult =  calculator.add(10,20);
        assertEquals(30,actualResult);
        System.out.println("Add test executed successfully.");
    }

    @Test
    public void subtractTest(){

        //Calculator calculator = new Calculator();
        int actualResult =  calculator.subtract(20,10);
        assertEquals(10,actualResult);
        System.out.println("Subtract test executed successfully.");
    }

    @Test
    public void multiplyTest(){

        //Calculator calculator = new Calculator();
        int actualResult =  calculator.multiply(10,20);
        assertEquals(200,actualResult);
        System.out.println("Multiply test executed successfully.");
    }

    @Test
    public void divideTest(){

        //Calculator calculator = new Calculator();
        int actualResult =  calculator.divide(20,10);
        assertEquals(2,actualResult);
        System.out.println("Divide test executed successfully.");
    }
}
