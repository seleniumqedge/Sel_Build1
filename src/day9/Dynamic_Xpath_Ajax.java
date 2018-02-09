package day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Dynamic_Xpath_Ajax {

	public static void main(String[] args) {
		
		WebDriver dr=new FirefoxDriver();
		dr.navigate().to("https://in.yahoo.com");
		dr.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(2);
		
		// search box
		dr.findElement(By.id("uh-search-box")).sendKeys("today");
		
		Sleeper.sleepTightInSeconds(2);
		
		// ajax elements
		List<WebElement> ajaxs=dr.findElements(By.xpath
				            ("//*[starts-with(@id,'yui_3_18_0_3_15149')]/li"));
		System.out.println(ajaxs.size());
		Sleeper.sleepTightInSeconds(2);
		
		//ajaxs.get(1).click();
		
		//  OR
		
		for (int i = 0; i < ajaxs.size(); i++) 
		{
			if(ajaxs.get(i).getText().equals("today gold rate"))
			{
				Sleeper.sleepTightInSeconds(2);
				ajaxs.get(i).click();
				break;
			}
		}
		
	}

}
