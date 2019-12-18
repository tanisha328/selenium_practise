package com.acc_selenium_demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello_selenium {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hello! selenium");
		System.setProperty("webdriver.chrome.driver","C:\\driver9999\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).click();
		driver.close();
		driver.quit();
	}

}
