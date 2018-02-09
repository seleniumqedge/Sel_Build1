package day16_grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Grid_Single_BR {
  
	@Test
  public void f() throws MalformedURLException 
	{
		
		
		DesiredCapabilities capb=null;
		capb=DesiredCapabilities.firefox();
		
		capb.setBrowserName("firefox");
		capb.setPlatform(Platform.WINDOWS);
		
		
		RemoteWebDriver d=new RemoteWebDriver
				(new URL("http://localhost:4444/wd/hub"), capb);
		
		d.get("http://opensource.demo.orangehrmlive.com/");
		
	
		d.manage().window().maximize();
		
		// USername
		d.findElement(By.id("txtUsername")).sendKeys("Admin");
		//password
		d.findElement(By.id("txtPassword")).sendKeys("admin");
		
		//login btn
		d.findElement(By.name("Submit")).click();
	  
  }
}









