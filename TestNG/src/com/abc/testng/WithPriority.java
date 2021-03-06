package com.abc.testng;

import org.testng.annotations.Test;

public class WithPriority 
{
	@Test(priority=55)
	public void a_method() 
	{
		System.out.println("a_method get executed");
	}
	
	@Test(priority=3)
	public void b_method() 
	{
		System.out.println("b_method get executed");
	}
	
	@Test(priority=3)
	public void c_method() 
	{
		System.out.println("c_method get executed");
	}

	@Test(priority=24)
	public void d_method() 
	{
		System.out.println("d_method get executed");
	}
	
	@Test(priority=0)
	public void e_method() 
	{
		System.out.println("e_method get executed");
	}

}
