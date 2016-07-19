package Amazon;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Autoit extends LaunchBrowser {
  @Test
  public void download() {
	  driver.findElement(By.xpath("//img[@alt='Download AutoIt' and @title='Download AutoIt']")).click();
	  try 
	  {
		Runtime.getRuntime().exec("E:\\Java_Selenium\\Test\\AutoIT\\Autoitfile.exe");
	  } 
	  catch (IOException e) 
	  {
		e.printStackTrace();
	  }
  }
}
