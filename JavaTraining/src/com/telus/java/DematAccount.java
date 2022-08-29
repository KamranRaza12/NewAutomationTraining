package com.telus.java;

public class DematAccount extends UserAccount  {

	public void creditCard() {
		System.out.println("User requested credit card");
	}
	public int creditScore(int score) {
		System.out.println("User credit score is " + score);
		return score;
	}

	public static void main(String[] args) {

		DematAccount userTwo = new DematAccount();
		userTwo.chequeBook();
		userTwo.demandDraft();
		userTwo.atmCardRequest();
		userTwo.creditCard();
		userTwo.creditScore(250);
	}

}
