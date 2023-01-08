package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FirstScreenshot {

	public static void main(String[] args) throws IOException 
	{
		 System.setProperty("webdriver.chrome.driver", "F:\\MY DOCUMENTS\\my new selenium file\\chromedriver_win32\\chromedriver.exe");
			
	     WebDriver driver=new ChromeDriver();
			
		 driver.manage().window().maximize();
			
		 driver.get("https://demoqa.com/select-menu");
		 
		 File Src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		 File desti=new File("F:\\MY DOCUMENTS\\my new selenium file\\ScreenShot\\DropdownSCR.jpg");
		 
		 FileHandler.copy(Src, desti);
		 
		 
		 

	}

}
