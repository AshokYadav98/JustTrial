package neoStoxUtilityMaven;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;



public class UtilityHdfc 
{
	 
	public String key;

	public String readDataFromHdfcDetailsFile() throws IOException
	{
		Properties prop=new Properties();
		
		FileInputStream myfile=new FileInputStream("C:\\Users\\ASHOK\\OneDrive\\Pictures\\Documents\\ASHOK\\.metadata\\.metadata\\.plugins\\.metadata\\.plugins\\My_MavenFirstProject\\src\\HdfcDetails.properties");
		
		prop.load(myfile);
		
		String value = prop.getProperty(key);
		
		Reporter.log("Reading "+key+"from property file", true);
		
		return value;
		
		 
	}
	public void takesScreenshot(WebDriver driver,String name) throws IOException
	{
		Wait(driver, 500);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File desti=new File("F:\\MY DOCUMENTS\\my new selenium file\\ScreenShot\\"+name+".png");
		
		FileHandler.copy(src, desti);
		
		Reporter.log("Taking screenshot ", true);
	}
	
	public void scrollIntoView(WebDriver driver,WebElement element)
	{
		
		Wait(driver, 500);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		
		Reporter.log("scrolling to elements ", true);
	}
	
	public void Wait(WebDriver driver,int waitTime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waitTime));
		
		Reporter.log("waiting for element ", true);
	}

}
