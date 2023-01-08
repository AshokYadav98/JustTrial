package MultiScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Exa1 {

	public static void main(String[] args) throws IOException 
	{
		 System.setProperty("webdriver.chrome.driver", "F:\\MY DOCUMENTS\\my new selenium file\\chromedriver_win32\\chromedriver.exe");
			
	     WebDriver driver=new ChromeDriver();
			
		 driver.manage().window().maximize();
			
		 driver.get("https://paytm.com/");
		 
		 File Src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		 String random=new  RandomString().make(4);
		 
		 
		 File desti=new File("F:\\\\MY DOCUMENTS\\\\my new selenium file\\\\ScreenShot\\PracSCR"+random+".png");
		 
		 FileHandler.copy(Src, desti);
		 
	}

}
