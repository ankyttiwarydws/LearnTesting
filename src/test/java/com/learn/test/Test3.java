package com.learn.test;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Test3 {
@BeforeClass
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/ankittiwari/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(3,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.navigate().to("https://mypage.rediff.com/login/dologin");
//		Thread.sleep(3000);
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
		Thread.sleep(4000);
//		driver.findElement(By.id("txtlogin")).sendKeys("Ank");
//		driver.findElement(By.xpath("//input[contains(@id,'pass_box')]")).sendKeys("Tiw");
//	//	driver.findElement(By.xpath("//input[@id='pass_box")).sendKeys("Tiwd");
//		driver.findElement(By.id("remember")).click();
//		driver.navigate().refresh();
//		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@value='Login')]")).click();//sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//*[@id='pass_div']/input[3]")).sendKeys(Keys.ENTER);//click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		//*[@id="pass_div"]/input[3]
		
		List <WebElement> li = driver.findElements(By.xpath("//div"));
		//Iterator<WebElement> itr = li.iterator();
		System.out.println("Number of divs "+li.size() );
		
		for(WebElement a : li) {
			String b = a.getText();
			System.out.println("Divs " + b);
		}
		
	}

}
