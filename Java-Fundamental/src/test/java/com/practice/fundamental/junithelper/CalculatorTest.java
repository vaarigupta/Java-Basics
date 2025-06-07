package com.practice.fundamental.junithelper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {


    @Test
    public void addTest(){

        Calculator calculator = new Calculator();
        int actualResult =  calculator.add(10,20);
        assertEquals(30,actualResult);
    }

    @Test
    public void subtractTest(){

        Calculator calculator = new Calculator();
        int actualResult =  calculator.subtract(20,10);
        assertEquals(10,actualResult);
    }

    @Test
    public void multiplyTest(){

        Calculator calculator = new Calculator();
        int actualResult =  calculator.multiply(10,20);
        assertEquals(200,actualResult);
    }

    @Test
    public void divideTest(){

        Calculator calculator = new Calculator();
        int actualResult =  calculator.divide(20,10);
        assertEquals(2,actualResult);
    }
}