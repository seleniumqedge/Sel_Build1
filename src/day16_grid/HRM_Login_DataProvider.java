package day16_grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HRM_Login_DataProvider {
	
	@DataProvider()
	public Object[][] getData()
	{
		Object[][] data=new Object[2][3];
		
		data[0][0]="qedge123";
		data[0][1]="qedgetech123";
		data[0][2]="chrome";
		
		data[1][0]="qedge123";
		data[1][1]="qedgetech123";
		data[1][2]="firefox";
		
		return data;
		
	}
	
	@Test(dataProvider="getData")
	
	public void loginTest(String u,String p,String b) throws 
	                                       MalformedURLException
	{
		System.out.println(b);
		DesiredCapabilities cap=null;
		
		if(b.equals("firefox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		else if(b.equals("chrome"))
		{
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		}
		
		else if(b.equals("iexplore"))
		{
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("iexplore");
			cap.setPlatform(Platform.MAC);
		}
	
		RemoteWebDriver d=new RemoteWebDriver(new URL
				          ("http://localhost:4444/wd/hub"),cap);
        
		
		d.get("http://opensource.demo.orangehrmlive.com/");
		//d.manage().window().maximize();
		Sleeper.sleepTightInSeconds(2);
		
		// USername
		d.findElement(By.id("txtUsername")).sendKeys(u);
		//password
		d.findElement(By.id("txtPassword")).sendKeys(p);
		
		//login btn
		d.findElement(By.name("Submit")).click();
	}

}



