package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTAble2 {

	public static void main(String[] args) {
		
		WebDriver dr=new FirefoxDriver();
		dr.navigate().to("https://www.timeanddate.com/worldclock/");
		dr.manage().window().maximize();
		
		for (int i = 1; i <=10; i++) 
		{
			for (int j = 1; j <=3; j++) 
			{
			
			String	path1="html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr[";	
			String path2="]/td[";
			String path3="]";
			
					String names=	dr.findElement(By.xpath(path1+i+path2+j+path3)).getText();
				System.out.print(names+"     ");
			}
			System.out.println();
		}

	}

}
