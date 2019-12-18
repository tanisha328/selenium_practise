package Acc_selenium01;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
	public void user_id() throws Exception{
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
	  Set<String> winIds = driver.getWindowHandles();

	  
	  Iterator<String> it = winIds.iterator();

      System.out.println("Total windows - "+ winIds.size());

 

      String parentwindow = it.next();

String childwindow = it.next();

System.out.println(parentwindow);

System.out.println(childwindow);

driver.switchTo().window(childwindow);

   driver.findElement(By.linkText("Personal")).click();

      String str1=driver.getTitle();

      System.out.println(str1);

 

 

      //driver.switchTo().defaultContent();

      Thread.sleep(2000);

 

      driver.switchTo().window(parentwindow);

      driver.switchTo().frame(0);

      //                    driver.findElement(By.xpath("/html/body/form/table[2]/tbody/tr/td[2]/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[2]/table/tbody/tr[6]/td[2]/a/img")).click();

   driver.findElement(By.xpath("//img[@alt='continue']")).click();

   }

 

}
	