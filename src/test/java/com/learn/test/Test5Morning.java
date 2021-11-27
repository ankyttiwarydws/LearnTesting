package com.learn.test;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test5Morning {

	WebDriver driver;
@BeforeMethod	
	public void beforeMethod1{
	System.setProperty("webdriver.chrome.driver", "/Users/ankittiwari/Downloads/chromedriver");
	driver=new ChromeDriver();
	driver = new HtmlUnitDriver();
	
	Properties pro = new Properties();
	FileInputStream ip = new FileInputStream("/location");
	pro.load(ip);
	pro.getProperty("name");
	
	Properties pr= new Properties();
	FileInputStream ia = new FileInputStream("/location");
	pr.load(ia);
	pr.getProperty("name");

	driver.get("https://google.com");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(2,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	
}


@Test
	public void Test1{
	driver.navigate().to("https://twitter.com");
	driver.navigate().refresh();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='abc']")).sendKeys("abc");
	
	Alert alert = driver.switchTo().frame(0);
	alert.getText();
	alert.accept();
	
	Select select = new Select(driver.findElement(By.xpath("//select[@id='123')")));
	select.selectByVisibleText("abc");
	
	Actions action = new Actions(driver);
	action.clickAndHold(driver.findElement(By.id("sda"))).build().perform();
	action.release(driver.findElement(By.id("abc"))).build().perform();
	
	driver.findElement(By.id("abc")).sendKeys("filelocation");
	
	driver.switchTo().frame(0);
	
	boolean a =driver.findElement(By.id("abc")).isDisplayed();
	boolean b = driver.findElement(By.className("abc")).isEnabled();
	boolean c = driver.findElement(By.cssSelector("#address")).isSelected();
	
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("/location"));
	
	List <WebElement> li = driver.findElements(By.tagName("a"));
	System.out.println("SIze"+ li.size());
	//Iterator<WebElement> i = new Iterator();
	for(WebElement a : li)
	System.out.println("Elements"+ a.getText());	
	
}

@AfterMethod
	public void afterMethod1{
	driver.close();
}
}