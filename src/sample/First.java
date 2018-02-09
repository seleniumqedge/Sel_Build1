package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class First {

	public static void main(String[] args) {
		
		WebDriver dr; 
		
		dr=new FirefoxDriver();
		dr.get("http://opensource.demo.orangehrmlive.com/");
		dr.manage().window().maximize();
		
		dr.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");
		dr.findElement(By.id("txtPassword")).sendKeys("admin");
		dr.findElement(By.name("Submit")).click();
	}

}
