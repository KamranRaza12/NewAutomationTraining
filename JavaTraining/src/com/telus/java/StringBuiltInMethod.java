package com.telus.java;
/*
 *Author :  Kamran Raza
 *Project:  BuiltInMethods
 *Purpose:  This java program is used to explain about String Methods
 *Date   :  22/07/2022
 */
public class StringBuiltInMethod {

	public static void main(String[] args) {

		String wish = " Wish You All The Best ";
		String name = "Kamran";

		// 1.Length of the sentence 

		System.out.println("The length of the sentence is - " + wish.length());

		// 2.Convert the sentence to Lower Case

		System.out.println("The sentence in lower case is - " + wish.toLowerCase());

		// 3.Convert the sentence to Upper Case

		System.out.println("The sentence in lower case is - " + wish.toUpperCase());

		// 4.Trim the sentence 

		System.out.println("The trimmed sentence is - " + wish.trim());


		// 5.Character at given index value

		System.out.println("The character at index values 3 is - " + wish.charAt(3));

		// 6.Index value of given character 

		System.out.println("The index values of characte W is - " + wish.indexOf('W'));

		// 7.Concatenating Two String 

		System.out.println(wish.concat(name));

		// 8.Two way comparison 

		System.out.println(wish.equals(name));

		// 9.Three way comparison

		System.out.println(wish.compareTo(name));
		
		/*
		 * 10.Check whether the string contains given character or not
		 * Handling special character "All" 
		 * 
		 */
		System.out.println("Wish string contains \"All\" - " + wish.contains("All"));

		// 11.Print a part of string using substring 

		//return part of string only by giving beginning index value

		System.out.println(wish.substring(13));

		//return part of string with beginning index value and ending index value

		System.out.println(wish.substring(0,6));
		
		//12.String replacing all old word or characters 
		
		System.out.println("The old msg is - " + wish);
		
		System.out.println("The new msg is - " + wish.replace("Wish", "Wishing"));
		
		





	}

}
