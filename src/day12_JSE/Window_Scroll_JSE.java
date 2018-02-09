package day12_JSE;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Window_Scroll_JSE{
  @Test
  public void f() throws Exception {
	  
	  WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://www.seleniumhq.org/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,600)");
		
  }
}



