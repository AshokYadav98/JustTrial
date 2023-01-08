package JavascriptExecutorStudy;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingBYValueUse {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\MY DOCUMENTS\\my new selenium file\\chromedriver_win32\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
			
		driver.manage().window().maximize();
			
		driver.get("https://vctcpune.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,1500)");
	

	}

}
