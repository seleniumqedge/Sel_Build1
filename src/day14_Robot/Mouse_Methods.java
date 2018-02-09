package day14_Robot;

import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Mouse_Methods {
  @Test
  public void f() throws Exception {
	  
	  WebDriver dr=new FirefoxDriver();
		dr.navigate().to("http://www.seleniumhq.org/");
		dr.manage().window().maximize();
		
		Thread.sleep(2000);
		
		Dimension size=Toolkit.getDefaultToolkit().getScreenSize();
		System.out.println(size);
		
		Robot rb=new Robot();
		
		rb.mouseMove(770, 170);
		
		Thread.sleep(2000);
		
		rb.mousePress(InputEvent.BUTTON1_MASK);
		rb.mouseRelease(InputEvent.BUTTON1_MASK);
		
		rb.delay(2000);
		
		rb.mouseWheel(600);
		
		Thread.sleep(2000);
		
		rb.mouseWheel(-600);
  }
}










