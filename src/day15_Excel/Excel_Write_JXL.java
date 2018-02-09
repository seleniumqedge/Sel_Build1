package day15_Excel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.testng.annotations.Test;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Excel_Write_JXL {
  @Test
  public void f() throws IOException, RowsExceededException, WriteException {
	  
	  FileOutputStream fos=new FileOutputStream("E:\\workspace_oct12\\Excels\\output.xls");
	  WritableWorkbook wb=Workbook.createWorkbook(fos);
	 WritableSheet ws= wb.createSheet("output", 0);
	 
	 Label un=new Label(3, 2, "passsssssssz");
	 ws.addCell(un);
	 
	 wb.write();
	 wb.close();
	  
  }
}




