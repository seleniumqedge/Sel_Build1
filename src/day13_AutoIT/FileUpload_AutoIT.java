package day13_AutoIT;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FileUpload_AutoIT {
  @Test
  public void f() throws IOException, Exception {
	  
	  WebDriver dr=new FirefoxDriver();
		
		dr.navigate().to("http://toolsqa.com/automation-practice-form/");
		dr.manage().window().maximize();
		Thread.sleep(2000);
		
		// Browse Button
		dr.findElement(By.xpath(".//*[@id='photo']")).click();
		Thread.sleep(3000);
		
		// AutoIT for File Upload
		Runtime.getRuntime().exec("E:\\workspace_Dec14\\SeleniumP_Dec14\\AutoIT\\UploadFile12.exe");
		
		
	  
  }
}
