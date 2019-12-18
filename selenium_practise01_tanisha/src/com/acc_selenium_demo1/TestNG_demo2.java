package com.acc_selenium_demo1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_demo2 {
@BeforeTest
public void launch_browser(){
	System.out.println("launch browser");
	
}

@AfterTest
public void close_broser(){
	System.out.println("close browser");
	
}


@BeforeMethod
public void beforemethod(){
	System.out.println("before method");
	
}


@AfterMethod
public void aftermethod(){
	System.out.println("after method");
	
}


	@Test(priority=3)
	public void facebook(){
		System.out.println("I am using facebook");
		
	}
	
	
	@Test(priority=1)
	public void google(){
		System.out.println("I am using google");
	
	
	}
	@Test(priority=2)
	public void gmail(){
		System.out.println("I am using gmail");
	}
	
}
