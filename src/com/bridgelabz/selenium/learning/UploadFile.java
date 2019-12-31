package com.bridgelabz.selenium.learning;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver",
				"/home/admin1/Desktop/SeleniumDriver/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ezgif.com/png-to-jpg");
	//	driver.findElement(By.id("upload")).click();
	//	
		
		driver.findElement(By.xpath("//input[@type='file']"))
		.sendKeys("/home/admin1/Pictures/Screenshot from 2019-12-26 10-31-57.png");
	//	driver.findElement(By.id("upload")).click();
		
		Thread.sleep(2000);
		//driver.close();
	}

}
