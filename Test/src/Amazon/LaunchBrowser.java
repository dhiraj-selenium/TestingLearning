package Amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;


public class LaunchBrowser 
{

  public WebDriver driver;
  @BeforeMethod
  public void BrowserLaunch() 
  {
	  String browserName = GetData.fromConfig("E:\\Java_Selenium\\Test\\DataFile\\Config.Properties.txt", "Browser");
	  String url = GetData.fromConfig("E:\\Java_Selenium\\Test\\DataFile\\Config.Properties.txt", "URL");
	  if(browserName.equals("FF"))
	  {
		  driver = new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		  driver.get(url);
		  
	  }
  }
  
}
