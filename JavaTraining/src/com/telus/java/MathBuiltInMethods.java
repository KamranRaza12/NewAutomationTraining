package com.telus.java;
/*
 *Author :  Kamran Raza
 *Project:  BuiltInMethod
 *Purpose:  This java program is used to explain about Math Methods
 *Date   :  21/07/2022
 */
public class MathBuiltInMethods {

	public static void main(String[] args) {

		int ageOfKamran = 20;
		int ageOfImran = 40;
		int ageOfRaza = -50;
		float areaOfCircle = 30.256f;

		// 1.Mathematical Methods Maximum Age 
		System.out.println("Maximum of two age is " + Math.max(ageOfImran, ageOfKamran));

		// 2.Mathematical Methods Minimum Age 

		System.out.println("Minimum of two age is " + Math.min(ageOfImran, ageOfKamran));

		// 3.Mathematical Methods Absolute Value 

		System.out.println("The Absolute Value is " + Math.abs(ageOfRaza));

		// 4.Mathematical Methods Round of Value 

		System.out.println("Round of value is " + Math.round(areaOfCircle));

		// 5.Mathematical Methods Random Value 

		System.out.println("Random number generated is " + Math.random());

		// 6.To Generate random number between 0 to 100

		int randomNum = (int)(Math.random() * 101);
		System.out.println("Random number between 0 to 100 is " + randomNum);

	}

}
