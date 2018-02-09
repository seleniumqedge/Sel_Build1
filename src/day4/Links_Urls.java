package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links_Urls {

	public static void main(String[] args) {
		
		WebDriver dr=new FirefoxDriver();
		dr.navigate().to("http://newtours.demoaut.com/");
		dr.manage().window().maximize();
		
		List<WebElement> links=dr.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		
		for (int i = 0; i < links.size(); i++) 
		{
			links.get(i).click();
			
			String src=dr.getCurrentUrl();
			 System.out.println(src);
			 
			 dr.navigate().back();
			 
			 links=dr.findElements(By.tagName("a"));
			 
		}
		
		
		
		

	}

}
