package com.bridgelabz.selenium.learning;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMainBrowserOnly {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"/home/admin1/Desktop/SeleniumDriver/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindowHandles =driver.getWindowHandles();
		int count = allWindowHandles.size();
		System.out.println("number of browser : opened on the system :"+count);
		
		
		for(String windowHandle: allWindowHandles) {
			driver.switchTo().window(windowHandle);
			if(windowHandle.equals(parentWindow)) {
				driver.close();
				System.out.println("Main Browser window with the title: ");
				driver.close();
			}
		}
		
		
	}
}
