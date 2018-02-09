package day10_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class NewTest {
 
	@Test(priority=0)
  public void f() {
	  System.out.println("C/A");
  }
  
  @Test(priority=1, enabled=false)
  public void a() {
	  System.out.println("login");
  }
  
  @Test(priority=1)
  public void f23() {
	  System.out.println("chg.psd");
  }
  @Test(priority=2)
  public void f12() {
	  System.out.println("C/A");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Launch");
  }

  @AfterMethod
  public void afterTest() {
	  System.out.println("close");
  }
  
  
  @BeforeClass
  public void beforeT() {
	  System.out.println("START");
  }

  @AfterClass
  public void afterT() {
	  System.out.println("STOP");
  }

}
