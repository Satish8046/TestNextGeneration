package com.abc.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AttributesWithTestAnnotation 
{
	@Test
	public void login() 
	{
		Assert.fail();
		//Assert.assertEquals(true, false);
		System.out.println("Login successful");
	}
	
	@Test(dependsOnMethods="login", alwaysRun=true)
	public void logout() 
	{
		
		System.out.println("Logout successful");
	}
	
	@Test
	public void inbox()
	{
		System.out.println("inbox testcase executed");
	}
	
	@Test(invocationCount=5)
	public void compose()
	{
		System.out.println("Compose executed");
	}
}
