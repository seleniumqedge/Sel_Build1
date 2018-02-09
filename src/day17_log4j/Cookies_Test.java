package day17_log4j;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Cookies_Test {
  @Test
  public void f() {
	  
	  WebDriver d=new FirefoxDriver();
		d.navigate().to("https://www.paytm.com/");
		d.manage().window().maximize();
		
		 Set<Cookie> cooks=d.manage().getCookies();
		 System.out.println(cooks.size());
		 
		Iterator<Cookie> ck= cooks.iterator();
		ck.next();
		 Sleeper.sleepTightInSeconds(3);
		 
		 while (ck.hasNext())
		 {
			 Cookie pk=ck.next();
			 
			 System.out.println(pk.getDomain()+"-----"
			            +pk.getName()+"-------"+pk.getExpiry());
			 
		}
		 
		 
		 d.manage().deleteAllCookies();
		 
		 Sleeper.sleepTightInSeconds(3);
		 
		 cooks=d.manage().getCookies();
		 System.out.println(cooks.size());
	  	
  }
}
