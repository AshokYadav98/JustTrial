package NokariBase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import Utilitynokari.Utility;

public class BaseClass 
{
    protected static WebDriver driver;
	public void launchBrowser() throws IOException
	{
		
	    System.setProperty("webdriver.chrome.driver", "F:\\MY DOCUMENTS\\my new selenium file\\chromedriver_win32\\chromedriver.exe");
	
        driver=new ChromeDriver();
	
	    driver.manage().window().maximize();
	
	    driver.get("https://www.naukri.com/");
	
	    Reporter.log("Launching the browser ", true);

	}
	
	

}
