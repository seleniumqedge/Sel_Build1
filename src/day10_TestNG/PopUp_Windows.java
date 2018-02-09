package day10_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;

public class PopUp_Windows {
	WebDriver dr;
	
  @Test
  public void f() {
	  
	String win=  dr.getWindowHandle();
	  System.out.println(win);
	  
	  // BBPS bill pay element
	  dr.findElement(By.xpath(".//*[@id='primary_navigation']/li[5]/a")).click();
	  
	  Sleeper.sleepTightInSeconds(2);
	  
	  // multiple window ids
	Set<String> pops=  dr.getWindowHandles();
	  System.out.println(pops);
	  
	  Object a[]=pops.toArray();
	  
	  String pop_win=a[1].toString();
	  
	  // connect to Pop up window
	  dr.switchTo().window(pop_win);
	  
	  Sleeper.sleepTightInSeconds(2);
	  dr.findElement(By.id("BillerCategoryLists")).sendKeys("DTH");
	  
	  Sleeper.sleepTightInSeconds(2);
	  dr.close();
	  
	// connect  Pop up window to main window
	  dr.switchTo().window(a[0].toString());
	  
	  Sleeper.sleepTightInSeconds(2);
	  // clcik mCash
	  dr.findElement(By.xpath(".//*[@id='primary_navigation']/li[9]/a")).click();
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	   dr=new FirefoxDriver();
		dr.navigate().to("https://www.onlinesbi.com/");
		dr.manage().window().maximize();
		
  }

  @AfterTest
  public void afterTest() {
	  
	  dr.quit();
  }

}
