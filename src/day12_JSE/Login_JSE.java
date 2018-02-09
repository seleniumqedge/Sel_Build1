package day12_JSE;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login_JSE {
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		JavascriptExecutor obj=(JavascriptExecutor)driver;
		
		obj.executeScript("document.getElementById('txtUsername').value=('Admin')");
		obj.executeScript("document.getElementById('txtPassword').value='admin'");
		obj.executeScript("document.getElementById('btnLogin').click()");
  }
}



