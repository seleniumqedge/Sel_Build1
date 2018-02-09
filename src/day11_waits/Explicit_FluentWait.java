package day11_waits;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class Explicit_FluentWait {
  @Test
  public void f() {
	  
	  WebDriver  d=new FirefoxDriver();
		d.navigate().to("https://paytm.com/");
		d.manage().window().maximize();
		
		FluentWait<WebDriver> obj=new FluentWait<WebDriver>(d)
				    .withTimeout(120, TimeUnit.SECONDS)
				    .pollingEvery(3, TimeUnit.SECONDS)
				    .ignoring(NoSuchElementException.class);
		
	  obj.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/div/div[3]/div/div[4]/div[1]/div[1]/div/div[3]/div/div[4]/a/img"))).click();
	  
	  
  }
}
