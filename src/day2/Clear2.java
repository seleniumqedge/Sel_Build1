package day2;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Clear2 {

	public static void main(String[] args) {
		
	
	
		System.setProperty("webdriver.gecko.driver", "D:\\Demo\\geckodriver.exe");
	
		WebDriver driver=new FirefoxDriver();
		
		
		//System.out.println("step exe");
		
		
		driver.navigate().to("http://google.com");
		driver.manage().window().maximize();
		
		// search box
		driver.findElement(By.id("lst-ib")).sendKeys("selenium");
		
		//Sleeper.sleepTightInSeconds(2);
		
		driver.findElement(By.id("lst-ib")).clear();
		
		//Sleeper.sleepTightInSeconds(2);
		
		driver.findElement(By.id("lst-ib")).sendKeys("qtp");
		
		System.out.println("jekjewkrj");
		

	}

}
