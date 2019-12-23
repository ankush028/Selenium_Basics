package com.bridgelabz.selenium.learning;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"/home/admin1/Desktop/SeleniumDriver/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("9069057147");
		TakesScreenshot ts = (TakesScreenshot) driver;	
		File srcFile =ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("/home/admin1/Documents/selenium.txt");
		Files.copy(srcFile,destFile);
		System.out.println(srcFile);
		System.out.println(destFile);
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("abcdf.in");
		Thread.sleep(2000);
		driver.findElement(By.id("u_0_2")).click();
		driver.close();
	}

}
