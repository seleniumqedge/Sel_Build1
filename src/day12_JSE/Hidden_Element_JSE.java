package day12_JSE;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Hidden_Element_JSE {
  @Test
  public void hidden() throws Exception {
	  
	  WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://bing.com");
		driver.manage().window().maximize();
		
		//hidden Excel link
		WebElement src=driver.findElement(By.xpath(".//*[@id='officemenu_excel_img']"));
		
		//hidden Calander
		WebElement src2=driver.findElement(By.xpath(".//*[@id='officemenu_calendar_img']"));
				
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", src);
		
		Thread.sleep(2000);
		
		jse.executeScript("arguments[0].click()", src2);
		
		
  }
}
