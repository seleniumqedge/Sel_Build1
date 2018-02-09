package day15_Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Excel_Multiple {
  @Test
  public void f() throws IOException {
	  
	  String path="E:\\workspace_Dec14\\SeleniumP_Dec14\\TestData\\links.xlsx";
	  String path2= "E:\\workspace_Dec14\\SeleniumP_Dec14\\TestData\\output.xlsx";
	  
	  // excel App
	  FileInputStream fis=new FileInputStream(path);
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	   XSSFSheet ws=wb.getSheet("Sheet1");
	  
	   // launch App
	   WebDriver dr=new FirefoxDriver();
	     dr.get("http://newtours.demoaut.com/");
	     dr.manage().window().maximize();
	     
	  int   rc= ws.getLastRowNum();
	  System.out.println(rc);
	  
	  for (int i = 1; i <= rc ; i++) 
	  {
		  // click link
		  dr.findElement(By.linkText(ws.getRow(i).getCell(0).getStringCellValue())).click();
	
		  String act_url=dr.getCurrentUrl();

		  // write data in sheet
		  ws.getRow(i).createCell(2).setCellValue(act_url);
		  
		  String exp_res=ws.getRow(i).getCell(1).getStringCellValue();
		  
		  if(exp_res.equals(act_url))
		  {
			  ws.getRow(i).createCell(3).setCellValue("PASSSS");
		  }
		  else
		  {
			  ws.getRow(i).createCell(3).setCellValue("FAIL");
		  }

		  dr.navigate().back();
		  
		}
	  
	  FileOutputStream fos=new FileOutputStream(path2);
	  wb.write(fos);
	  
	 fos.close();
  }
  }









