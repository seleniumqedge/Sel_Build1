package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Spicejet_DropDown {

	public static void main(String[] args) throws Exception {
		
		WebDriver dr=new FirefoxDriver();
		dr.navigate().to("http://spicejet.com");
		dr.manage().window().maximize();
		
		Thread.sleep(2000);
		
		// one way
		dr.findElement(By.xpath(".//*[@id='....trip_1']")).click();
		
		// departure city
		dr.findElement(By.xpath(".//*[@id='......CTXT']")).click();
		Thread.sleep(1000);
		// hyderabad
		dr.findElement(By.linkText("Hyderabad (HYD)")).click();
		Thread.sleep(1000);
		//delhi
		dr.findElement(By.linkText("Delhi (DEL)")).click();
		Thread.sleep(1000);
		// date
		dr.findElement(By.linkText("30")).click();
		
		Thread.sleep(1000);
		// Adults drop down
		new Select(dr.findElement(By.id("ctl00....._Adult")))
		                                     .selectByValue("3");
		
		// child
		Thread.sleep(1000);
		new Select(dr.findElement(By.id("ctl00....._Child")))
										.selectByVisibleText("2");
		
		// INFANT
		new Select(dr.findElement(By.id("ctl00....._Infant")))
		                                       .selectByIndex(1);

		
		

	}

}
