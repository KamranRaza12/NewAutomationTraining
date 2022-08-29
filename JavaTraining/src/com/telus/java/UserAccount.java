package com.telus.java;

public class UserAccount {
	public void demandDraft() {
		System.out.println("Demand Draft is issued");
	}
	public void chequeBook() {
		System.out.println("Cheque book is issued ");
	}
	public void atmCardRequest() {
		System.out.println("ATM card requested");
	}

	public static void main(String[] args) {

		UserAccount userOne = new UserAccount();
		userOne.demandDraft();
		userOne.chequeBook();
		userOne.atmCardRequest();

	}

}
