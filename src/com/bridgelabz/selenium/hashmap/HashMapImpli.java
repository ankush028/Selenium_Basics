package com.bridgelabz.selenium.hashmap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HashMapImpli {
	
	public static void main(String[] args) throws InterruptedException {
		
				
	System.setProperty("webdriver.chrome.driver",
			"/home/admin1/Desktop/SeleniumDriver/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		String fbUserInfo[] = Data.userLoginInfo().get("facebook").split("_");
		String linkedinUserInfo[] = Data.userLoginInfo().get("linkedin").split("_");

		Select select = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		select.selectByVisibleText(Data.monthMap().get(4));
		
		driver.findElement(By.name("email")).sendKeys(fbUserInfo[0]);
		driver.findElement(By.name("pass")).sendKeys(fbUserInfo[1]);		
		driver.findElement(By.xpath("//label[@id='loginbutton']")).click();
		Thread.sleep(3000);
		driver.navigate().to("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(linkedinUserInfo[0]);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(linkedinUserInfo[1]);
		
		driver.findElement(By.xpath("//button[@class='btn__primary--large from__button--floating']")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}
}