package day8_AUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider12 {

	public static void main(String[] args) throws Exception {

		WebDriver dr=new FirefoxDriver();
		dr.navigate().to("http://jqueryui.com/slider/");
		dr.manage().window().maximize();
		
		Thread.sleep(2000);
		
		dr.switchTo().frame(0);
		
		// slider element
		WebElement src=dr.findElement(By.xpath("html/body/div/span"));

		Actions sldr=new Actions(dr);
		
		Thread.sleep(2000);
		
		sldr.dragAndDropBy(src, 300, 0).perform();
		Thread.sleep(2000);
		sldr.dragAndDropBy(src, -300, 0).perform();
		
	}

}


