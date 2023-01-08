package Utilitynokari;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility 
{

	public static String readingPropertiFile(String key) throws IOException
	{
		Properties prop=new Properties();
		
		FileInputStream myfile= new FileInputStream("C:\\Users\\ASHOK\\OneDrive\\Pictures\\Documents\\ASHOK\\.metadata\\.metadata\\.plugins\\.metadata\\.plugins\\My_MavenFirstProject\\src\\NokariFile.properties");
		
	    prop.load(myfile);
	    
	    String value = prop.getProperty(key);
	     
	    Reporter.log("reading "+key+" from property file",true);
	     
	    return value;
	
	}
	
	public static String readingDataFromExelSheet(int row ,int cell) throws EncryptedDocumentException, IOException
	{
		File myfile=new File("F:\\MY DOCUMENTS\\my new selenium file\\ExelReaderSetup\\poi-bin-5.2.3\\MyExelWork.xlsx");
	
	    Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet10");
	    
	    String value = mysheet.getRow(row).getCell(cell).getStringCellValue();
	     
	    Reporter.log("reading data from exel sheet",true);
	    
	    return value;
	}
	
	public static void screenShot(WebDriver driver) throws IOException
	{
		wait(driver, 1000);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File desti=new File("F:\\MY DOCUMENTS\\my new selenium file\\ScreenShot\\NokariSCR.jpg");
		
		FileHandler.copy(src, desti);
		
		Reporter.log("taking screenshot",true);
	}
	
	public static void scrolling(WebDriver driver,WebElement element)
	{
		wait(driver, 1000);
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		js.executeScript("arguments[0].scrollIntoView (true)",element);
		
		Reporter.log("scrolling to element",true);
	}
	
	public static void wait(WebDriver driver,int waittime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waittime));
		
		Reporter.log("waiting for element",true);
	}
	

}
