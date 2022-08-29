package com.telus.java;

public class HandlingDate {
	public static float area(float base, float height) {
		float triangle = (height*base)/2;
				System.out.println(triangle);
		return triangle;
	}
	public static void main(String[] args) {
		HandlingDate.area(15, 20);
}
}