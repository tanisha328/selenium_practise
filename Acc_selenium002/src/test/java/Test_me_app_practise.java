import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Test_me_app_practise {
	WebDriver driver;
@BeforeTest
public void launch(){

	System.setProperty("webdriver.chrome.driver","C:\\driver9999\\chromedriver.exe");
	driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");

}
@Test
public void about() throws Exception{
	
	Actions act = new Actions(driver);
	 WebElement ab=driver.findElement(By.xpath("/html/body/header/div[2]/div/div/ul/li[3]/a/span"));
	 act.moveToElement(ab);
	 WebElement a=driver.findElement(By.xpath("/html/body/header/div[2]/div/div/ul/li[3]/ul/li/a/span"));
	 act.moveToElement(a);
	 WebElement b=driver.findElement(By.xpath("/html/body/header/div[2]/div/div/ul/li[3]/ul/li/ul/li[1]/a/span"));
	 act.click(b)
	 .build().perform();
	 Set<String> winIds = driver.getWindowHandles();

	  
	  Iterator<String> it = winIds.iterator();

     System.out.println("Total windows - "+ winIds.size());
String parentwindow = it.next();

String childwindow = it.next();

System.out.println(parentwindow);

System.out.println(childwindow);
	driver.switchTo().window(childwindow);
	 driver.switchTo().frame("main_page");
	 WebElement text=driver.findElement(By.xpath("//*[@id='demo3']"));
	 String text1=text.getText();
	 System.out.println(text1);
	 Assert.assertEquals(text1, "Testme Inc.\n123, Velachery Main Road\nChennai, India\nMobile: +91 9898912345\nFax: 84554323\nEmail: info@testmeapp.com");
	 System.out.println("Passed");
	 driver.switchTo().window(parentwindow);
	
	driver.findElement(By.name("products")).sendKeys("h");
	Thread.sleep(2000);
	driver.findElement(By.name("products")).sendKeys("e");
	Thread.sleep(2000);
	driver.findElement(By.name("products")).sendKeys("a");
	Thread.sleep(2000);
	driver.findElement(By.name("products")).sendKeys("d");
	Thread.sleep(2000);
	WebElement r=driver.findElement(By.name("products"));
	Actions act1=new Actions(driver);
	act1.moveToElement(r);
	r.sendKeys(Keys.DOWN);
	r.click();
	driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	





}
}