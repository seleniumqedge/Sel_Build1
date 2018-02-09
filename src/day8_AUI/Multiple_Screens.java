package day8_AUI;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiple_Screens {

	public static void main(String[] args) throws IOException {
		
		WebDriver dr=new FirefoxDriver();
		dr.navigate().to("http://newtours.demoaut.com/");
		dr.manage().window().maximize();
		
		// all links
		List<WebElement> links=dr.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		
		for (int i = 0; i < links.size(); i++) 
		{
			String names=links.get(i).getText();
			
			links.get(i).click();
			
		File	src=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("E:\\dummy\\"+names+".png"));
		
		
		dr.navigate().back();
		 
		 links=dr.findElements(By.tagName("a"));

		}
	}

}








