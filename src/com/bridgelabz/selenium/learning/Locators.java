package com.bridgelabz.selenium.learning;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/home/admin1/Desktop/SeleniumDriver/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///home/admin1/Documents/Htmlcontent.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("user")).sendKeys("Ankush");		
		driver.findElement(By.id("pass")).sendKeys("Kumar");
		driver.findElement(By.linkText("Click ActiTIME Link")).click();
		Thread.sleep(3000);
		driver.close();	
	}

}
