package day11_waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Implicit_Wait {
  
	WebDriver d;

	@Test
  public void implicit() throws Exception {
	  
	   d=new FirefoxDriver();
		d.navigate().to("https://www.online.citibank.co.in/");
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//Thread.sleep(20000);
		
		//click LOGIN NOW button
				d.findElement(By.xpath(".//*[@id='container']/div[2]/div[2]/div/div[1]/div[1]/p[2]/a[1]/img")).click();
				
				
  }
}
