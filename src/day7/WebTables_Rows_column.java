package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTables_Rows_column {

	public static void main(String[] args) {
		
		WebDriver dr=new FirefoxDriver();
		dr.navigate().to("https://www.timeanddate.com/worldclock/");
		dr.manage().window().maximize();
		
		for (int i = 1; i < 30 ; i++) 
		{
			 String value="html/body/..........div[1]/table/tbody/tr["+i+"]/td[5]";
			
			String names=dr.findElement(By.xpath(value)).getText();
			System.out.println(names);
		}

	}

}

