package day15_Excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Properties_Login {
  @Test
  public void prop() throws IOException 
  {
	  // properties file
	  FileInputStream fis=new FileInputStream("E:\\workspace_Dec14\\SeleniumP_Dec14\\Test.properties");
	  Properties pr=new Properties();
	  pr.load(fis);
	  
	  WebDriver dr; 
		
		dr=new FirefoxDriver();
		dr.get("http://opensource.demo.orangehrmlive.com/");
		dr.manage().window().maximize();
		
		dr.findElement(By.id(pr.getProperty("user"))).sendKeys(pr.getProperty("testdata_un"));
		dr.findElement(By.id(pr.getProperty("psd"))).sendKeys("admin");
		dr.findElement(By.name(pr.getProperty("logbtn"))).click();
  }
}









