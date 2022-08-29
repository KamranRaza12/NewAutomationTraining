package com.telus.java;

import java.util.Scanner;

public class ExceptionHandling {

	// Exception handling using Throw Keyword
	public static void validate(int age) {
		if (age < 18) {
			// throw Arithmetic exception
			throw new ArithmeticException("Person is not eligible to watch the content ");
		} else {
			System.out.println("Person is eligible to watch the content ");
		}
	}

	public static void main(String args[]) {

		// 1. Throw keyword
		try {
			validate(13);
			System.out.println("User age is ");
		} catch (ArithmeticException e) {
			System.out.println("The Error Message is " + e);
		}

		// 2. Array Index out of bounds exceptions
		int[] num = new int[5];
		try {
			num[8] = 15;
			System.out.println(num[8]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Mention the value within the array limit");
			System.out.println("The Error message is - " + e);
		}

		// 3. NullPointer Exception Handling
		String name = null;

		try {
			if (name.contains("Kamran")) {
				System.out.println("String contains the given value");
			} else {
				System.out.println("String does not contains the given value");
			}
		} catch (NullPointerException e) {
			System.out.println("Do not enter the null value");
			System.out.println("The Error message is -" + e);

		}

		// 4. NumberFormat Exception Handling
		String lName = "Raza";
		try {
			int value = Integer.parseInt(lName);
			System.out.println(value);
		} catch (NumberFormatException e) {
			System.out.println("The number format is not correct");
			System.out.println("The Error message is -" + e);

		}

		// 5. Arithmetic Exception Handling
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter componendo  - ");
		int valOne = sc.nextInt();
		System.out.println("Enter dividendo  - ");
		int valTwo = sc.nextInt();
		// int valOne = 19;
		// int valTwo = 0;
		try {
			int division = valOne / valTwo;
			System.out.println("The Division Result - " + division);
		} catch (ArithmeticException e) {
			System.out.println("Do not divide number by zero");
			System.out.println("The error message is - " + e);
		}
		sc.close();

	}

}
