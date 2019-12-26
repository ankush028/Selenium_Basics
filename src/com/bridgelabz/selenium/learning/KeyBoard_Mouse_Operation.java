package com.bridgelabz.selenium.learning;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoard_Mouse_Operation {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"/home/admin1/Desktop/SeleniumDriver/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		Robot robot = new Robot();
		robot.mouseMove(300,500);
		robot.keyPress(KeyEvent.VK_ALT);
		
		robot.keyPress(KeyEvent.VK_F);
		
		robot.keyRelease(KeyEvent.VK_F);
		
		robot.keyRelease(KeyEvent.VK_ALT);		
		Thread.sleep(2000);
		driver.close();
	
		
		
	}
}
