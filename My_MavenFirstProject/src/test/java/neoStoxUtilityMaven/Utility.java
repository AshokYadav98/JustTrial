package neoStoxUtilityMaven;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.apache.poi.EncryptedDocumentException;
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
	
	//Commenly used methods

	public static String Exelsheetreading(WebDriver driver,int row,int cell) throws EncryptedDocumentException, IOException
	{
		
		Wait(driver,1000);
		File myfile=new File("F:\\MY DOCUMENTS\\my new selenium file\\ExelReaderSetup\\poi-bin-5.2.3\\MyExelWork.xlsx");
		
        String value = WorkbookFactory.create(myfile).getSheet("Sheet6").getRow(row).getCell(cell).getStringCellValue();
		
		Reporter.log("Reading data from exel ", true);
		
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
