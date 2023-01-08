package neoStoxBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Base
{
	 protected WebDriver driver;
	
	public void Launchbrowser() throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver", "F:\\MY DOCUMENTS\\my new selenium file\\chromedriver_win32\\chromedriver.exe");
		
	    driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://neostox.com/");
		
		Reporter.log("Launching the browser ", true);
		
	}

}
