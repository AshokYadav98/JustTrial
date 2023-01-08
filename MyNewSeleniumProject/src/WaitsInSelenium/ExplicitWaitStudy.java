package WaitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitStudy {

	public static void main(String[] args) 
	{

		 System.setProperty("webdriver.chrome.driver", "F:\\MY DOCUMENTS\\my new selenium file\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
				
	     driver.manage().window().maximize();
				
	     driver.get("https://vctcpune.com/selenium/practice.html");
	     
	     WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));
	     
	     JavascriptExecutor js = (JavascriptExecutor)driver;
	     
	     js.executeScript("arguments[0].scrollIntoView(true)", checkbox);
	     
	     WebDriverWait w=new WebDriverWait(driver, Duration.ofMillis(1000));
	     
	     w.until(ExpectedConditions.visibilityOf(checkbox));
	     
	    checkbox.click();
	   
	}

}
