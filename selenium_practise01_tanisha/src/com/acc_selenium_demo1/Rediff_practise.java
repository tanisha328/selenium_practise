package com.acc_selenium_demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rediff_practise {
	WebDriver driver;
	@BeforeTest
	public void launch_browser(){
		System.setProperty("webdriver.chrome.driver","C:\\driver9999\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.rediff.com/");
}
	@Test
	public void account(){
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("tanisha");
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]")).sendKeys("tanisha123");
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[9]/td[3]/input")).sendKeys("tan123");
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[11]/td[3]/input")).sendKeys("pwd123456789");
		driver.findElement(By.xpath("//*[@id='div_altemail']/table/tbody/tr[1]/td[3]/input")).sendKeys("pwd123456789");
		driver.findElement(By.xpath("//input[@id='mobno']")).sendKeys("tan13@gmail.com");
		WebElement cnt=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));
		Select s1=new Select(cnt);
		
		WebElement cnt2=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]"));
		Select s2=new Select(cnt2);
		WebElement cnt3=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]"));
		Select s3=new Select(cnt3);
				s1.selectByVisibleText("01");
				s2.selectByVisibleText("JAN");
				s3.selectByVisibleText("2012");
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[24]/td[3]/input[2]"));
		
		WebElement cnt4=driver.findElement(By.xpath("//*[@id='country']"));
		Select s4=new Select(cnt4);
		s4.selectByValue("99");
		WebElement cnt5=driver.findElement(By.xpath("//*[@id='div_city']/table/tbody/tr[1]/td[3]/select"));
		Select s5=new Select(cnt5);
		s5.selectByValue("Agartala");
		
		
		
	}
	
}
