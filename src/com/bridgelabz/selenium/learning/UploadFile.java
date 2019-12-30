package com.bridgelabz.selenium.learning;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException, AWTException {
		S77777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777ystem.setProperty("webdriver.chrome.driver",
				"/home/admin1/Desktop/SeleniumDriver/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Robot robot = new Robot();
		driver.get("https://imgbb.com/upload");
		driver.findElement(By.id("upload")).click();
	//	driver.switchTo().alert().dismiss();
		
	//	driver.findElement(By.id("upload")).sendKeys("/home/admin1/Pictures/Screenshot from 2019-12-26 10-31-57.png");
		driver.findElement(By.id("upload")).click();
		robot.keyPress(KeyEvent.VK_CONTROL+KeyEvent.VK_V);
		//robot.keyPress();
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		driver.close();
	}

}
