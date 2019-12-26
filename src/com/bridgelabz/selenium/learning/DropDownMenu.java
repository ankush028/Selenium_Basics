package com.bridgelabz.selenium.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDownMenu{

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"/home/admin1/Desktop/SeleniumDriver/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.istqb.org/");
		
		WebElement foundation =driver.findElement(By.xpath("//span[.'FOUNDATION']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(foundation).perform();
	
		Thread.sleep(2000);
		
		driver.close();
	}

}
