package neoStoxBase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import neoStoxUtilityMaven.UtilityProperties;

public class HdfcBase 
{
	 protected static WebDriver driver;
		
	 public void Launchbrowser() throws InterruptedException, IOException
	 {
       System.setProperty("webdriver.chrome.driver", "F:\\MY DOCUMENTS\\my new selenium file\\chromedriver_win32\\chromedriver.exe");
		
	    driver=new ChromeDriver();
	    
	    
	    driver.manage().window().maximize();
		
		driver.get(UtilityProperties.ReadDataFromPropertyFile("url"));
		
		Reporter.log("Launching the browser ", true);
		
		
		
		
	 
	 }
}
