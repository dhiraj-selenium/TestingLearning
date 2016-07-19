package helper;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class GetData {
  @Test
  public static String fromExcel(String filePath, String SheetName) 
  {
	String data = null;
	try
	{
		File f = new File(filePath);
		FileInputStream fis = new FileInputStream(f);
		Workbook wbk = WorkbookFactory.create(fis);
		Sheet sh = wbk.getSheet(SheetName);
		int rw = sh.getLastRowNum();
		System.out.println(rw);
		for(int i=1;i<=rw;i++)
		{
		  Row rh = sh.getRow(i);
		  int cl = rh.getLastCellNum();
		  for (int j=0;j<=cl;j++)
		  {
			  Cell c = rh.getCell(j);
			  data = c.toString();
			  System.out.println(data); 
		  }
		 
		}
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return data;
	  
  }
  }


