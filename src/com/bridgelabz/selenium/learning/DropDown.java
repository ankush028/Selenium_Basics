package com.bridgelabz.selenium.learning;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/home/admin1/Desktop/SeleniumDriver/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		//driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.MICROSECONDS);
	//	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		WebElement day = driver.findElement(By.id("day"));
		Select d1 = new Select(day);
		d1.selectByValue("2");
	//	d1.selectByIndex(2);
	//	d1.selectByVisibleText("1");
		List<WebElement> options = d1.getOptions();
		for(WebElement w : options) {
			w.click();
			System.out.println(w.getText());

		}
		Thread.sleep(3000);
		driver.close();
	}

}
