package com.bridgelabz.selenium.advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MoveTo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/home/admin1/Desktop/SeleniumDriver/chromedriver_linux64/chromedriver");
		ChromeOptions options = new ChromeOptions();
		
		WebDriver driver = new ChromeDriver(options);
	
		options.addArguments("--disable-notifications\\");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8109555221");
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Test@123");;
		
		WebElement login = driver.findElement(By.id("loginbutton"));
		
		int x=login.getLocation().getX();
		int y= login.getLocation().getY();
		
	//	act.moveToElement(username).sendKeys("8109555221").build().perform();
		Thread.sleep(1000);
	//	act.moveToElement(pwd).sendKeys("Test@123").build().perform();
		
		act.moveByOffset(x,y).click().build().perform();
//		String browsePopup=driver.getWindowHandle();
//		
//		System.out.println(browsePopup);
	//	option.addArguments("--disable-notifications");//for handling browser popups
//		String text =		driver.switchTo().alert().getText();
//		System.out.println(text);		

	}

}
