package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Mouse_Hover {

	public static void main(String[] args)throws Exception {
		
		WebDriver dr=new FirefoxDriver();
		dr.navigate().to("https://www.emirates.com/in/English/");
		dr.manage().window().maximize();
		
		Thread.sleep(2000);
		// MANAGE
	WebElement	src=dr.findElement(By.xpath(".//*[@id='gnav-manage']/a"));
	
	// LOyalty
	WebElement	src2=dr.findElement(By.xpath(".//*[@id='gnav-loyalty']/a"));
	
	Actions mo=new Actions(dr);
	
	//mo.moveToElement(src).moveToElement(src2).build().perform();
	
	mo.moveToElement(src).perform();
	Thread.sleep(3000);
	
	dr.findElement(By.linkText("Purchase an upgrade")).click();

	}

}



