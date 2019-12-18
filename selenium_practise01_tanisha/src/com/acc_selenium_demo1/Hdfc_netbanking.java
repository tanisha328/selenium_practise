package com.acc_selenium_demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Hdfc_netbanking {

	WebDriver driver;
	@BeforeTest
	public void launch_browser(){
		System.setProperty("webdriver.chrome.driver","C:\\driver9999\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://netbanking.hdfcbank.com/netbanking/");
}
	
	@Test
	public void user_id(){
		int f;
		f=driver.findElements(By.tagName("frame")).size();
		System.out.println("frames"+ " "+f);
		driver.switchTo().frame(0);
		
		//driver.switchTo().frame("login_page");
	  driver.findElement(By.name("fldLoginUserId")).sendKeys("98456");
	  driver.switchTo().defaultContent();
	  driver.switchTo().frame("footer");
	  driver.findElement(By.linkText("Privacy Policy")).click();
	  driver.switchTo().defaultContent();
	  driver.findElement(By.xpath("//img[@alt='continue']")).click();
	}

}
