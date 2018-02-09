package day8_AUI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Click {

	public static void main(String[] args) throws Exception {
		
		WebDriver dr=new FirefoxDriver();
		dr.navigate().to("http://google.com");
		dr.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement src=dr.findElement(By.linkText("Gmail"));
		
		Actions rc=new Actions(dr);
		
		rc.contextClick(src).sendKeys("W").build().perform();
		
		Thread.sleep(2000);
		// OR
		
		//rc.contextClick(src).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).click().build().perform();
		
	}

}
