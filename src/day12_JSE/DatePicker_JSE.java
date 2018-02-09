package day12_JSE;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class DatePicker_JSE {
 
	WebDriver driver;
	
	@Test
  public void f() throws Exception {
	  
	  driver=new FirefoxDriver();
		driver.get("http://www.cleartrip.com/");
		driver.manage().window().maximize();
		Sleeper.sleepTightInSeconds(3);
		
		//click one way radio
		driver.findElement(By.id("OneWay")).click();
		
		driver.findElement(By.id("FromTag")).sendKeys
		     ("Hyderabad, IN - Rajiv Gandhi International (HYD)");
		
		driver.findElement(By.id("ToTag")).sendKeys
		        ("New Delhi, IN - Indira Gandhi Airport (DEL)");
		
		
      Thread.sleep(2000);
	JavascriptExecutor obj=(JavascriptExecutor)driver;
				
    obj.executeScript("document.getElementById('DepartDate').value='Mon, 20 May, 2019'");
				
     driver.findElement(By.id("SearchBtn")).click();
				
  }
}
