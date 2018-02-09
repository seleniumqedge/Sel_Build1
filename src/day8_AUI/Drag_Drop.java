package day8_AUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) throws Exception {
		
		WebDriver dr=new FirefoxDriver();
		dr.navigate().to("http://jqueryui.com/droppable/");
		dr.manage().window().maximize();
		
		Thread.sleep(2000);
		
		// connect to frame
		dr.switchTo().frame(0);
		
	    WebElement src=dr.findElement(By.id("draggable"));
	    WebElement targ=dr.findElement(By.id("droppable"));
	    
	    Actions dd=new Actions(dr);
	    Thread.sleep(2000);
	    
	    dd.dragAndDrop(src, targ).perform();
	    
	    
	    

	}

}
