

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2_newtours {
WebDriver driver;
	@BeforeTest
	public void launch_browser(){
		System.setProperty("webdriver.chrome.driver","C:\\driver9999\\chromedriver.exe");
		 driver=new ChromeDriver(); 
		driver.get("http://www.newtours.demoaut.com/");
	}
@AfterTest
public void close_browser(){
	driver.close();
}
	@Test
	public void register() throws Exception{
	//public static void main(String[] args)  throws InterruptedException{
		driver.findElement(By.linkText("REGISTER")).click();
			driver.findElement(By.name("firstName")).sendKeys("Tanisha");
			driver.findElement(By.name("lastName")).sendKeys("Bisht");
			driver.findElement(By.name("phone")).sendKeys("987456321");
			WebElement cnt=driver.findElement(By.name("country"));
			Select s1=new Select(cnt);
					s1.selectByVisibleText("INDIA");
			Thread.sleep(2000);
			s1.selectByValue("94");
			Thread.sleep(2000);
			s1.selectByIndex(96);
			driver.findElement(By.name("register")).click();
			Thread.sleep(2000);
			
	}

}
