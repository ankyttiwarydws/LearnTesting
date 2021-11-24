package com.learn.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test4Morning {
WebDriver driver;
@BeforeMethod
public void beforeMethod() {
	System.setProperty("webdriver.chrome.driver", "/Users/ankittiwari/Downloads/chromedriver");
	driver = new ChromeDriver();
	driver.get("https://google.com");
	//driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(3,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	}

@Test(priority=1, groups="Yahoo")
 public void Test1() throws InterruptedException {
	driver.navigate().to("https://in.search.yahoo.com/?fr2=inr");
	driver.findElement(By.linkText("Sign In")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("createacc")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='usernamereg-firstName']")).sendKeys("Ank");
	Select select= new Select(driver.findElement(By.xpath("//select[@id='usernamereg-month']")));
	select.selectByVisibleText("May");
	
}

@Test(priority=2, groups="Practice", dependsOnMethods="Test1")
public void practice() {
	driver.navigate().to("https://google.com");
	//switch to frame
	driver.switchTo().frame(0);
	//handle alert
	Alert alert = driver.switchTo().alert();
	System.out.println("Alert"+alert.getText());
	alert.accept();
	//Actions class
	Actions action = new Actions(driver);
	action.clickAndHold(driver.findElement(By.xpath("//input[contains(@name,'q')]"))).release().build().perform();
	//upload
	driver.findElement(By.id("123")).sendKeys(Keys.ENTER);
}

@AfterMethod
 public void afterMethod() throws InterruptedException {
	Thread.sleep(3000);
	driver.close();
}
	
}
