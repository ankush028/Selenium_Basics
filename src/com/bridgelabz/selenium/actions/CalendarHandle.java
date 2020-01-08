package com.bridgelabz.selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/home/admin1/Desktop/SeleniumDriver/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com");
		
		WebElement element = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']"));
		String dateVal ="06/01/2020";
		JavascriptExecutor js = (JavascriptExecutor) driver;	
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');",element);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
		Thread.sleep(5000);
		driver.close();
		
	}

}
