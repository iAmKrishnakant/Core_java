package assignment;

import java.util.Scanner;



public class OOPConcepts {
    
    static class InsufficientBalanceException extends Exception {
        InsufficientBalanceException(String message) {
            super(message);
        }
    }
    
    // Question 1
    static class Rectangle {
        private float length;
        private float breadth;

        public void setDimensions(float length, float breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        public float calculateArea() {
            return length * breadth;
        }
    }

    // Question 2
    static class Triangle {
        Triangle(int sideA, int sideB, int sideC) {
            int totalArea = sideA * sideB * sideC;
            System.out.println("Total area is " + totalArea);
            int perimeter = sideA + sideB + sideC;
            System.out.println("Perimeter is " + perimeter);
        }
    }

    // Question 3
    static class BankAccount {
        int balance = 0;

        void setBalance(int initialBalance) {
            this.balance = initialBalance;
        }

        int deposit(int depositAmount) {
            balance += depositAmount;
            return balance;
        }

        int withdraw(int withdrawalAmount) throws InsufficientBalanceException {
            if (balance > withdrawalAmount) {
                return balance - withdrawalAmount;
            } else {
                throw new InsufficientBalanceException("Your balance is lower than the withdrawal amount.");
            }
        }

        static class SavingsAccount extends BankAccount {
            @Override
            int withdraw(int withdrawalAmount) throws InsufficientBalanceException {
                if (balance - withdrawalAmount > 100) {
                    return balance - withdrawalAmount;
                } else {
                    throw new InsufficientBalanceException("You must maintain a minimum balance of 100 Rs.");
                }
            }
        }
    }

    // Question 4
    static class Vehicle {
        private String make;
        private String model;
        private int year;
        private String fuelType;
        private float distanceCovered;
        private float fuelUsed;

        public void setMake(String make) {
            this.make = make;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public void setFuelType(String fuelType) {
            this.fuelType = fuelType;
        }

        public void setDistanceCovered(float distanceCovered) {
            this.distanceCovered = distanceCovered;
        }

        public void setFuelUsed(float fuelUsed) {
            this.fuelUsed = fuelUsed;
        }

        public String getMake() {
            return make;
        }

        public String getModel() {
            return model;
        }

        public int getYear() {
            return year;
        }

        public String getFuelType() {
            return fuelType;
        }

        public float getDistanceCovered() {
            return distanceCovered;
        }

        public float getFuelUsed() {
            return fuelUsed;
        }
    }

    static class Truck extends Vehicle {
        float calculateMaxSpeed(float enginePower, float weight) {
            return (enginePower * enginePower) / 100;
        }

        float calculateFuelEfficiency() {
            return getDistanceCovered() / getFuelUsed();
        }
    }

    static class Car extends Vehicle {
        float calculateMaxSpeed(float enginePower, float weight) {
            return (enginePower * enginePower) / 100;
        }

        float calculateFuelEfficiency() {
            return getDistanceCovered() / getFuelUsed();
        }
    }

    static class Motorcycle extends Vehicle {
        float calculateMaxSpeed(float enginePower, float weight) {
            return (enginePower * weight) / 100;
        }

        float calculateFuelEfficiency() {
            return getDistanceCovered() / getFuelUsed();
        }
    }

    // Question 5
    static class ShapeAreaCalculator {
        void calculateArea(float radius) {
            System.out.println(3.14f * radius * radius);
        }

        void calculateArea(int sideLength) {
            System.out.println(sideLength * sideLength);
        }

        void calculateArea(int height, int base) {
            System.out.println(0.5 * height * base);
        }

        void calculateArea(int sideA, int sideB, int height) {
            System.out.println(0.5 * (sideA + sideB) * height);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Question 1 Execution
        Rectangle rectangle = new Rectangle();
        System.out.println("Enter length:");
        float length = scanner.nextFloat();
        System.out.println("Enter breadth:");
        float breadth = scanner.nextFloat();
        rectangle.setDimensions(length, breadth);
        System.out.println("Area of rectangle is " + rectangle.calculateArea());

        // Question 2 Execution
        Triangle triangle = new Triangle(3, 4, 5);

        // Question 3 Execution
        BankAccount.SavingsAccount savingsAccount = new BankAccount.SavingsAccount();
        savingsAccount.setBalance(55);
        savingsAccount.deposit(10004);
        try {
            System.out.println(savingsAccount.withdraw(500));
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        // Question 4 Execution
        Truck truck = new Truck();
        truck.setMake("02-02-2004");
        truck.setModel("New 07");
        truck.setYear(9636);
        truck.setDistanceCovered(100);
        truck.setFuelUsed(10);
        truck.setFuelType("Petrol");

        System.out.println(truck.getMake());
        System.out.println(truck.getModel());
        System.out.println(truck.getYear());
        System.out.println(truck.getDistanceCovered());
        System.out.println(truck.getFuelUsed());
        System.out.println(truck.getFuelType());
        System.out.println(truck.calculateMaxSpeed(55, 44));
        System.out.println(truck.calculateFuelEfficiency());

        // Question 5 Execution
        ShapeAreaCalculator shapeAreaCalculator = new ShapeAreaCalculator();
        shapeAreaCalculator.calculateArea(88f);
    }
}




/*
 * 1. Write a program to print the area of a rectangle by creating a class 
named 'Area' having two methods. First method named as 'setDim' takes 
length and breadth of rectangle as parameters and the second method 
named as 'getArea' returns the area of the rectangle. Length and breadth 
of rectangle are entered through keyboard. 
2. Write a program to print the area and perimeter of a triangle having 
sides of 3, 4 and 5 units by creating a class named 'Triangle' with 
parameters in its constructor. 
3. Write a Java program to create a class known as "BankAccount" with 
methods called deposit() and withdraw(). Create a subclass called 
SavingsAccount that overrides the withdraw() method to prevent 
withdrawals if the account balance falls below one hundred. 
4. Write a Java program to create a vehicle class hierarchy. The base class 
should be Vehicle, with subclasses Truck, Car and Motorcycle. Each 
subclass should have properties such as make, model, year, and fuel 
type. Implement methods for calculating fuel efficiency, distance 
traveled, and maximum speed. 
5. Write program for method overloading and create class as AreaOfShape 
and create same method area for circle, square, triangle and trapezoid. 
Formulas: 
1) Circle 
Area = π × r2 
r = radius 
2) Square 
Area = a2 
a = length of side 
3) Triangle 
Area = ½ × b × h 
b = base 
h = vertical height 
4) Trapezoid (US) 
Area = ½(a+b) × h 
h = vertical height
*/
