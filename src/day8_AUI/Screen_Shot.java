package day8_AUI;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screen_Shot {

	public static void main(String[] args)throws Exception {
		
		WebDriver dr=new FirefoxDriver();
		dr.navigate().to("http://jqueryui.com/slider/");
		dr.manage().window().maximize();
		
		Thread.sleep(2000);
		
		// screen shot
		File src=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("E:\\New folder\\screennn.jpg"));
		
	}

}



