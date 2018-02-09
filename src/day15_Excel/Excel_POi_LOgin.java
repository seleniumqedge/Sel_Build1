package day15_Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Excel_POi_LOgin {
  @Test
  public void f() throws IOException {
	  
	  FileInputStream fis=new FileInputStream("E:\\workspace_Dec14\\test12.xlsx");
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
     XSSFSheet	ws=  wb.getSheetAt(0);
     
     WebDriver dr=new FirefoxDriver();
     dr.get(ws.getRow(1).getCell(0).getStringCellValue());
     dr.manage().window().maximize();
		
		dr.findElement(By.id("txtUsername")).sendKeys(ws.getRow(1).getCell(1).getStringCellValue());
		dr.findElement(By.id("txtPassword")).sendKeys(ws.getRow(1).getCell(2).getStringCellValue());
		dr.findElement(By.name("Submit")).click();
     
     
     
	  
  }
}
