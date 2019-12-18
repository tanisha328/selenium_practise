package com.acc_selenium_demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class download_selenium {
	
WebDriver driver;
		@BeforeTest
		public void launch_browser() throws Exception{
			System.setProperty("webdriver.chrome.driver","C:\\driver9999\\chromedriver.exe");
			 driver=new ChromeDriver(); 
			driver.get("https://selenium.dev/downloads/");
			Thread.sleep(3000);
		}
	
@Test
public void page() throws InterruptedException{
	driver.findElement(By.xpath("//a[@href='https://seleniumhq.github.io/selenium/docs/api/java/index.html']")).click();

	
	driver.switchTo().frame("classFrame");
	driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
	driver.switchTo().defaultContent();
	driver.switchTo().frame("packageListFrame");
	driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
	driver.switchTo().defaultContent();
	driver.switchTo().frame("packageFrame");
	driver.findElement(By.linkText("CommandProcessor")).click();
	Thread.sleep(2000);
}}
