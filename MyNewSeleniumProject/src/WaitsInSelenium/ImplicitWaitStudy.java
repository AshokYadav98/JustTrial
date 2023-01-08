package WaitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitStudy {

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver", "F:\\MY DOCUMENTS\\my new selenium file\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
				
	     driver.manage().window().maximize();
				
	     driver.get("https://vctcpune.com/selenium/practice.html");
	     
	     WebElement Textbox = driver.findElement(By.id("autocomplete"));
	     
	     JavascriptExecutor js = (JavascriptExecutor)driver;
	     
	     js.executeScript("arguments[0].scrollIntoView(true)",Textbox);
	     
	     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100000));
	     
	    Textbox.sendKeys("Ashok");
	     
	     
	     

	}

}
