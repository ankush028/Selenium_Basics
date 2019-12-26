package com.bridgelabz.selenium.advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/home/admin1/Desktop/SeleniumDriver/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ksrtc.in");
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']")).click();
		Thread.sleep(2000);
		String text =	driver.switchTo().alert().getText();
		System.out.println(text);	
		if(text.contentEquals("Please select start place.")) {
			driver.switchTo().alert().accept();	
			Thread.sleep(2000);
			driver.close();
		}else {
			System.out.println("Wrong alert");	
		}

	}

}
