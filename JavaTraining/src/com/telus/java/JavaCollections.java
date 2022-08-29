package com.telus.java;

/*
 *Author :  Kamran Raza
 *Project:  Java Collections
 *Purpose:  This java program is used to explain about HashMap concepts
 *Date   :  23/08/2022
 */
import java.util.HashMap;
import java.util.Map;

public class JavaCollections {

	public static void main(String[] args) {
		HashMap<String, String> employee = new HashMap<String, String>();
		employee.put("firstName", "Kamran");
		employee.put("lastName", "Raza");
		employee.put("petName", "COCO");
		employee.put("position", "Trainee");
		employee.put("gender", "Male");
		employee.put("email", "kamran@gmail.com");

		System.out.println(employee);
		System.out.println("****************************************");
		// Printing details using for each loop
		for (Map.Entry<String, String> details : employee.entrySet()) {
			System.out.println(details.getKey() + " - " + details.getValue());
		}
		System.out.println("****************************************");

		// Retrieving size
		System.out.println(employee.size());
		System.out.println("****************************************");

		// Retrieving value using key
		System.out.println(employee.get("firstName"));
		System.out.println("****************************************");

		// Replacing Value and Key
		employee.replace("lastName", "R");
		System.out.println(employee);
		System.out.println("****************************************");

		// Removing Values and Key
		employee.remove("gender");
		System.out.println(employee);

		employee.remove("petName", "COCO");
		System.out.println(employee);
		System.out.println("****************************************");

		HashMap<Integer, HashMap<String, String>> employeeId = new HashMap<Integer, HashMap<String, String>>();
		employeeId.put(12535, employee);
		System.out.println(employeeId);

	}

}
