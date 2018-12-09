package com.abc.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo1 
{

	@Test
		public void positivecredential1()
		{
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.get("https://www.magento.com");
				driver.findElement(By.linkText("My Account")).click();
				driver.findElement(By.id("email")).sendKeys("swamisatish003@gmail.com");
				driver.findElement(By.id("pass")).sendKeys("Welcome123");
				driver.findElement(By.id("send2")).click();
				driver.findElement(By.linkText("Log Out")).click();
				driver.close();
		}
	@Test
	public void positivecredential2()
	{
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("https://www.magento.com");
			driver.findElement(By.linkText("My Account")).click();
			driver.findElement(By.id("email")).sendKeys("swamisatish003@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("Welcome123");
			driver.findElement(By.id("send2")).click();
			driver.findElement(By.linkText("Log Out")).click();
			driver.close();
	}
}


