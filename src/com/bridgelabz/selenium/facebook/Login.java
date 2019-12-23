package com.bridgelabz.selenium.facebook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"/home/admin1/Desktop/SeleniumDriver/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8109555221");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Test@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
		
		driver.findElement(By.xpath("//div[contains(@id,'userNavigationLabel')]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[@class='_54nh'][contains(.,'Log Out')]")).click();
		
		Thread.sleep(3000);

		driver.close();
		
		
	}

}
