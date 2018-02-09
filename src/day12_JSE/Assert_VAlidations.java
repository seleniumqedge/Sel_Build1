package day12_JSE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_VAlidations {
  @Test
  public void f() {
	  
	    WebDriver dr=new FirefoxDriver();
		dr.manage().window().maximize();
		dr.navigate().to("http://opensource.demo.orangehrmlive.com/");
		
		String exp="OrangeHRM";
		
		 String act=dr.getTitle();
		 System.out.println(act);
		 
		 Assert.assertEquals(act, exp);
		 
		 System.out.println("TC DONE");
		 
  }
}







