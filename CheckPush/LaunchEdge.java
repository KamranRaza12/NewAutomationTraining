package com.telus.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdge {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",".\\Drivers\\msedgedriver.exe");
		WebDriver edge = new EdgeDriver();
		String url = "https://nxtgenaiacademy.com";
		edge.get(url);
	
		edge.manage().window().maximize();
		

	}

}
