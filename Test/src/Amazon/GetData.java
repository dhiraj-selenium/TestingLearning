package Amazon;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetData 
{
	public static String fromConfig(String filepath, String key)
	{
		String value = null;
		File f = new File(filepath);
		FileInputStream fis;
		try 
		{
			fis = new FileInputStream(f);
			Properties prop = new Properties();
			prop.load(fis);
			value = prop.getProperty(key);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}	
		return  value;
		
	}
	
	public static String fromExcel(String filepath,int rindex, int colindex)
	{
		String data = null;
		try
		{
			File f = new File(filepath);
			FileInputStream fis = new FileInputStream(f);
			Workbook wbk = WorkbookFactory.create(fis);
			Sheet sh = wbk.getSheet("Sheet1");
			Row rh = sh.getRow(rindex);
			Cell c = rh.getCell(colindex);
			data = c.toString();
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return data;
	}
}
