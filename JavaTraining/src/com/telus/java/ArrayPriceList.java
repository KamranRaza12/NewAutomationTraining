package com.telus.java;
import java.util.Arrays;
/*
 *Author :  Kamran Raza
 *Project:  Arrays
 *Purpose:  This java program is used to explain about array concepts
 *Date   :  23/07/2022
 */
public class ArrayPriceList {

	public static void main(String[] args) {
		/*
		 * Creating a integer data type array and assigning the values
		 */		

		int arrShirtPrices[] = {199,299,399,499,599};

		// Printing array using for-each loop
		for(int arrPrices: arrShirtPrices) {
			System.out.println("Shirt price is - Rs " + arrPrices);
		}

		System.out.println("******************************");



		/*
		 * Creating a string data type array and assigning the values
		 */		
		String arrShirtSizes[] = {"S","M","L","XL","XXL"};

		// Printing array using for-each loop
		for(String arrSizes : arrShirtSizes) {
			System.out.println("Shirt size is - " + arrSizes);
		}

		System.out.println("******************************");

		//Converting array integer to string

		String arrShirtPriceList = Arrays.toString(arrShirtPrices);
		System.out.println("Shirt price of S, M, L, XL, XXL - Rs" + arrShirtPriceList);

		System.out.println("******************************");

		//Check whether given string is present or not

		boolean size = Arrays.asList(arrShirtSizes).contains("XXL");
		System.out.println(size);

		/*
		 * String Method
		 * split() method
		 */		

		String pantPrice = "Rs 199. Rs 299. Rs 399. Rs 499. Rs 599.";
		String arrPantPrice[] = pantPrice.split("Rs");
		for(String rangeArr : arrPantPrice) {
			System.out.println(rangeArr);
		}
	}
}
