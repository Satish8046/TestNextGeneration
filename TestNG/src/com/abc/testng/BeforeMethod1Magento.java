package com.abc.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethod1Magento 
{
	WebDriver driver;
	@BeforeMethod
	public void open()
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to("https://www.magento.com");
	}
	@AfterMethod
	public void close() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
	
	@Test
	public void clickOnRegister() 
	{
		driver.findElement(By.xpath("//a[text()='REGISTER TODAY']")).click();
	}
	
	@Test
	public void login() 
	{
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.id("email")).sendKeys("swamisatish003@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Welcome123");
		driver.findElement(By.id("send2")).click();
		driver.findElement(By.linkText("Log Out")).click();
	}

}
