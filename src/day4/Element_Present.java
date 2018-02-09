package day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Element_Present {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver",
				                  "D:\\Demo\\geckodriver.exe");
		
		WebDriver dr=new FirefoxDriver();
		dr.navigate().to("http://google.co");
		dr.manage().window().maximize();
		
		// get page source code
		String src=dr.getPageSource();
		System.out.println(src);
		
		if(src.contains("Gmail"))
		{
			System.out.println("Elemenet is present");
		}
		else
		{
			System.out.println("Elemenet is not present");
		}
	
	}

}
