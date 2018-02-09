package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Check_Boxes {

	public static void main(String[] args)throws Exception {
		
		WebDriver dr=new FirefoxDriver();
		dr.navigate().to("http://echoecho.com/htmlforms09.htm");
		dr.manage().window().maximize();

		// identify check boxes
		List<WebElement> checks=dr.findElements(By.xpath
				  ("//td[@class='table5']/input[@type='checkbox']"));
		System.out.println(checks.size());
		
		
		Thread.sleep(2000);
		
		for (int i = 0; i < checks.size(); i++) 
		{
			// if check box is not selected
			if (  ! checks.get(i).isSelected()) 
			{
				checks.get(i).click();
			}
			else
			{
				System.out.println(checks.get(i).getAttribute("value"));
			}
		}	
	}

}