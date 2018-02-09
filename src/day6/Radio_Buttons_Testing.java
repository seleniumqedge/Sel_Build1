package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Radio_Buttons_Testing {

	@Test
	public void aaa(){
		
		WebDriver dr=new FirefoxDriver();
		dr.navigate().to("http://echoecho.com/htmlforms10.htm");
		dr.manage().window().maximize();
		
		// identify 2 radios
		List<WebElement> radios=dr.findElements(By.name("group1"));
		System.out.println(radios.size());
		
		for (int i = 0; i < radios.size(); i++) 
		{
			String names=radios.get(i).getAttribute("value");
			
		String src=	radios.get(i).getAttribute("checked");
		
		System.out.println(names+"-----"+src);
		
		}	
	}
}






