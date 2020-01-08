package com.bridgelabz.selenium.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver",
					"/home/admin1/Desktop/SeleniumDriver/chromedriver_linux64/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.spicejet.com");
			
	}

}
