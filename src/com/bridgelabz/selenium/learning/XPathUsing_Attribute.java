package com.bridgelabz.selenium.learning;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathUsing_Attribute {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"/home/admin1/Desktop/SeleniumDriver/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		String xp = "//input[@id='username']";	
		Thread.sleep(2000);
		driver.findElement(By.xpath(xp)).sendKeys("akag0284@gmail.com");
		Thread.sleep(2000);
		String xpass = "//input[@id='password']";
		driver.findElement(By.xpath(xpass)).sendKeys("asquare");
//		String area =driver.findElement(By.xpath(
//				"//button[@class='btn__primary--large from__button--floating']")).
//				getAttribute("width");	
//		System.out.println(area);
		
		driver.findElement(By.xpath("//button[@class='btn__primary--large from__button--floating']")).click();
		Thread.sleep(2000);
		driver.close();
		
		
		
		
	}

}
