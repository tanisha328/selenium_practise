package com.acc_selenium_demo1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class login {

	WebDriver driver;

	 

	@Test

	 

	public void rediff_alert_handling() throws Exception{

	   

	    System.setProperty("webdriver.chrome.driver", "C:\\driver9999\\chromedriver.exe");

	    driver= new ChromeDriver();

	    driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); 

	    driver.findElement(By.name("proceed")).click();

	    Alert al=driver.switchTo().alert();

	    String str=al.getText();

	    System.out.println(str);

	    Assert.assertEquals(str, "Please enter a valid user name");

	    System.out.println(" test is passed ");

	    Thread.sleep(3000);

	    al.accept();

	    //al.dismiss();

	driver.findElement(By.id("login1")).sendKeys("pravin");

	   

}
