package com.modernjava.enhancedswitch;

import java.time.Month;
import java.time.Year;

public class DaysInMonth {
    public static int getDays(Month month, int year) {
        int noOfDays = 0;
        switch (month) {
            case SEPTEMBER:
            case APRIL:
            case JUNE:
            case NOVEMBER:
                noOfDays = 30;
                //return noOfDays;
                break;
            case FEBRUARY: // this is a code block;
                System.out.println("Checking if " + year + " is a leap year");
                noOfDays = Year.isLeap(year) ? 29 : 28;
                //  return noOfDays;
                break;

            default:
                noOfDays = 31;
        }
        return noOfDays;

    }

    //enhanced switch is an expression and can return a value directly
    // we can use the arrow syntax to define a case and the value to be returned
    // we don't need a break statement in the arrow syntax
    //This is more concise and readable than the traditional switch statement
    // we can also use a code block to define multiple statements in a case
    // in a code block we must use yield to return a value instead of return
    // yield must be the last statement in the code block
    public static int getDaysV2(Month month,int year){
        return switch(month){
            case APRIL,JUNE,SEPTEMBER,NOVEMBER->30;
           // case FEBRUARY -> Year.isLeap(year)?29:28;
            //multiple statements in a case block must be enclosed in {} like a method body and use yield to return a value instead of return
            //yield must be the last statement in the code block, we cannot have any statement after yield in the code block
            case FEBRUARY -> {
                System.out.println("Checking if " + year + " is a leap year");
                //yield is used to return a value from a code block
                // return can not be used here
                // yield must be the last statement in the code block
                yield Year.isLeap(year)?29:28;

            }
            default -> 31;
        };
    }

    // This is the exhaustive nature of the switch expression
    // we don't need a default case if we have covered all the cases
    //here we have covered all the months so, switch expression is complete, it won't show any warning like a regular switch statement
    public static int getDaysV3(Month month, int year){
        return switch(month){
          case APRIL, JUNE, SEPTEMBER, NOVEMBER -> 30;
          case FEBRUARY -> Year.isLeap(year) ? 29 : 28;
          case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> 31;
        };
    }
}
