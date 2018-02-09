package day2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;





public class IE_BR {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "D:\\Demo\\IEDriverServer.exe");
		
		WebDriver d=new InternetExplorerDriver();
		d.get("http://google.com");
		
	
	}

}




