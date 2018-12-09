package com.abc.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeandAfterMethod 
{
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before method executed");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After method executed");
		System.out.println("");
	}
	
	@Test
	public void positivecredential1()
	{
		System.out.println("Inside positive credential 1");
	}
	
	
	@Test
	public void positivecredential2()
	{
		System.out.println("Inside positive credential 2");
	}
}
