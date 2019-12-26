package com.bridgelabz.selenium.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathUsingAttribute_ActiTime {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/home/admin1/Desktop/SeleniumDriver/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.dev/");
		driver.findElement(By.xpath("//div[@class='download-button webdriver']//b[contains(text(),'DOWNLOAD')]")).click();
		
		Thread.sleep(2000);
		driver.close();
	}

}
