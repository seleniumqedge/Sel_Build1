package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Alerts_Handles {

	public static void main(String[] args) {
		
		WebDriver dr=new FirefoxDriver();
		dr.navigate().to("http://irctc.co.in");
		dr.manage().window().maximize();
		
		// login btn
		dr.findElement(By.id("loginbutton")).click();
		
		String alert_name=dr.switchTo().alert().getText();
		System.out.println(alert_name);
		
		Sleeper.sleepTightInSeconds(2);
		
		// OK button in alert
		dr.switchTo().alert().accept();
	}

}
