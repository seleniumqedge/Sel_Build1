package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Header_Links {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver",
            //                  "D:\\Demo\\geckodriver.exe");

		WebDriver dr=new FirefoxDriver();
		dr.navigate().to("http://bing.com");
		dr.manage().window().maximize();
		
		//identify  header
		WebElement block= dr.findElement(By.id("sc_hdu"));
		
		// identify links from header
		List<WebElement> lks=block.findElements(By.tagName("a"));
		System.out.println(lks.size());
		
		for (int i = 0; i < lks.size(); i++) 
		{
			System.out.println(lks.get(i).getText());
		}
		

	}

}
