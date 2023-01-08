package POMStudy_UpstoxWithExel;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class CommonlyUsedMethods 
{
	public void TakeScreenshot(WebDriver driver,String name) throws IOException
	{
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		 File desti=new File("F:\\MY DOCUMENTS\\my new selenium file\\ScreenShot\\SCREEN"+name+".jpg");
		 
		 FileHandler.copy(src, desti);
	}
	public void Scrolling(WebDriver driver,WebElement UID)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)",UID );
	}
}
