package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Customized_Xpath {
	
	WebDriver dr;
	
	public void launch() throws Exception
	{
		 dr=new FirefoxDriver();
		dr.navigate().to("http://amazon.com");
		dr.manage().window().maximize();
		
		Thread.sleep(2000);
	}
	
	public void xpath()
	{
		dr.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("java");
	}

	public static void main(String[] args) throws Exception {
		
		Customized_Xpath obj=new Customized_Xpath();
		
		obj.launch();
		obj.xpath();
		

	}

}
