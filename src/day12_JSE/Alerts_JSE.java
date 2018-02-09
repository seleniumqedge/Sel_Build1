package day12_JSE;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Alerts_JSE {
  @Test
  public void f() {
	  
	  WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://google.com");
		driver.manage().window().maximize();
		
		
		JavascriptExecutor obj=(JavascriptExecutor)driver;
		obj.executeScript("alert('ram')");
		
		Sleeper.sleepTightInSeconds(2);
		
		driver.switchTo().alert().accept();
		
		System.out.println("TC DONE");
		
  }
}








