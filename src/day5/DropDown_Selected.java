package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDown_Selected {

	public static void main(String[] args) throws Exception {
		
		WebDriver dr=new FirefoxDriver();
		dr.navigate().to("http://newtours.demoaut.com");
		dr.manage().window().maximize();
		
		Thread.sleep(2000);
		
		dr.findElement(By.linkText("REGISTER")).click();
		
		// identify Drop down
		WebElement drop=dr.findElement(By.name("country"));
		
		// identify elements from Drop down
		List<WebElement> items=drop.findElements(By.tagName("option"));
		System.out.println(items.size());
		
		Thread.sleep(2000);
		
		for (int i = 0; i < items.size(); i++)
		{
			 String name=items.get(i).getText();
			
			
			items.get(i).click();
			
			 // if element is selected
			if(items.get(i).isSelected())
			{
				System.out.println("Element is working--- "+name);
			}
			else
			{
				System.out.println("Element is not working--- " + name);
			}
			
		}
		

	}

}
