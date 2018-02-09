package day13_AutoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DownloadFile_AutoIT {
  @Test
  public void f() throws InterruptedException, IOException {
	  
	  WebDriver dr=new FirefoxDriver();
		dr.navigate().to("http://www.seleniumhq.org/download/");
		dr.manage().window().maximize();
		
		Thread.sleep(2000);
		
		// click download version link .... 3.8.1
		dr.findElement(By.xpath(".//*[@id='mainContent']/p[3]/a")).click();
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("E:\\workspace_Dec14\\AutoIT\\savefile.exe");
		
		
		
  }
}
