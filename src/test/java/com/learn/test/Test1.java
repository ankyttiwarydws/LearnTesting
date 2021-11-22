package com.learn.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/ankittiwari/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		driver.findElement(By.xpath("//input[contains(@name,'q')]")).sendKeys("Sum");
	//	driver.findElement(By.className("gLFyf gsfi")).sendKeys("Sum");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='btnK']")).click();
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		//WebElement e = driver.findElements(By.tagName("a"));
		
		List<WebElement> li = driver.findElements(By.tagName("a"));
		System.out.println(li.size());
		for(int i=0;i<li.size();i++)
		{
			//String b = li.get(i).getText();
			System.out.println((String)li.get(i).getText());
		}
		
		
 		Thread.sleep(5000);
		driver.findElement(By.linkText("Create New Account")).click();
		
		//Dropdown Select 
		Select select = new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("25");
		
		
		
		
		
	}

}
