package com.bridgelabz.selenium.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"/home/admin1/Desktop/SeleniumDriver/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//input[@id='u_0_m']")).sendKeys("Ankush");
		
		driver.findElement(By.xpath("//input[@id='u_0_o']")).sendKeys("Agrawal");
		
		driver.findElement(By.xpath("//input[@id='u_0_r']")).sendKeys("8004030992");
		
		driver.findElement(By.xpath("//input[@id='u_0_w']")).sendKeys("54322345");
		
		Select sel1 = new Select(driver.findElement(By.xpath("//select[@id='day']")));
		sel1.selectByValue("21");
		Select sel2 = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		sel2.selectByVisibleText("Dec");
		Select sel3 = new Select(driver.findElement(By.xpath("//select[@id='year']")));
		sel3.selectByVisibleText("1998");
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
	
		driver.findElement(By.xpath("//button[@id='u_0_13']")).click();
		Thread.sleep(10000);
		driver.close();
		
		
	}

}
