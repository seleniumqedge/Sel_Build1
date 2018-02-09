package day8_AUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Tool_TIP {

	public static void main(String[] args) throws Exception {
		
		WebDriver dr=new FirefoxDriver();
		dr.navigate().to("http://demoqa.com/tooltip/");
		dr.manage().window().maximize();
		
		Thread.sleep(2000);
		
		// text box
		WebElement src=dr.findElement(By.id("age"));
		
		Actions tt=new Actions(dr);
		
		tt.moveToElement(src).perform();  // mouse hover
		
		Thread.sleep(2000);
		
		// tool tip box
		String tool=dr.findElement(By.className("ui-tooltip-content")).getText();
		
		System.out.println(tool);
		

	}

}
