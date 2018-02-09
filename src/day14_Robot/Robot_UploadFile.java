package day14_Robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Robot_UploadFile {
  @Test
  public void f() throws InterruptedException, AWTException {
	  
	 
	  
	  WebDriver dr=new FirefoxDriver();
		
		dr.navigate().to("http://toolsqa.com/automation-practice-form/");
		dr.manage().window().maximize();
		Thread.sleep(2000);
		
		//select req file path
		StringSelection src=new StringSelection("D:\\Demo\\xyz.png");
		
		//copy file path
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(src, null);
		
		// Browse Button
				dr.findElement(By.xpath(".//*[@id='photo']")).click();
				Thread.sleep(3000);
				
				// Robot class
				Robot robo=new Robot();
				
				// press ENTER btn
				robo.keyPress(KeyEvent.VK_ENTER);
				 robo.keyRelease(KeyEvent.VK_ENTER);
				
				 Thread.sleep(2000);
				
				 // press Cltr + V
				robo.keyPress(KeyEvent.VK_CONTROL);
				robo.keyPress(KeyEvent.VK_V);
				
				robo.keyRelease(KeyEvent.VK_V);
				robo.keyRelease(KeyEvent.VK_CONTROL);
				
				Thread.sleep(3000);
				
				robo.keyPress(KeyEvent.VK_ENTER);
				 robo.keyRelease(KeyEvent.VK_ENTER);		
		
  }
}
