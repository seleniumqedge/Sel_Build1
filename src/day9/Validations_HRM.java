package day9;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Validations_HRM {
	
	WebDriver dr;
	
	public void launchApp( String url) throws IOException
	{
		dr=new FirefoxDriver();
		dr.manage().window().maximize();
		dr.navigate().to(url);
		
		String exp="Orangehrm";
		
		 String act=dr.getTitle();
		 System.out.println(act);
		 
		 if(exp.equals(act))
		 {
			 System.out.println("Launch TC is PASSSSS");
		 }
		 else
		 {
			File src= ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("D:\\launchS.png")); 
			
			
			 System.out.println("Launch TC is FAIL");
		 }
	}
	
	

	public static void main(String[] args) throws IOException {
		
		Validations_HRM obj=new Validations_HRM();
		
		obj.launchApp("http://opensource.demo.orangehrmlive.com");
		

	}

}
