package com.telus.java;
/*
 *Author :  Kamran Raza
 *Project:  JavaOperators 
 *Purpose:  This java program is used to explain about types of java operators
 *Date   :  19/07/2022
 */

public class JavaOperators {

	public static void main(String[] args) {
		
		// 1. Assignment Operator
		int roomRent = 1000;
		int mobileBill = 200;
		int electricBill = 400;
		System.out.println("My room rent is " + roomRent);
		System.out.println("My mobile bill is " + mobileBill);
		System.out.println("My electric bill is " + electricBill);

		// 2. Arithmetic Operator

		// Addition
		System.out.println("The sum of mobile and electric bill is = " +(mobileBill+electricBill));

		// Subtraction
		System.out.println("The diffrence of room rent and electric bill is = " + (roomRent-electricBill));

		//Multiplication
		System.out.println("The product of room rent and mobile bill is = " + (roomRent*mobileBill));

		//Division
		System.out.println("The division of electric and mobile bill is = " + (electricBill/mobileBill));

		//Remainder 
		System.out.println("The Remainder is = " + (100%30));

		System.out.println("**************");

		// 3. Equality and relational operators 

		int razaHeight = 165;
		int ronHeight = 150;
		int remiHeight = 165;

		System.out.println(razaHeight == ronHeight);
		System.out.println(razaHeight > ronHeight);
		System.out.println(ronHeight >= remiHeight);
		System.out.println(remiHeight < ronHeight);
		System.out.println(remiHeight <= razaHeight);
		System.out.println(razaHeight != ronHeight);
		System.out.println("*************");

		// 4. Conditional Operator
		//And - &&

		System.out.println(razaHeight==remiHeight && remiHeight<ronHeight && ronHeight>razaHeight);
		System.out.println(razaHeight==remiHeight && ronHeight==razaHeight && ronHeight<remiHeight);

		// OR -||

		System.out.println(razaHeight==remiHeight || ronHeight==razaHeight);
		System.out.println(ronHeight<razaHeight || razaHeight!=remiHeight);

		//5. UnaryOperators
		//Pre-Increment
		//++i
		int razaAge = 15;
		int kamAge = ++razaAge;
		System.out.println("Age of raza is = " + razaAge);
		System.out.println("Age of kam is = " + kamAge);

		//Post -Incremental 
		//i++ 
		int tomAge = 10;
		int jerryAge = tomAge++;

		System.out.println("Age of tom is = " + tomAge);
		System.out.println("Age of jerry is = " + jerryAge);


	}
}
