package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HiddenLinks_Count {

	public static void main(String[] args) {
		
		WebDriver dr=new FirefoxDriver();
		dr.navigate().to("http://google.com/");
		dr.manage().window().maximize();
		
		// identify links
		List<WebElement> links=dr.findElements(By.tagName("a"));
		System.out.println("Total links are---"+links.size());
		
		int count=0;
		
		for (int i = 0; i < links.size(); i++)
		{
			
			// if link name is not empty ( VISIBLE )
			if(  ! links.get(i).getText().isEmpty())
			{
				count=count+1;   // count++;
			}
			
		}
		
		System.out.println("Visible links are---" + count);
		
		System.out.println("InVisible links are---"+(links.size()-count));
	}

}
