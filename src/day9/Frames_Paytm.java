package day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Frames_Paytm {

	public static void main(String[] args) {
		
		WebDriver dr=new FirefoxDriver();
		dr.manage().window().maximize();
		dr.navigate().to("https://paytm.com");
		
		
		Sleeper.sleepTightInSeconds(2);
		
		// login
		dr.findElement(By.xpath(".//*[@id='app']/div...div[3]/div[3]/div")).click();
		
		// identify frames
	 List<WebElement>	frames=dr.findElements(By.tagName("iframe"));
	 System.out.println(frames.size());
	 
	 Sleeper.sleepTightInSeconds(2);
	 
	// dr.switchTo().frame(0);
	 
	  // OR
	 
	for (int i = 0; i < frames.size(); i++) 
	{
		// connect to frame
		dr.switchTo().frame(i);
		try {
			
			 dr.findElement(By.id("input_0")).sendKeys("123222222");
			 dr.findElement(By.id("input_1")).sendKeys("123222222");
			 dr.findElement(By.xpath(".//*[@id='loginForm']")).click();
		
			 break;
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
	
	// frame to window
	dr.switchTo().defaultContent();
	
	// mobile number element in main window
	// dr.findElement(By.id("input")).sendKeys("12121212");
	 
	 
	}

}
