package assignment;

import java.util.*;

/* questions 
 * 1. WAP to print default value of all the data types. 
(Byte, short, int, long, float, double, char) 
2. WAP to print value of static and instance variable from same class. 
3. WAP to print value of static and instance variable from other class. 
4. WAP to print sum of two numbers using static method in same class. 
5. WAP to print multiplication of two numbers using static method in other 
class. 
6. WAP for four method category and take float as return type for last 
category and take 2 arguments as float and return the multiplication of 
two numbers which took as argument. 
7. WAP for method chaining.
 */

//WAP to print value of static and instance variable from other class.
class ThirdClass {
    static int staticVariable = 5;
    int instanceVariable = 10;
}


// 5. WAP to print multiplication of two numbers using static method in other class
class MultiplicationUtility {
    static int multiply(int num1, int num2) {
        return num1 * num2;
    }
}

class SumUtility {
    static void printSum() {
        int num1 = 5;
        int num2 = 6;
        System.out.println(num1 + num2);
    }
}

public class BasicAssignment {

    // Default values of primitive data types
    static byte defaultByte;
    static short defaultShort;
    static int defaultInt;
    static long defaultLong;
    static float defaultFloat;
    static double defaultDouble;
    static char defaultChar;

    // Static and instance variables
    static int staticVariable = 5;
    int instanceVariable = 10;
    
    // WAP to print sum of two numbers using static method in same class
    static int sum(int num1, int num2) {
        return num1 + num2;
    }

    // Different method types

    void printSum() {
        int num1 = 5;
        int num2 = 10;
        System.out.println(num1 + num2);
    }

    void printMultiplication(float num1, float num2) {
        System.out.println(num1 * num2);
    }

    float returnMultiplication() {
        return 5 * 7;
    }

    float multiplyAndReturn(float num1, float num2) {
        return num1 * num2;
    }

    // Method chaining
    void firstMethod() {
        System.out.println("This is the first method");
    }

    void secondMethod() {
        System.out.println("This is the second method");
        firstMethod();
    }

    void thirdMethod() {
        System.out.println("This is the third method");
        secondMethod();
    }

    void fourthMethod() {
        System.out.println("This is the fourth method");
        thirdMethod();
    }

    public static void main(String[] args) {
        // Printing static and instance variables
        System.out.println(staticVariable);

        BasicAssignment obj = new BasicAssignment();
        System.out.println(obj.instanceVariable);

        // Accessing variables from another class
        ThirdClass thirdObj = new ThirdClass();
        System.out.println(ThirdClass.staticVariable);
        System.out.println(thirdObj.instanceVariable);

        // Sum of two numbers using static method in the same class
        System.out.println(sum(5, 6));

        // Multiplication using static method from another class
        System.out.println(MultiplicationUtility.multiply(5, 6));

        obj.printSum();
        obj.printMultiplication(5, 6);
        System.out.println(obj.returnMultiplication());
        System.out.println(obj.multiplyAndReturn(7.0f, 9.0f));

        // Printing default values
        System.out.println("Default value of byte: " + defaultByte);
        System.out.println("Default value of short: " + defaultShort);
        System.out.println("Default value of int: " + defaultInt);
        System.out.println("Default value of long: " + defaultLong);
        System.out.println("Default value of float: " + defaultFloat);
        System.out.println("Default value of double: " + defaultDouble);
        System.out.println("Default value of char: " + defaultChar);
    }
}
