package com.practice.fundamental.junithelper;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {


    private Calculator calculator;


    // This method can be used to set up any common test data or configurations
    // before each test method is executed.
    // For example, you can initialize objects that will be reused in multiple tests.
    // This is a placeholder for setup code.
    @BeforeEach
    void setUp(){
        calculator = new Calculator();
        System.out.println("-------------------------------------");
        System.out.println("Setting up the Calculator instance for each test.");
    }

    // This method can be used to clean up resources or reset states after each test.
    // For example, you can set the calculator object to null if needed.
    @AfterEach
    void tearDown(){
        calculator = null;
        System.out.println("Cleaning up Calculator instance after each test.");
        System.out.println("-------------------------------------");
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
        System.out.println("Add test passed: 10 + 20 = " + actualResult);
    }

    @Test
    public void subtractTest(){

        //Calculator calculator = new Calculator();
        int actualResult =  calculator.subtract(20,10);
        assertEquals(10,actualResult);
        System.out.println("Subtract test passed: 20 - 10 = " + actualResult);
    }

    @Test
    public void multiplyTest(){

        //Calculator calculator = new Calculator();
        int actualResult =  calculator.multiply(10,20);
        assertEquals(200,actualResult);
        System.out.println("Multiply test passed: 10 * 20 = " + actualResult);
    }

    @Test
    public void divideTest(){

        //Calculator calculator = new Calculator();
        int actualResult =  calculator.divide(20,10);
        assertEquals(2,actualResult);
        System.out.println("Divide test passed: 20 / 10 = " + actualResult);
    }
}