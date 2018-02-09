package day8_AUI;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screens_comparision{

	public static void main(String[] args) throws IOException {
		
		WebDriver dr=new FirefoxDriver();
		dr.navigate().to("http://newtours.demoaut.com/");
		dr.manage().window().maximize();
		
		File src=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		
		dr.get("http://google.com");
		
		File src12=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		
		if (FileUtils.contentEquals(src, src12)) 
		{
			System.out.println("Screens are same");
		}
		else
		{
			System.out.println("Screens are not same");
		}

	}

}
