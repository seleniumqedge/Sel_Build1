package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Visible_Links_Urls {

	public static void main(String[] args) {
		
		WebDriver dr=new FirefoxDriver();
		dr.navigate().to("http://google.com/");
		dr.manage().window().maximize();
		
		// identify links
		List<WebElement> links=dr.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++) 
		{
			// if link name is not empty ( VISIBLE )
			if(  ! links.get(i).getText().isEmpty())
			{
				links.get(i).click();
				
				System.out.println(dr.getCurrentUrl());
				
				dr.navigate().back();
				
				links=dr.findElements(By.tagName("a"));
				
			}
			else
			{
				System.out.println("it is Invisible----" + i);
			}
		}
	}

}
