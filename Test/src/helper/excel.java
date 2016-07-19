package helper;

import org.testng.annotations.Test;

public class excel {
  @Test
  public void test()
  {
	  String Val = GetData.fromExcel("E:\\Java_Selenium\\Test\\DataFile\\tdata.xlsx", "Sheet1");
	  System.out.println("The row val is : - "+Val);
  }
}
