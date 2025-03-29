package assignment;
import java.util.*;

public class ConditionChecker {
	
	// Check whether a number is divisible by 5 and 11
	static void checkDivisibility(int number) {
		if (number % 5 == 0 && number % 11 == 0) {
			System.out.println("Number " + number + " is divisible by 5 and 11");
		} else {
			System.out.println("Number " + number + " is not divisible by 5 and 11");
		}
	}

	// Check whether a number is even or odd
	static void checkEvenOrOdd(int number) {
		if (number % 2 == 0) {
			System.out.println("Number " + number + " is even");
		} else {
			System.out.println("Number " + number + " is odd");
		}
	}

	// Check whether a year is a leap year or not
	static void checkLeapYear(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is not a leap year");
		}
	}

	// Check whether an alphabet is a vowel or consonant
	static void checkVowelOrConsonant(String letter) {
		letter = letter.toLowerCase();
		String vowels = "aeiou";
		if (vowels.contains(letter)) {
			System.out.println("The letter is a vowel");
		} else {
			System.out.println("The letter is a consonant");
		}
	}

	// Check whether a character is uppercase or lowercase
	static void checkCase(String character) {
		if (character.equals(character.toLowerCase())) {
			System.out.println("Lowercase");
		} else {
			System.out.println("Uppercase");
		}
	}

	// Check if given sides form a triangle
	static void checkTriangleValidity(int sideA, int sideB, int sideC) {
		if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
			System.out.println("This forms a valid triangle");
		} else {
			System.out.println("This does not form a valid triangle");
		}
	}

	// Check profit or loss
	static void checkProfitOrLoss(int costPrice, int sellingPrice) {
		int result = sellingPrice - costPrice;
		if (result > 0) {
			System.out.println("Congrats! You made a profit of " + result + " Rs");
		} else {
			System.out.println("Sorry, you are in loss. Your loss is " + Math.abs(result) + " Rs");
		}
	}

	public static void main(String[] args) {
		checkDivisibility(50);
		checkEvenOrOdd(70);
		checkLeapYear(5000);
		checkVowelOrConsonant("k");
		checkCase("K");
		checkTriangleValidity(20, 50, 80);
		checkProfitOrLoss(20, 40);
	}
}
