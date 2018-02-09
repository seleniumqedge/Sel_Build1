package day17_log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Log4j_TestExe {
  
	@Test
  public void f() 
  {
		
		Logger log=Logger.getLogger(Log4j_TestExe.class);
		
		// Configure XML file
		DOMConfigurator.configure("log4jjj.xml");
		System.setProperty("webdriver.gecko.driver", "D:\\Demo\\geckodriver.exe");
		
	     WebDriver	d=new FirefoxDriver();
	     log.info("Brw Opened");
	     
	     
		d.get("http://opensource.demo.orangehrmlive.com/");
		log.info("URL entered");
		
		d.manage().window().maximize();
		log.info("Br MAximized");
		
		// USername
		d.findElement(By.id("txtUsernamecvbfbvcb")).sendKeys("Admin");
		log.info("Username entered");
		
		//password
		d.findElement(By.id("txtPassword")).sendKeys("admin");
		log.info("Passwd entered");
		
		//login btn
		d.findElement(By.name("Submit")).click();
		log.info("Login Clicked");
		
  }
}
