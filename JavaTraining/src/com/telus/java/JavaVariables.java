package com.telus.java;
/*
 *Author :  Kamran Raza
 *Project:  Java Variables 
 *Purpose:  This java program is used to explain about Instance and Static Variables
 *Date   :  24/07/2022
 */
public class JavaVariables {

	/*
	 * Cricket Player Profile 
	 * Instance Variables
	 */	
	String playerOneName = "Virat Kohli";
	String playerOneBattingStyle = "Right-handed";
	String playerOneSalaryGrade = "A";
	int playerOneRanking = 5;
	int playerOneJerseyNumber = 18;
	float playerOneBattingAverage = 57.68f;
	float playerOneStrikeRate = 92.84f;

	//Static Variables 

	static String cricketTeamName = "INDIA";
	static String cricketFormat = "ODI";
	static int Salary = 7;


	public static void main(String[] args) {

		// Creating instance of object	

		JavaVariables playerOne = new JavaVariables();

		System.out.println("Cricket Player Profile");

		//Calling Static variables 
		
		System.out.println("Team - " + cricketTeamName);
		System.out.println("Format - " + cricketFormat);

		//Calling Instance variables 
		
		System.out.println("Player Name - " + playerOne.playerOneName);
		System.out.println("Player Jersey Number - " + playerOne.playerOneJerseyNumber);
		System.out.println("Player Batting Style - " + playerOne.playerOneBattingStyle);
		System.out.println("Player Salary Grade - " + playerOne.playerOneSalaryGrade);
		
		System.out.println("Salary for Grade \"A\" Players - " + Salary + "Cr");  //Static Variable
		
		System.out.println("Player ODI Ranking - " + playerOne.playerOneRanking);
		System.out.println("Player Batting Average - " + playerOne.playerOneBattingAverage);
		System.out.println("Player Strike Rate - " + playerOne.playerOneStrikeRate);
		
		//Data References - https://en.wikipedia.org/wiki/Virat_Kohli
	}

}
