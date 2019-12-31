package com.bridgelabz.selenium.learning;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", 
				"/home/admin1/Desktop/SeleniumDriver/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		Set<String> allWindowHandles = driver.getWindowHandles();
		int count = allWindowHandles.size();
		System.out.println("number of browser :"+count);
		
		for(String windowHandle:allWindowHandles) {
			driver.switchTo().window(windowHandle);
			String title =	driver.getTitle();
			System.out.println(title );
			System.out.println("Window handle id of page :"+title+" of this window"+windowHandle);
		
			
		}
	
	}
	
}
