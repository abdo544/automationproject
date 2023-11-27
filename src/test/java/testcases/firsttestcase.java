package testcases;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class firsttestcase {
	
	
WebDriver driver;



	@BeforeMethod
	public void before() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gggg\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");	
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
	}
	
	@AfterMethod
public void after() {
		
		//driver.quit();
	}
	
	
	
	
  @Test
  public void frames() {
	  
	  driver.switchTo().frame("globalSqa");
	  driver.findElement(By.xpath("//*[@id='mobile_menu_toggler']")).click();
	    	    
 }
 
  
	@Test
	public void register() {
		
	  driver.findElement(By.linkText("Register")).click();
	  driver.findElement(By.xpath("//input [@placeholder='First Name']")).sendKeys("abdo");
	  driver.findElement(By.xpath("//input [@placeholder='Last Name']")).sendKeys("mohamed");
	  driver.findElement(By.xpath("//input [@ng-model='EmailAdress']")).sendKeys("abdo@gmail.com");
	  driver.findElement(By.xpath("//input [@ng-model='Phone']")).sendKeys("01234567890");
	  WebElement gender = driver.findElement(By.xpath("//input [@value='Male']"));
	  gender.click();
	  WebElement cricket = driver.findElement(By.id("checkbox1"));
	  cricket.click();
	  WebElement hockey = driver.findElement(By.id("checkbox2"));
	  hockey.click();
	  
	  WebElement country = driver.findElement(By.xpath("//span [@aria-labelledby='select2-country-container']"));
	  Select countryvalue =new Select(country);
	  countryvalue.selectByVisibleText("Australia");
	  
		 
	  WebElement year = driver.findElement(By.id("yearbox"));
	  Select yearvalue =new Select(year);
	  yearvalue.selectByVisibleText("2009");
	  
	  WebElement month = driver.findElement(By.xpath("//select [@ng-model='monthbox']"));
	  Select monthvalue =new Select(month);
	  monthvalue.selectByVisibleText("February");
	  
	  WebElement day = driver.findElement(By.xpath("//select [@ng-model='daybox']"));
	  Select dayvalue =new Select(day);
	  dayvalue.selectByVisibleText("11");
	  
	  driver.findElement(By.xpath("//input [@ng-model='Password']")).sendKeys("11112222");
	  driver.findElement(By.xpath("//input [@ng-model='CPassword']")).sendKeys("11112222");
	  
	  driver.findElement(By.id("submitbtn")).click();
	  
	}
	
	
	
	
  @Test
  public void windows() {
	  
	  driver.findElement(By.linkText("SwitchTo")).click();
	  driver.findElement(By.linkText("Windows")).click();
	  driver.findElement(By.xpath("//button [@class='btn btn-info']")).click();
	  driver.findElement(By.linkText("Downloads")).click();
 
  }
   
  
}
