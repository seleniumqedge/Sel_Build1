package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links_All {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", 
				              "D:\\Demo\\geckodriver.exe");
		
		// launch App
		WebDriver dr=new FirefoxDriver();
		dr.navigate().to("https://www.icicibank.com/");
		dr.manage().window().maximize();
		
		// identify all links
		List<WebElement>  lks=dr.findElements(By.tagName("a"));
		int rc=lks.size();
		System.out.println("Total links-----"+rc);
		
		
		for (int i = 0; i < rc ; i++) 
		{
		   String	names=lks.get(i).getText();
		   System.out.println(names);
		}
		
	}

}
