package day11_waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Explicit_WebDriverWait {
  @Test
  public void f() {
	  
	        WebDriver  d=new FirefoxDriver();
			d.navigate().to("https://paytm.com/");
			d.manage().window().maximize();
			
			WebDriverWait wait=new WebDriverWait(d, 120);
			
			// identify element from scrolling adds
			wait.until(ExpectedConditions.visibilityOfElementLocated
					(By.xpath("html/body/div[1]/div/.......div/div[4]/a/img"))).click();
			
			
			
			
  }
}






