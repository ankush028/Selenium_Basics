package com.bridgelabz.selenium.learning;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;
public class CaptureScreenShot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", 
				"/home/admin1/Desktop/SeleniumDriver/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		Date d = new Date();
		String date1 = d.toString();
		driver.get("https://www.amazon.com");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile =ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("/home/admin1/Pictures/photos"+date1+"selenium.png");
		Files.copy(srcFile, destFile);
		driver.close();
		
		
		
	}

}
