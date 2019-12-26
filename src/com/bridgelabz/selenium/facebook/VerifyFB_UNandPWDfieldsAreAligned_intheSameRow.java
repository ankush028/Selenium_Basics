package com.bridgelabz.selenium.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyFB_UNandPWDfieldsAreAligned_intheSameRow {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"/home/admin1/Desktop/SeleniumDriver/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		WebElement user = driver.findElement(By.id("email"));
		
		int userYCordinate = user.getLocation().getY();
		
		System.out.println(userYCordinate);
		
		WebElement pwd = driver.findElement(By.name("pass"));
		
		int passYCordinate = pwd.getLocation().getY();
		
		System.out.println(passYCordinate);

		if(userYCordinate==passYCordinate) {
			System.out.println("Both are in the same row");
		}else {
			System.out.println("user name and password are not alligned");
				
		}	
		driver.close();
	}

}
