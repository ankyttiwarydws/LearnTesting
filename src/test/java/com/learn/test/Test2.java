package com.learn.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.chrome;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/ankittiwari/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://twitter.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(3,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("//span[text()='Sign up with phone or email']")).click();
		//driver.findElement(By.xpath("//a[@href='/i/flow/signup']")).click();
		//driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div/main/div/div/div/div[1]/div/div[3]/a")).click();
		
//		driver.findElement(By.xpath("//input[contains(@name,'q')]")).sendKeys("Ank");
//		driver.navigate().to("https://twitter.com");
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().forward();
//		driver.navigate().refresh();
//		Thread.sleep(6000);
////		//List <WebElement> li = driver.findElements(By.tagName("a"));
////		S//ystem.out.println("Numberof Links"+ li.size());
////		for(int i=0;i<li.size();i++)
////		{
////			System.out.println("Links "+ li.get(i).getText());
////		}
		//driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div/main/div/div/div/div[1]/div/div[3]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("name")).sendKeys("Ank");
		Select select = new Select(driver.findElement(By.xpath("//select[contains(@class,'r-30o5oe r-1niwhzg r-17gur6a r-1yadl64 r-1fmj7o5 r-1loqt21 r-37j5jr r-1inkyih r-rjixqe r-crgep1 r-1wzrnnt r-1ny4l3l r-t60dpp r-xd6kpl r-1pn2ns4 r-ttdzmv']")));
		select.selectByVisibleText("20");
	}

}
//*[@id="react-root"]/div/div/div/main/div/div/div/div[1]/div/div[3]/a