package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserName extends LaunchBrowser {
  @Test
  public void launch() 
  {
	  WebDriverWait wait = new WebDriverWait(driver, 30);
	  WebElement amazonapp = driver.findElement(By.xpath("//a[text()='Your Amazon.in']"));
	  wait.until(ExpectedConditions.elementToBeClickable(amazonapp));
	  Helper.mouseHover(driver, amazonapp);
	  Helper.leftClick(driver, amazonapp);
	  driver.findElement(By.id("createAccountSubmit")).click();
	  String uname = GetData.fromExcel("E:\\Java_Selenium\\Test\\DataFile\\tdata.xlsx", 1, 0);
	  String email = GetData.fromExcel("E:\\Java_Selenium\\Test\\DataFile\\tdata.xlsx", 1, 1);
	  String pwd = GetData.fromExcel("E:\\Java_Selenium\\Test\\DataFile\\tdata.xlsx", 1, 2);
	  driver.findElement(By.id("ap_customer_name")).sendKeys(uname, Keys.TAB);
	  driver.findElement(By.id("ap_email")).sendKeys(email, Keys.TAB);
	  driver.findElement(By.id("ap_password")).sendKeys(pwd, Keys.TAB);
	  boolean btnStatus = driver.findElement(By.id("continue")).isEnabled();
	  Assert.assertEquals(btnStatus, true);
	  
  }
}
