package day15_Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excel_JXL_Login {
  @Test
  public void f() throws BiffException, IOException {
	  
	  String path="E:\\workspace_Dec14\\SeleniumP_Dec14\\TestData\\test.xls";
	  
	  FileInputStream fis=new FileInputStream(path);
	Workbook  wb= Workbook.getWorkbook(fis);
	 Sheet ws=wb.getSheet("Sheet1");
	
	  WebDriver dr; 
		
		dr=new FirefoxDriver();
		dr.get(ws.getCell(0, 1).getContents());
		dr.manage().window().maximize();
		
		dr.findElement(By.id("txtUsername")).sendKeys(ws.getCell(1, 1).getContents());
		dr.findElement(By.id("txtPassword")).sendKeys(ws.getCell(2, 1).getContents());
		dr.findElement(By.name("Submit")).click();
	  
  }
}
