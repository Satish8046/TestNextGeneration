package com.abc.testng;

import org.testng.annotations.Test;

public class Groups 
{
	@Test(groups="inbox")
	public void testCase1() 
	{
		System.out.println("testcase 1 executed");
	}
	@Test(groups="login")
	public void testCase2()
	{
		System.out.println("testcase 2 executed");
	}
	
	@Test(groups="compose")
	public void testCase3()
	{
		System.out.println("testcase 3 executed");
	}
	@Test(groups="logout")
	public void testCase4()
	{
		System.out.println("testcase 4 executed");
	}
	@Test(groups="inbox")
	public void testCase5() 
	{
		System.out.println("testcase 5 executed");
	}
}
