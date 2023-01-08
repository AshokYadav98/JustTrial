package neoStoxPOM;

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

public class UtilityProperties 
{
	
	//Commenly used methods

	public static String ReadDataFromPropertyFile(String key) throws IOException
	{
		Properties prop=new Properties();
		
		FileInputStream myfile=new FileInputStream("C:\\Users\\ASHOK\\OneDrive\\Pictures\\Documents\\ASHOK\\.metadata\\.metadata\\.plugins\\.metadata\\.plugins\\My_MavenFirstProject\\src\\MavenProjectProperty.properties");
		
	     prop.load(myfile);
	     
	    String value = prop.getProperty(key);
	    Reporter.log("Reading"+key+"from property file", true);
	    
	    return value;
	     
	     
	
	}
		
	
	public static void Screenshot(WebDriver driver ,String name) throws IOException
	{
		
		Wait(driver,500);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File desti=new File("F:\\MY DOCUMENTS\\my new selenium file\\ScreenShot\\"+name+".png");
		
		FileHandler.copy(src, desti);
		
		Reporter.log("Taking screenshot", true);
		
	}
	public static void ScrollIntoView(WebDriver driver,WebElement element)
	{
		Wait(driver,500);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		
		Reporter.log("Scrolling at element", true);
	}
	public static void Wait(WebDriver driver,int waittime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waittime));
		
		Reporter.log("waiting for element", true);
	}


	

}
