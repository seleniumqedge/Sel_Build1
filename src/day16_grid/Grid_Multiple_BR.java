package day16_grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Grid_Multiple_BR {
  
	@Parameters("browser")
	
	@Test
  public void grid_browser(String br) throws MalformedURLException 
	{
		System.out.println(br);
		
		DesiredCapabilities capb=null;
		
		if(br.equals("firefox"))
		{
			capb=DesiredCapabilities.firefox();
			capb.setBrowserName("firefox");
			capb.setPlatform(Platform.WINDOWS);
			
		}
		else if(br.equals("chrome"))
		{
			capb=DesiredCapabilities.chrome();
			capb.setBrowserName("chrome");
			capb.setPlatform(Platform.LINUX);
			
		}
		else if(br.equals("iexplore"))
		{
			capb=DesiredCapabilities.internetExplorer();
			capb.setBrowserName("iexplore");
			capb.setPlatform(Platform.MAC);
			
		}
		else if(br.equals("safari"))
		{
			capb=DesiredCapabilities.safari();
			capb.setBrowserName("safari");
			capb.setPlatform(Platform.SNOW_LEOPARD);
			
		}
		
		
		RemoteWebDriver d=new RemoteWebDriver(new URL
				         ("http://localhost:4444/wd/hub"), capb);
		
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










