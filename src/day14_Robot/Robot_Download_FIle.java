package day14_Robot;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Robot_Download_FIle {
  @Test
  public void f() throws Exception {
	  
	  WebDriver dr=new FirefoxDriver();
		dr.navigate().to("http://www.seleniumhq.org/download/");
		dr.manage().window().maximize();
		
		Thread.sleep(2000);
		
		// click download version link .... 3.8.1
		dr.findElement(By.xpath(".//*[@id='mainContent']/p[3]/a")).click();
		Thread.sleep(3000);
		
		 Robot obj=new Robot();
		 obj.delay(2000);
		 
		 obj.keyPress(KeyEvent.VK_TAB);
		 obj.keyRelease(KeyEvent.VK_TAB);
		 obj.delay(2000);
		 
		 obj.keyPress(KeyEvent.VK_ENTER);
		 obj.keyRelease(KeyEvent.VK_ENTER);
		
  }
}





