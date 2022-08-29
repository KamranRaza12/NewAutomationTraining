package com.telus.java;
/*
 *Author :  Kamran Raza
 *Project:  Student Grading System
 *Purpose:  This java program is used to explain about if else statement
 *Date   :  21/07/2022
 */
import java.util.Scanner;

public class StudentGrades {

	public static void main(String[] args) {

		/*  
		 * Program to explain student grading system using if else if ladder statement 
		 */

		// Taking value from user
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks = sc.nextInt();

		if(marks >= 80) {
			System.out.println("This student got O Grade");
		}
		else if ((marks<=79) && (marks>=75)) {
			System.out.println("This student got A Grade");
		}
		else if ((marks<=74) && (marks>=70)) {
			System.out.println("This student got B Grade");
		}
		else if ((marks<=69) && (marks>=60)) {
			System.out.println("This student got C Grade");
		}
		else if ((marks<=59) && (marks>=50)) {
			System.out.println("This student got D Grade");
		}
		else if ((marks<=49) && (marks>=45)) {
			System.out.println("This student got E Grade");
		}
		else if ((marks<=44) && (marks>=40)) {
			System.out.println("This student got P Grade");
		}
		else {
			System.out.println("This student got F Grade and is fail");
		}
		sc.close();
	} 
}
