package com.telus.java;

public class SalaryAccount extends DematAccount {

	public void emailAddRequest() {
		System.out.println("User requested for add email");
	}
	public float intrestRate(float rate) {
		System.out.println("Salary account intrest rate " + rate + "%");
		return rate;
	}

	public static void main(String[] args) {
		SalaryAccount userThree = new SalaryAccount();
		userThree.chequeBook();
		userThree.demandDraft();
		userThree.atmCardRequest();
		userThree.creditCard();
		userThree.creditScore(230);
		userThree.emailAddRequest();
		userThree.intrestRate(8.25f);


	}

}
