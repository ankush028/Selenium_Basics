package com.bridgelabz.selenium.learning;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpCastingToDriver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"/home/admin1/Desktop/SeleniumDriver/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("Title of the page is : "+driver.getTitle());
		System.out.println("Current Url : "+driver.getCurrentUrl());
		System.out.println("Page Source :"+driver.getPageSource());
		Thread.sleep(2000);
		driver.close();
		
	}

}
