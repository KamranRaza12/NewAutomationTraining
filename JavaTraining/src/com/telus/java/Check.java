package com.telus.java;

public class Check {

	public static void main(String[] args) {

		int i = 5;
		int a = 10;
		int b = 15;
		int c = 20;
		int d = 25;
		int e = 30;
		int f = 35;
		if (i<a) {
			System.out.println("QA AUTOMATION is displayed");

			if (a<b) {
				System.out.println("QA AUTOMATION is enabled ");

				if (b<c) {
					System.out.println("Practice Automation is displayed");

					if (c<d) {
						System.out.println("Practice Automation is enabled");

						if (d<e) {
							System.out.println("Demo Site - Registration Form is displayed");

							if (e<f) {
								System.out.println("Demo Site - Registration Form is enabled");
								System.out.println("Demo Site - Registration Form is selected");
							}else {
								System.out.println("Demo Site - Registration Form is not enabled");
							}
						}else {
							System.out.println("Demo Site - Registration Form is not displayed");
						}

					}else {
						System.out.println("Practice Automation is not enabled");
					}
				}else {
					System.out.println("Practice Automation is not displayed");
				}
			}else {
				System.out.println("QA AUTOMATION is not enabled ");
			}

		}else {
			System.out.println("QA AUTOMATION IS NOT displayed");
		}

	}
}
