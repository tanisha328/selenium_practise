import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Actions_class {
	WebDriver driver;
@BeforeTest

	     public void launch_browser() {

	          System.setProperty("webdriver.chrome.driver", "C:\\driver9999\\chromedriver.exe");
	          driver = new ChromeDriver();
	          driver.get("http://10.232.237.143:443/TestMeApp/login.htm");

	     }
 @Test(priority=1)
 public void login(){
	 
 driver.findElement(By.name("userName")).sendKeys("lalitha");
 driver.findElement(By.name("password")).sendKeys("password123");
 driver.findElement(By.name("Login")).click();
}
 @Test(priority=2)
 public void category() throws Exception{
	 Actions act = new Actions(driver);
	 WebElement all=driver.findElement(By.xpath("//*[@id='menu3']/li[2]/a/span"));
	 act.moveToElement(all);
	WebElement sub=driver.findElement(By.xpath("/html/body/header/div[2]/div/div/ul/li[2]/ul/li[1]/a/span"));
	act.moveToElement(sub)
	.click().build().perform();
	
	Thread.sleep(3000);
    WebElement ele=driver.findElement(By.xpath("/html/body/header/div[2]/div/div/ul/li[2]/ul/li[1]/ul/li[1]/a/span"));
	 act.click(ele).build().perform();
	 
	 
 }
 @Test(priority=3)
 public void add(){
	 driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	
 }
 @Test(priority=4)
 public void payment(){
	 driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/a[2]")).click();
	 driver.findElement(By.xpath("//*[@id='cart']/tfoot/tr[2]/td[5]/a")).click();
	 driver.findElement(By.xpath("//*[@id='add1']")).sendKeys("26/876,ashok nagar");
	 driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
	 //driver.findElement(By.xpath("//*[@id='swit']/div[1]/div/label/i")).click();
	 driver.findElement(By.xpath("//*[@id='btn']")).click();
 }
}

