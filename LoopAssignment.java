package assignment;

public class LoopAssignment {
    
    // Method to print a decreasing star pattern
    static void printDecreasingStarPattern() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j <= 1; j++) {
                if (i != 4 && i != 5)
                    System.out.println("**********");
                if (i == 4)
                    System.out.println("*******");
                if (i == 5)
                    System.out.println("***");
            }
        }
    }

    // Method to print a right-angled triangle pattern
    static void printRightAngledTriangle() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Method to print an inverted right-angled triangle pattern
    static void printInvertedTriangle() {
        for (int i = 5; i >= 1; i--) {
            for (int j = 0; j <= 5; j++) {
                if (i <= j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    // Method to print a pyramid pattern
    static void printPyramidPattern() {
        for (int j = 1; j <= 4; j++) {
            for (int k = 4; k >= j; k--) {
                System.out.print(" ");
            }
            for (int l = 1; l <= j; l++) {
                System.out.print("*");
            }
            for (int m = 2; m <= j; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Method to print a pyramid pattern with numbers
    static void printNumberPyramid() {
        for (int j = 1; j <= 4; j++) {
            for (int k = 4; k >= j; k--) {
                System.out.print(" ");
            }
            for (int l = 1; l <= j; l++) {
                System.out.print(j);
            }
            for (int m = 2; m <= j; m++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // Method to calculate and print the factorial of 20
    static void calculateFactorial() {
        int number = 20;
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }

    // Method to calculate and print the sum of even and odd numbers from 0 to 100
    static void calculateEvenOddSum() {
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }
        System.out.println("Even Sum: " + evenSum);
        System.out.println("Odd Sum: " + oddSum);
    }

    // Method to check if a number is prime
    static void checkPrimeNumber() {
        int number = 37;
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }

    // Method to print Fibonacci series up to a given number of terms
    static void printFibonacciSeries() {
        int terms = 8;
        int first = 0;
        int second = 1;
        int next;
        
        if (terms <= 0) {
            System.out.println("Enter a valid number");
        } else if (terms == 1) {
            System.out.println("0");
        } else if (terms == 2) {
            System.out.println("0\n1");
        } else {
            System.out.println("0\n1");
            for (int j = 1; j < terms - 1; j++) {
                next = first + second;
                System.out.println(next);
                first = second;
                second = next;
            }
        }
    }

    // Method to calculate and print the HCF of two numbers
    static void calculateHCF() {
        int num1 = 5200;
        int num2 = 2548;
        int hcf = 0;
        int min = Math.min(num1, num2);
        
        for (int i = 1; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }
        System.out.println(hcf);
    }

    // Method to calculate the sum of a series
    static void calculateSeriesSum() {
        float sum = 0;
        int terms = 50;
        
        for (int i = 1; i <= terms; i++) {
            sum += 1.0f / i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        printDecreasingStarPattern();
        printRightAngledTriangle();
        printInvertedTriangle();
        printPyramidPattern();
        printNumberPyramid();
        calculateFactorial();
        calculateEvenOddSum();
        checkPrimeNumber();
        printFibonacciSeries();
        calculateHCF();
        calculateSeriesSum();
    }
}
